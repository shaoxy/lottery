package com.ai.lottery.business.domain.entity;

import com.ai.lottery.core.domain.entity.StringAndEqualsObject;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: WxUserPond
* @Description: wx_user_pond表对应的java bean类
* @author: peiyu
 */
public class WxUserPond extends StringAndEqualsObject implements Serializable {
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields wx_user_pond.USER_POND_ID :奖池用户列表ID_UUID
     */
    private String userPondId;

    /**
     * @Fields wx_user_pond.OPEN_ID :微信用户的OPENID
     */
    private String openId;

    /**
     * @Fields wx_user_pond.NICK_NAME :昵称
     */
    private String nickName;

    /**
     * @Fields wx_user_pond.SEX :用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    private Short sex;

    /**
     * @Fields wx_user_pond.HEAD_IMG_URL :用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    private String headImgUrl;

    /**
     * @Fields wx_user_pond.STATE :0正常，1不可用
     */
    private Short state;

    /**
     * @Fields wx_user_pond.SUBSCRIBE_TIME :关注时间
     */
    private String subscribeTime;

    /**
     * @Fields wx_user_pond.CREATE_TIME :创建时间
     */
    private Date createTime;

    /**
     * @Fields wx_user_pond.UPDATE_TIME :更新时间
     */
    private Date updateTime;

    /**
     * @return wx_user_pond.USER_POND_ID : 返回 奖池用户列表ID_UUID
     */
    public String getUserPondId() {
        return userPondId;
    }

    /**
     * @param userPondId of wx_user_pond : 设置 奖池用户列表ID_UUID
     */
    public void setUserPondId(String userPondId) {
        this.userPondId = userPondId == null ? null : userPondId.trim();
    }

    /**
     * @return wx_user_pond.OPEN_ID : 返回 微信用户的OPENID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId of wx_user_pond : 设置 微信用户的OPENID
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * @return wx_user_pond.NICK_NAME : 返回 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName of wx_user_pond : 设置 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * @return wx_user_pond.SEX : 返回 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    public Short getSex() {
        return sex;
    }

    /**
     * @param sex of wx_user_pond : 设置 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * @return wx_user_pond.HEAD_IMG_URL : 返回 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * @param headImgUrl of wx_user_pond : 设置 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    /**
     * @return wx_user_pond.STATE : 返回 0正常，1不可用
     */
    public Short getState() {
        return state;
    }

    /**
     * @param state of wx_user_pond : 设置 0正常，1不可用
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * @return wx_user_pond.SUBSCRIBE_TIME : 返回 关注时间
     */
    public String getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * @param subscribeTime of wx_user_pond : 设置 关注时间
     */
    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime == null ? null : subscribeTime.trim();
    }

    /**
     * @return wx_user_pond.CREATE_TIME : 返回 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime of wx_user_pond : 设置 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return wx_user_pond.UPDATE_TIME : 返回 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime of wx_user_pond : 设置 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}