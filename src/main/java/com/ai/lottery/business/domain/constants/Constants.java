package com.ai.lottery.business.domain.constants;

public abstract class Constants {
    /**
     * 活动的排序类型:0:距离；1：最新；2：最热；
     */
    public static final String GET_CAMPAIGN_SORT_HOT = "2";
    /**
     * 活动的排序类型:0:距离；1：最新；2：最热；
     */
    public static final String GET_CAMPAIGN_SORT_DISTANCE = "0";
    /**
     * 活动的排序类型:0:距离；1：最新；2：最热；
     */
    public static final String GET_CAMPAIGN_SORT_NEWEST = "1";
    /**
     * 室内或者室外：0：室外；1：室内；
     */
    public static final String GET_CAMPAIGN_CLASSIFY_OUTDOOR = "0";
    /**
     * 室内或者室外：0：室外；1：室内；
     */
    public static final String GET_CAMPAIGN_CLASSIFY_INDOOR = "1";
    /**
     * 点赞类别：1活动 2心愿单 3评论
     */
    public static final String LIKE_TYPE_ACTIVITY = "1";
    /**
     * 点赞类别：1活动 2心愿单 3评论
     */
    public static final String LIKE_TYPE_WISH_LIST = "2";
    /**
     * 点赞类别：1活动 2心愿单 3评论
     */
    public static final String LIKE_TYPE_REVIEW = "3";
}