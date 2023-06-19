package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/02/20/14:34
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Build {
    private int buildId;
    private String buildName;
    private Estate estate;
}
