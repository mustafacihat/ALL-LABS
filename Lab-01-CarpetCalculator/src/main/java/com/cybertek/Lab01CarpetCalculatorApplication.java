package com.cybertek;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.interfaces.floorTypes.Floor;
import com.cybertek.services.Calculator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Lab01CarpetCalculatorApplication {


    @Bean
    public Calculator calculator(@Qualifier("carpetTX") Carpet carpet, @Qualifier("livingRoom") Floor floor) {
        return new Calculator(carpet, floor);
    }

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(Lab01CarpetCalculatorApplication.class, args);

        Calculator calculator = container.getBean("calculator", Calculator.class);
        System.out.println("Pls enter the city name : ");

        Scanner sc = new Scanner(System.in);
        System.out.println(calculator.calculatePrice(City.valueOf(sc.nextLine())));
    }

}
