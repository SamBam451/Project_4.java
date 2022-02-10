package com.company;


import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, Double> cities = new HashMap<String, Double>();
        boolean run = true;
        String user_in;
        while(run){
            System.out.println("Enter city name or 'end' to enter temps: ");
            user_in = input.nextLine();
            if(Objects.equals(user_in, "END")){
                findAverage(cities);
                System.out.println(cities);
                run = false;
            }else{
                cities.put(user_in, null);
            }

        }
    }
    static HashMap<String, Double> findAverage(HashMap<String, Double> a){
        for (String name : a.keySet()) {
            double temps = 0;
            System.out.println("Name: " + name);
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter Temp:");
                temps = temps + input.nextDouble();
            }
            temps = temps/5;
            a.put(name, temps);
        }
        return a;
    }
}
