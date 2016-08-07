import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by yogesh on 8/7/16.
 */

@EnableAutoConfiguration
public class Application {

    public static void main(String... args){
        SpringApplication.run(Application.class, args);
    }
}
