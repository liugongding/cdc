package com.dingding.cdc.util;

import java.io.Serializable;
import java.util.List;


/**
 * @author liudingding
 * @date 2016/1/14
 */
public class PageBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private int pageCode;

    /**
     * 总页数 = 总记录数/每页显示的记录数
     */
    private int totalPage;

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     *每页显示的记录数
     */
    private int pageSize;

    /**
     * 每页显示的数据
     */
    private List<T> beanList;

}
