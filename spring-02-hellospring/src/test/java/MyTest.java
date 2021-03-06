import com.kexin.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        // 解析beans.xml文件 , 获取spring的上下文对象，生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象现在都在spring中的管理了，我们要使用，直接去里面取出来就可以！
        // getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }


}
