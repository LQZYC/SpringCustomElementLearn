import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User 昶乐 Date 16/5/14 Time 00:44
 */
public class SpringCustomElementTest {

    public static void main(String args[]) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("test.xml");
        User user = (User) bf.getBean("testbean");
        System.out.println(user.getUserName() + "," + user.getEmail());
    }
}
