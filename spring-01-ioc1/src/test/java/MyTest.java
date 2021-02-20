import com.spring5.service.UserService;
import com.spring5.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
