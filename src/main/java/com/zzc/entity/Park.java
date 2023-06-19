package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/03/12/12:13
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Park {
    private int parkId;
    private Estate estate;
    private int parkNum;
}
