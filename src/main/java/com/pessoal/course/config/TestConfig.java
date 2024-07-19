package com.pessoal.course.config;

import com.pessoal.course.entites.Order;
import com.pessoal.course.entites.User;
import com.pessoal.course.repositories.OrderRepository;
import com.pessoal.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
//Instanciando Objetos
        User u = new User(null, "Pedro Lima", "pedro@gmail", "11999999999", "123456");
        User u2 = new User(null, "Marcio Soares", "marcio@gmail", "11999999999", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u);
//Adicionando ao Banco
        userRepository.saveAll(Arrays.asList(u,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
