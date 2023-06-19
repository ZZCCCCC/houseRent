package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/01/31/20:17
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    //状态码
    private Integer status;
    //错误的状态信息

    private String message;
    //数据
    private Object data;
}
