package com.z.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.z.dao.user.UserDao;
import com.z.entity.user.User;
import com.z.service.user.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zming
 * @since 2020-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
