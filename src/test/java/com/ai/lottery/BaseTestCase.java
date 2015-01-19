/**
 * @Title: BaseTestCase.java
 * @Package com.ailk
 * @Description: junit测试基础类
 * @author linyl linyuliang.85@gmail.com
 * @version V1.0
 */
package com.ai.lottery;

import com.ai.lottery.business.listener.SystemConfigListener;
import com.ai.lottery.core.listener.SystemStartupListener;
import com.ai.lottery.core.utils.CipherUtils;
import com.ai.lottery.core.utils.JSONUtil;
import com.google.common.collect.Maps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.nutz.lang.Lang;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author linyl linyuliang.85@gmail.com
 * @ClassName: BaseTestCase
 * @Description: junit测试基础类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml", "classpath*:/spring/applicationContext-mvc.xml"})
public abstract class BaseTestCase {
    /**
     * Ï
     *
     * @Fields LOGGER : 日志操作类
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTestCase.class);

    @Autowired
    private WebApplicationContext wac;

    protected MockMvc mvc;

    @Autowired
    private SystemStartupListener systemInterfaceListener;

    @Autowired
    private SystemConfigListener systemConfigListener;

    /**
     * @Title: beforeClass
     * @Description: 单元测试最开始执行的方法，在测试类实例化前执行,只执行一次
     */
    @BeforeClass
    public static void beforeClass() {
        LOGGER.debug("@BeforeClass");
    }

    /**
     * @Title: afterClass
     * @Description: 单元测试最终执行的方法，在测试类实例化前执行,只执行一次
     */
    @AfterClass
    public static void afterClass() {
        LOGGER.debug("@AfterClass");
    }

    /**
     * @Title: before
     * @Description: 具体测试用例执行前的方法，每个用例执行前执行一次
     */
    @Before
    public void before() {
        LOGGER.debug("@Before");
        this.mvc = MockMvcBuilders.webAppContextSetup(wac).build();
        this.systemInterfaceListener.startup();
        this.systemConfigListener.startup();
    }

    /**
     * @Title: after
     * @Description: 具体测试用例执行后的方法，每个用例执行后执行一次
     */
    @After
    public void after() {
        LOGGER.debug("@After");
    }

    /**
     * 测试本机get请求
     *
     * @param url    服务相对地址
     * @param params 参数
     */
    protected void testGet(String url, Map<String, String> params) {
        try {
            MockHttpServletRequestBuilder builder = get(url).characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON);
            if (!Lang.isEmpty(params)) {
                Set<String> strings = params.keySet();
                for (String key : strings) {
                    builder.param(key, params.get(key));
                }
//                params.forEach((key, value) -> builder.param(key, value));
            }
            this.mvc.perform(builder).andDo(print());
        } catch (Exception e) {
            LOGGER.error("测试get请求异常", e);
        }
    }

    /**
     * 测试本机post请求
     *
     * @param url   服务相对地址
     * @param json  json格式的参数
     * @param files 上传的文件
     */
    protected void testPost(String url, String json, List<File> files) {
        try {
            LOGGER.debug("文件上传......");
            MockMultipartHttpServletRequestBuilder builder = fileUpload(url);
            if (!Lang.isEmpty(files)) {
                for (File file : files) {
                    builder.file(new MockMultipartFile("files", file.getName(), "jpg", new FileInputStream(file)));
                }
            }
            builder.param("data", json);
            this.mvc.perform(builder).andDo(print());
        } catch (Exception e) {
            LOGGER.error("测试post请求异常", e);
        }
    }

    /**
     * 测试本机post请求
     *
     * @param url  服务相对地址
     * @param json json格式的参数
     */
    protected void testPost(String url, String json) {
        try {
            this.mvc.perform(post(url).content(json).characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON)).andExpect(status().is(200)).andDo(print());
        } catch (Exception e) {
            LOGGER.error("测试post请求异常", e);
        }
    }

    /**
     * 测试可控post接口
     *
     * @param safeLevel   安全级别 0不加密 1AES加密
     * @param serviceName 服务名称，对应接口中header里的值
     * @param json        数据报文
     */
    protected void testSafePost(Integer safeLevel, String serviceName, String json) {
        String data = "";
        try {
            switch (safeLevel) {
                case 0:
                    data = json;
                    break;
                case 1:
                    String temp = CipherUtils.encrypt(json);
                    Map<String, String> param = Maps.newHashMap();
                    param.put("data", temp);
                    data = JSONUtil.toJson(param);
                    break;
                default:
                    break;
            }
            this.mvc.perform(post("/core/postCtrl").header("serviceName", serviceName).content(data).characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON)).andExpect(status().is(200)).andDo(print());
        } catch (Exception e) {
            LOGGER.error("测试post请求异常", e);
        }
    }

    /**
     * 测试可控post接口
     *
     * @param safeLevel   安全级别 0不加密 1AES加密
     * @param serviceName 服务名称，对应接口中header里的值
     * @param json        数据报文
     * @param files       上传的文件
     */
    protected void testSafePost(Integer safeLevel, String serviceName, String json, List<File> files) {
        try {
            String data = "";
            LOGGER.debug("文件上传......");
            MockMultipartHttpServletRequestBuilder builder = fileUpload("/core/postCtrl");
            builder.header("serviceName", serviceName);
            if (!Lang.isEmpty(files)) {
                for (File file : files) {
                    builder.file(new MockMultipartFile("files", file.getName(), "jpg", new FileInputStream(file)));
                }
            }
            switch (safeLevel) {
                case 0:
                    data = json;
                    break;
                case 1:
                    String temp = CipherUtils.encrypt(json);
                    Map<String, String> param = Maps.newHashMap();
                    param.put("data", temp);
                    data = JSONUtil.toJson(param);
                    break;
                default:
                    break;
            }
            builder.param("data", data);
            this.mvc.perform(builder).andDo(print());
        } catch (Exception e) {
            LOGGER.error("测试post请求异常", e);
        }
    }

}
