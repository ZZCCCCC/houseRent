package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/03/28/18:51
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class userHouse {
    private int userHouseId;
    private House house;
    private User user;
}
