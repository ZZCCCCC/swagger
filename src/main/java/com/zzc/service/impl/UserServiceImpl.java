package com.zzc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzc.entity.User;
import com.zzc.mapper.UserMapper;
import com.zzc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: 赵智超
 * @date: 2023/07/05/22:16
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
