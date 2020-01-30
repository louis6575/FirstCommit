import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.suport.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {
    @Test
    publicc void testSpring() {
        // 获取运用上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取SpringTest类
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        // 调用sayHello方法
        springTest.sayHello();
    }

    public void sayHello() {
        System.out.println("Hello Kris!");
    }
}