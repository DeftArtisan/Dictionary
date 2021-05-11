package com.company;

import java.lang.management.CompilationMXBean;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Factual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       Map<String, List<Double>> statistics = new LinkedHashMap<>();

        while (true){

            switch (scanner.nextLine()){

                case "redact":
                    return;
            }

        }

        /*
        for (int i = 0; i < 10; i++) {
            Regexination(scanner.nextLine());
        }

         */
    }


    private static boolean IsNumeric(String[] factive) {

        for (int i = 0; i < Arrays.toString(factive).toCharArray().length; i++) {
            if (!Character.isDigit(Arrays.toString(factive).toCharArray()[i])) {
                return false;
            }
        }
        return true;
    }

    private static void Regexination(String command, Map<String, ArrayList<Double>> product) {

       Pattern pattern = Pattern.compile("[A-Z a-z]+");
       Matcher matcher = pattern.matcher(command);
       if(!isCharacteristic(matcher)) {
           System.out.printf("The following is not a product -> %s ",command);
       } else {
           product.put(matcher.group(), new ArrayList<>());
           System.out.println("Please add the product(s) price(s)");
           Pattern isPrice = Pattern.compile("\\d+");
           Matcher isDigit = isPrice.matcher(command);
           while (!command.equals("Prices done")){

               if(!isCharacteristic(isDigit)){
                   System.out.printf("The following is not a price -> %f",Double.parseDouble(command));
               } else {
                   product.get(matcher.group()).add(Double.parseDouble(command));
               }
           }
       }

    }


    private static boolean isCharacteristic(Matcher matcher) {

        try {
            if(matcher.find()){
                return true;
            }
        } catch (ArithmeticException exception){
            return false;
        }
        return false;
    }


}