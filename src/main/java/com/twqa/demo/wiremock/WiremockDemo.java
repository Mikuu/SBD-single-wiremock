package com.twqa.demo.wiremock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.tomakehurst.wiremock.WireMockServer;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

@SpringBootApplication
public class WiremockDemo implements CommandLineRunner {

    private static final String host = "localhost";
    private static final Integer port = 2345;

    private static WireMockServer wireMockService = new WireMockServer(port);

    public static void main(String[] args) {
        SpringApplication.run(WiremockDemo.class, args);
    }

    @Override
    public void run(String... args) {
        wireMockService.start();
        runDemo();
        System.out.println("===== My stub started =====");
    }

    private static void runDemo(){
        // Add your stub here
    }
}
