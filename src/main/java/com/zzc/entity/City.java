package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/02/03/9:21
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private Integer cityId;
    private String cityName;
    private String cityAbbreviation;
    private String cityCenter;
}
