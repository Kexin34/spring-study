import com.kexin.pojo.User;
import com.kexin.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("u2");

        //调用对象的方法 .
        user.show();
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT userT = (UserT) context.getBean("userT");
        userT.show();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT userT = (UserT) context.getBean("userT");
        userT.show();
    }
}
