package wangkai.graduationProject.service;

import wangkai.graduationProject.entity.User;

public interface UserService {
    public User userLogin(String uName,String pwd);

    public void insert(String uName, String pwd, String phone, String uid);


}
