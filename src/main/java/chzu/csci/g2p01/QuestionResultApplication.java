package chzu.csci.g2p01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("chzu.csci.g2p01.mapper")
public class QuestionResultApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionResultApplication.class, args);
    }

}
