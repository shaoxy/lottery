package com.ai.lottery.core.controller.converter;

import com.ai.lottery.business.cache.StrategyCache;
//import com.ai.lottery.business.domain.entity.TdMSystemInterface;
import com.ai.lottery.core.controller.strategy.Strategy;
import com.ai.lottery.core.utils.CheckNull;
import com.ai.lottery.core.utils.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

/**
 * 加解密请求参数转换器
 * @author peiyu
 */
@Service("cipherHttpMessageConverter")
public class CipherHttpMessageConverter extends AbstractHttpMessageConverter<Object> {
    @Override
    protected boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    protected Object readInternal(Class<?> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(Object o, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

    }

    /*private static final Logger log = LoggerFactory.getLogger(CipherHttpMessageConverter.class);

    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private static final String SERVICE_NAME = "serviceName";

    private SystemInterfaceCache systemInterfaceCache = SystemInterfaceCache.me();

    private StrategyCache strategyCache = StrategyCache.me();

    public CipherHttpMessageConverter(){
        super(new MediaType("application", "json", UTF_8), new MediaType("application", "*+json", UTF_8));
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        Object result = null;

        HttpHeaders httpHeaders = inputMessage.getHeaders();
        log.debug("headers:{}", httpHeaders);
        List<String> list = httpHeaders.get(SERVICE_NAME);

        InputStream inputStream = inputMessage.getBody();
        String body = StreamUtils.copyToString(inputStream, UTF_8);
        log.debug("原始报文:{}", body);

        if(!CheckNull.isNull(list)) {
            String serviceName = list.get(0);
            log.debug("serviceName:{}", serviceName);
            //从缓存获取接口相关信息
            TdMSystemInterface systemInterface = this.systemInterfaceCache.getCacheByKey(serviceName);
            Integer level;
            if(CheckNull.isNull(systemInterface)) {
                level = 0;
            } else {
                level = systemInterface.getSecretLevel();
            }

            //从缓存获取解密策略
            Strategy strategy = this.strategyCache.getCacheByKey(level);
            if(!CheckNull.isNull(strategy)) {
                //执行解密
                Object object = strategy.invoke(body);
                body = (String) object;
            }
        }
        try {
            result = JSONUtil.toBean(body, clazz);
        } catch (Exception e) {
            log.error("格式化数据异常:", e);
        }
        return result;
    }

    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        OutputStream out = outputMessage.getBody();
        String text = JSONUtil.toJson(obj);
        byte[] bytes = text.getBytes(UTF_8);
        out.write(bytes);
    }*/
}
