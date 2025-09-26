package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        /*
            create two variables to represent the salary for bob and gary
            name them bobSalary and garySalary. create a new variable named
            highestSalary. determine whose salary is greater using math.max()
            and store
         */

        // 1 variables to represent bob and garys salary
        int bobSalary = 45000;
        int garySalary = 185000;

        //store the higher salary in the highestSalary variable
        int highestSalary = Math.max(bobSalary, garySalary);

        //print out a sentence with the highest salary
        System.out.println("The highest salary is " + highestSalary);

        // 2 identify the car price and truck price then define and initialize it
        int carPrice = 45000;
        int truckPrice = 75000;
        int smallPrice = Math.min(carPrice, truckPrice);

        System.out.println("The smallest price is " + smallPrice);

        // 3 find and print the area of a circle radius = 7.25
        double radius = 7.25;
        double areaofCircle = (Math.PI * radius * radius);

        System.out.println("The area of this circle is " + areaofCircle);

        // 4 find and print the square root of 5.0
        double squareRoot = 5.0;
        double answer = Math.sqrt(squareRoot);

        System.out.println("The square root is " + answer );

        // 5 find and print the distance between the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

        System.out.println("The distance between the two points is " + distance);

        // 6 find and display the absolute ( positive ) value of a variable after it is set to -3.8
        double number = -3.8;
        double absNum = Math.abs(number);

        System.out.println("the absolute value is " + absNum);

        // 7 find random number between 0 and 1 and print

        double ranNum = Math.random();

        System.out.println("The number I chose is " + ranNum);

        // 8 calculate how many minutes are in 24 days, use a variable for each value

        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        // how manny hours are in 24 days; multiply number of days by hours in a day (576)
        // how many minutes are in 576 hours, (576 * 60 )
        // how many seconds are in 34,560 ( 34,560 * 60 )
        // how many milliseconds are in ( 2,073,600 * 1000 )

        int totalMinutes = days * hoursPerDay * minutesPerHour;
        int totalMilliseconds = totalMinutes * secondsPerMinute * millisecondsPerSecond;

        System.out.println("There are " + totalMinutes + " minutes in 24 days");
        System.out.println("There are " + totalMilliseconds + " milliseconds in 24 days ");





    }
}
