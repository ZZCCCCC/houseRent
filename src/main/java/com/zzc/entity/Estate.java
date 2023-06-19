package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 赵智超
 * @date: 2023/02/12/17:02
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estate {
  private  int estateId;
  private String estateName;
  private String estateAddress;
  private City city;
}
