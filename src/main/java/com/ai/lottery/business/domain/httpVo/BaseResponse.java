package com.ai.lottery.business.domain.httpVo;


import com.ai.lottery.core.domain.entity.StringAndEqualsObject;

/**
 * http响应对象基类
 *
 * @author peiyu
 */
public class BaseResponse extends StringAndEqualsObject {

    private static final long serialVersionUID = 8872668062752393816L;

    /*
     * 返回结果代码
     */
    private String resultCode;

    /*
     * 返回结果描述
     */
    private String resultDesc;

    /*
     * 总页数
     */
    private Long total;

    /*
     * 当前页
     */
    private Long page;

    /**
     * 总记录数
     */
    private Long count;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
