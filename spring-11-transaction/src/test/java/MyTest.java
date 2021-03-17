import com.kexin.mapper.UserMapper;
import com.kexin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapper");
        List<User> userList = mapper.selectUser();

        for (User user : userList){
            System.out.println(user);
        }
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapper");
        List<User> userList = mapper.selectUser();
        for (User user : userList){
            System.out.println(user);
        }
    }
}
