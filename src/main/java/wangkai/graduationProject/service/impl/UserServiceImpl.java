package wangkai.graduationProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wangkai.graduationProject.entity.User;
import wangkai.graduationProject.mapper.UserMapper;
import wangkai.graduationProject.service.UserService;

import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User userLogin(String uName, String pwd) {
        User loginUser = userMapper.userLogin(uName, pwd);
        if (uName.equals(loginUser.getUName()) && pwd.equals(loginUser.getPwd())) {
            return loginUser;
        } else if (loginUser.getBanned()) {
            return null;
        }else return null;
    }

    @Override
    public void insert(String uName, String pwd, String phone, String uid) {
        UUID uuid = UUID.randomUUID();
        uid = uuid.toString();
        userMapper.userReg(uName, pwd, phone, uid);

    }


}
