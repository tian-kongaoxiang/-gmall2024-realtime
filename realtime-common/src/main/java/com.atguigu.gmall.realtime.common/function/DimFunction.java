package com.atguigu.gmall.realtime.common.function;

import com.alibaba.fastjson.JSONObject;
/**
 * @author 小天
 */
public interface DimFunction<T> {
    String getRowKey(T bean);
    String getTableName();
    void addDims(T bean, JSONObject dim);
}

