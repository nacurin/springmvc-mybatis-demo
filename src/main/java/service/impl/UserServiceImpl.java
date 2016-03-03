package service.impl;

import mapper.UserMapper;
import model.User;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Roger on 2015/9/17.
 */
@Service("userService2")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}