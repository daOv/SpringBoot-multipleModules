package damir.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//first error nastaje jer ne vidi repository jer je u drugom modulu
@EnableJpaRepositories(basePackages = {"damir"})
//second error is the same stuff just for entity
@EntityScan(basePackages = {"damir"})
@ComponentScan(basePackages = {"damir"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
}
