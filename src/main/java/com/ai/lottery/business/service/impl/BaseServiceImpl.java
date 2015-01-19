package com.ai.lottery.business.service.impl;

import com.ai.lottery.core.dao.Criteria;
import com.ai.lottery.business.domain.httpVo.BaseRequest;
import com.ai.lottery.core.dao.Page;
import com.ai.lottery.core.utils.CheckNull;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;


/**
 * 服务基类
 *
 * @author peiyu
 */
public abstract class BaseServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(BaseServiceImpl.class);

    /**
     * 成功
     */
    protected static final String SUCCESS = "0000";
    /**
     * 数据库错误
     */
    protected static final String SQL_ERROR = "0001";
    /**
     * 参数错误
     */
    protected static final String PARAM_ERROR = "0002";

    /**
     * 更新数据库记录失败
     */
    protected static final String UPDATE_ERROR = "0003";

    /**
     * 用户名已经存在
     */
    protected static final String USER_EXISTS = "0004";

    /**
     * 未登录
     */
    protected static final String NO_LOGIN = "0005";

    /**
     * 图片处理出错
     */
    protected static final String IMG_ERROR = "0006";

    /**
     * 文章substance表或者substanceDetail表信息不全不能获得完整的详情
     */
    protected static final String SUBSTANCE_DETAIL_GET_ERROR = "0007";
    /**
     * 其他错误
     */
    protected static final String OTHER_ERROR = "9999";

    /**
     * 升序
     */
    protected static final String ASC = " ASC";

    /**
     * 降序
     */
    protected static final String DESC = " DESC";

    /**
     * 表示正常状态
     */
    protected static final String STATE_NORMAL = "0";

    /**
     * 表示失效状态
     */
    protected static final String STATE_INVALID = "1";

    /**
     * 创建查询条件对象
     *
     * @param request 请求对象
     * @return 查询条件对象
     */
    protected Criteria createCriteria(final BaseRequest request) {
        Criteria example = null;
        Integer pageSize = request.getPageSize();
        Long page = request.getPage();
        if (CheckNull.isNull(page)) {
            log.debug("不需要分页.....");
            example = new Criteria();
        } else {
            if (CheckNull.isNull(pageSize) || 0 == pageSize) {
                pageSize = Integer.valueOf(10);
            }
            log.debug("需要分页,查询第{}页, 每页{}条...", page, pageSize);
            example = new Criteria(new Page(pageSize * (page - 1), pageSize));
        }
        return example;
    }


    public boolean isIOS(String picName) {
        if (StringUtils.isBlank(picName))
            return false;
        else
            return !picName.contains(".");
    }

    protected Long getPage(BaseRequest request) {
        return CheckNull.isNull(request.getPage()) ? 1L : request.getPage();
    }

    /**
     * 检查对象是否为空，如果为空，直接抛出NullPoint异常
     *
     * @param obj          需要检查的对象
     * @param errorMessage 异常信息
     */
    protected void checkAndThrow(Object obj, String errorMessage) {
        Objects.requireNonNull(obj, errorMessage);
    }
}
