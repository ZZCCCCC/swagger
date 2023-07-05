package com.zzc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: 赵智超
 * @date: 2023/07/05/22:16
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
