import com.kexin.pojo.Student;
import com.kexin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

//        System.out.println(student.getName());
        student.show();

    }
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user);
    }
    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user2");
        User user2 = (User) context.getBean("user2");//第二次getBean
        System.out.println(user==user2);
    }



}
