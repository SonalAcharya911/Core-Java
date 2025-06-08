package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.TemperatureDto;
import com.xworkz.extraordinary.service.TemperatureService;
import com.xworkz.extraordinary.service.TemperatureServiceImpl;

import java.util.Scanner;

public class TemperatureRunner {
    public static void main(String[] args) {
        TemperatureDto temperatureDto=new TemperatureDto();

        try(Scanner scanner=new Scanner(System.in)){
            TemperatureService service = new TemperatureServiceImpl();

            System.out.print("Enter temperature value: ");
            String input = scanner.nextLine();

            service.validate(temperatureDto);
        }
    }
}
