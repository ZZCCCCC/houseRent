package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/02/04/23:00
 * @Description: 分页对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageSimple<T> {
    //当前页
    private Integer currentPage;
    // 总数
    private Integer totalNumber;
    // 列表
    private List<T> list;
    // 其他数据
    private Map<String,Object> map;

}
