package udb.gl.moneytransfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@EntityScan(basePackages = {"udb.gl"},basePackageClasses = {TransferApplication.class})
@ComponentScan(basePackages = {"udb.gl"})
@ServletComponentScan(basePackages = {"udb.gl"})
@SpringBootApplication
public class TransferApplication  implements CommandLineRunner {

    @Autowired
    PasswordEncoder encoder;

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(TransferApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(encoder.encode("passer"));
    }
}
