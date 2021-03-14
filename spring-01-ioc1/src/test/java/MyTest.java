import com.kexin.dao.UserDaoMysqlImpl;
import com.kexin.dao.UserDaoOracleImpl;
import com.kexin.service.UserService;
import com.kexin.service.UserServiceImpl;
import org.junit.Test;

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
}
