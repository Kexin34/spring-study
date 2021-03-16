import com.kexin.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理所代理的是接口，所以用UserService强转
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
