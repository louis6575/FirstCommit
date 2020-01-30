package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description: spring的配置类，相当于applicationContext.xml的作用
 * @Author: Kris
 * Date: 2020/1/27 14:46
 */

//@Configuration("springConfiguration")
@Component
@PropertySource(value = "classpath:jdbc.properties")
@Import(JdbcConfig.class)
public class SpringConfiguration {
}
