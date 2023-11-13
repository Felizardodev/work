package com.projeto.workshop.config;

import com.projeto.workshop.Entities.PedidoEntity;
import com.projeto.workshop.Entities.UserEntity;
import com.projeto.workshop.Repository.PedidoRepository;
import com.projeto.workshop.Repository.UserRepository;
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
    private PedidoRepository pedidoRepository;


    @Override
    public void run(String... args) throws Exception {

        UserEntity u1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        UserEntity u2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        PedidoEntity o1 = new PedidoEntity(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        PedidoEntity o2 = new PedidoEntity(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        PedidoEntity o3 = new PedidoEntity(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        pedidoRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
