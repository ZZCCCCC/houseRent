package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/03/14/14:59
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomType {
    private int roomTypeId;
    private String roomTypeName;
}
