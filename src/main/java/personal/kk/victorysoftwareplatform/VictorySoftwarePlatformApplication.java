package personal.kk.victorysoftwareplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {MybatisAutoConfiguration.class, DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "personal.kk.victorysoftwareplatform.mapper")
public class VictorySoftwarePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(VictorySoftwarePlatformApplication.class, args);
    }

}
