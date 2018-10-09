package ram.dctm.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.emc.documentum.springdata.repository.config.EnableDctmRepositories;

import ram.dctm.repository.EbiprdRepository;
@Configuration
@EnableAutoConfiguration
@EnableDctmRepositories

@SpringBootApplication
public class Application implements CommandLineRunner {


    /**
     * Main method
     *
     * @param args command line args
     */
	@Autowired
	EbiprdRepository ebiprdRepository ;

    public static void main(String[] args){
        //SpringApplication.run(Application.class, args);
        
        SpringApplication app = new SpringApplication(Application.class);
     
        //app.setBanner(banner);
        app.run(args);
        
        
    }
    
   
    @Override
    public void run(String... args) {

       System.out.println("Hello Spring Data");
       
       ebiprdRepository.findAll();
       // System.exit(0);
    }
}