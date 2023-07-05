package com.zzc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: 赵智超
 * @date: 2023/07/05/21:59
 * @Description:
 */
@Data
@TableName("user")
public class User {
    @TableId
    private Long id;
    private String name;
    private String phone;
    private String sex;
    @TableField("id_number")
    private String isNumber;
    private String avatar;
    private int status;
}
