package com.sportingadvantage;


import org.springframework.context.annotation.ImportResource;

@ImportResource({
        "/rabbitmq-context.xml"
})
public class SimpleServer {

    public static void main(String [] args) {
        System.out.println("Hello from server! args=" +  args);
    }
}
