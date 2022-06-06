package com.company;

public class Main {


    public static void main(String[] args) {

        System.out.println(ageAndTemperature(25, 5));
        System.out.println(ageAndTemperature(18, 10));
        System.out.println(ageAndTemperature(46, 0));
        System.out.println(ageAndTemperature(8, -25));
        System.out.println(ageAndTemperature(1, 32));
    }

    public static String ageAndTemperature(int humansAge, int tempStreet) {

        if (humansAge >= 20 && humansAge <= 45 && tempStreet >= -20 && tempStreet <= 30)
            return "Можно идти гулять";
        else if (humansAge < 20 && tempStreet >= 0 && tempStreet <= 28)
            return "Можно идти гулять";
        else if (humansAge > 45 || tempStreet >= -10 && tempStreet <= 25)
            return "Можно идти гулять";
        else if (humansAge < 10 || tempStreet < 23)
            return "Останьтесь дома";
        else if (humansAge < 1 && tempStreet < 32) ;

        return "Останьтесь дома";


    }
}