import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * User 昶乐 Date 15/12/6 Time 16:30
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
