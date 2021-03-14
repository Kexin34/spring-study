import com.kexin.dao.UserDaoMysqlImpl;
import com.kexin.dao.UserDaoOracleImpl;
import com.kexin.service.UserService;
import com.kexin.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        // 用户实际调用的是业务层，dao层他们不需要接触
        UserService userService = new UserServiceImpl();

        //因为接口里没有set方法，所以被强转
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();

        //那我们现在又想用Oracle去实现
        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();

    }

    @Test
    public void test2(){
        // 获取ApplicationContext，拿到spring的容器
        // 解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 容器在售，需要什么，就直接get什么！参数用的是id
        //这里相当于将原来的Service层也IOC了，不需要再在代码中写出调用哪个接口，只需要在配置文件中指明调用的接口即可。
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");

        serviceImpl.getUser();

        //原来的步骤
        //UserService userService = new UserServiceImpl();
        //userService.setUserDao(new UserDaoMysqlImpl());//原先需要在代码中调用特定的方法
        //userService.getUser();
    }

}
