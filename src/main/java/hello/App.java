package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by gukserg on 04.03.17.
 */
@SpringBootApplication
public class App {

    public static void main(String args[]) {
        SpringApplication.run(App.class, args).toString();
    }
}
