package com.ai.lottery.core.interceptor;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import com.ai.lottery.core.dao.Page;

/**
 * @ClassName: MySqlPaginationPlugin
 * @Description: mybatis的分页插件
 * @author linyl linyuliang.85@gmail.com
 */
@Intercepts({ @Signature(type = Executor.class, method = "query",
    args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class }) })
public class MySqlPaginationPlugin extends PaginationBasePlugin {
    @Override
    protected String paginationSql(String sql, Page page) {
        StringBuilder pageSql = new StringBuilder();
        pageSql.append(sql);
        pageSql.append(" limit ").append(page.getBegin()).append(",").append(page.getLength());
        return pageSql.toString();
    }

    @Override
    protected String totalCountSql(String sql) {
        return "select count(1) from (" + sql + ") as total_count";
    }

    @Override
    protected String orderbySql(String sql, String orderByClause) {
        if (StringUtils.isNotBlank(orderByClause)) {
            return sql + " order by " + orderByClause;
        } else {
            return sql;
        }
    }
}
