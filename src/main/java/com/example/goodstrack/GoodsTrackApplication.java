package com.example.goodstrack;

import com.example.goodstrack.services.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoodsTrackApplication implements CommandLineRunner {

    @Autowired
    private ServiceManager manager;

    public static void main(String[] args) {
        SpringApplication.run(GoodsTrackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        manager.initializeData();
    }

}
