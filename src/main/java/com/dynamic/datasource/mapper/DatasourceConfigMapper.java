package com.dynamic.datasource.mapper;

import com.dynamic.datasource.config.MyMapper;
import com.dynamic.datasource.model.DatasourceConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DatasourceConfigMapper extends MyMapper<DatasourceConfig> {
}
