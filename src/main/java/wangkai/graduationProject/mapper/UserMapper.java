package wangkai.graduationProject.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import wangkai.graduationProject.entity.User;

@Mapper
public interface UserMapper {
    @Select("select  * from user where uName=#{uname}")
    User userLogin(String uname,String pwd);

    @Insert("insert into user (uid, uname, phone, pwd)  VALUES(#{uid},#{uName},#{phone},#{pwd})")
    void userReg(@Param("uName") String uName, @Param("pwd") String pwd, @Param("phone") String phone,@Param("uid") String uid);
}
