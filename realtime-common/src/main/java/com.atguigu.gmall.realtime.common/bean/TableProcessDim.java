package com.atguigu.gmall.realtime.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小天
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableProcessDim {
    //来源表名
    String sourceTable;

    // 目标表名
    String sinkTable;

    //输出字段
    String sinkColumns;

    //数据到 Habase 的列族
    String sinkFamily;

    //sink 到 habase 的时候的主键字段
    String sinkRowKey;

    //配置表操作类型
    String op;
}
