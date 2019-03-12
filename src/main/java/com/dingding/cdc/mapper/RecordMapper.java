package com.dingding.cdc.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author liudingding
 * @date 2019/1/13
 */

@Mapper
public interface RecordMapper {
    /**
     * 查询数据库所有信息
     * @return
     */
    String getAll();
}
