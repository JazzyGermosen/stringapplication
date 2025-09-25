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
        int x2 = 10;
        int y1 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2- x1,2) + Math.pow(y2 - y1,2));

        System.out.println("The distance between the two points is " + distance);

        // 6 find and display the absolute ( positive ) value of a variable after it is set to -3.8




    }
}
