package com.ai.lottery.business.domain.constants;

/**
 * @ClassName: TWxUserPond
* @Description: wx_user_pond表结构对应的常量类，定义字段名常量
* @author: peiyu
 */
public abstract class TWxUserPond {
    /**
     * @Fields wx_user_pond.USER_POND_ID: 奖池用户列表ID_UUID
     */
    public static final String USER_POND_ID = "USER_POND_ID";

    /**
     * @Fields wx_user_pond.OPEN_ID: 微信用户的OPENID
     */
    public static final String OPEN_ID = "OPEN_ID";

    /**
     * @Fields wx_user_pond.NICK_NAME: 昵称
     */
    public static final String NICK_NAME = "NICK_NAME";

    /**
     * @Fields wx_user_pond.SEX: 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    public static final String SEX = "SEX";

    /**
     * @Fields wx_user_pond.HEAD_IMG_URL: 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    public static final String HEAD_IMG_URL = "HEAD_IMG_URL";

    /**
     * @Fields wx_user_pond.STATE: 0正常，1不可用
     */
    public static final String STATE = "STATE";

    /**
     * @Fields wx_user_pond.SUBSCRIBE_TIME: 关注时间
     */
    public static final String SUBSCRIBE_TIME = "SUBSCRIBE_TIME";

    /**
     * @Fields wx_user_pond.CREATE_TIME: 创建时间
     */
    public static final String CREATE_TIME = "CREATE_TIME";

    /**
     * @Fields wx_user_pond.UPDATE_TIME: 更新时间
     */
    public static final String UPDATE_TIME = "UPDATE_TIME";
}