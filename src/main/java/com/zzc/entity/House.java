package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/03/12/12:11
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
    private int roomId;
    private int roomNum;
    private String roomArea;
    private Build build;
    private RoomType roomType;


}
