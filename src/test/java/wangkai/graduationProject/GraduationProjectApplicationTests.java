package wangkai.graduationProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import wangkai.graduationProject.mapper.UserMapper;

import java.util.UUID;

@SpringBootTest
class GraduationProjectApplicationTests {

    UserMapper userMapper ;
    @Test
    public void insert(String uName, String pwd, String phone, String uid) {

        UUID uuid = UUID.randomUUID();
        uid = uuid.toString();
        userMapper.userReg("wangkai", "123456", "15332705655", uid);

    }

}
