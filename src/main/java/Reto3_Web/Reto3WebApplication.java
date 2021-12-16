//modelo
//interface
//repositorio
//servicio
//controlador
package Reto3_Web;

import Reto3_Web.interfaces.InterfaceFragance;
import Reto3_Web.interfaces.InterfaceUser;
import Reto3_Web.repositorio.OrderRepositorio;
import Reto3_Web.repositorio.UserRepositorio;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class Reto3WebApplication implements CommandLineRunner {

    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceFragance interfaceFragance;
    @Autowired
    private InterfaceFragance interfaceOrder;
    
    @Autowired
    private UserRepositorio userRepository;

    @Autowired
    private OrderRepositorio orderRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
	public static void main(String[] args) {
		SpringApplication.run(Reto3WebApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        interfaceFragance.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
         //To change body of generated methods, choose Tools | Templates.
    }

        
        
        
        
        
        
        
}
