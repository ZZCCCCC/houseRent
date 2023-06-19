package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 赵智超
 * @date: 2023/01/31/18:07
 * @Description:用户
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

   private int userId;
   private String username;
   private String password;
   private String nickname;
   private Long  phoneNumber;
   private City city;
   private Role role;

}
