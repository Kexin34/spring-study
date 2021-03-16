import com.kexin.config.KexinConfig;
import com.kexin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        // 如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KexinConfig.class);
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.getName());
    }
}
