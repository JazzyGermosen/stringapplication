package com.pluralsight;

public class VariableApplication {

    public static void main(String[] args) {

        // main method is a special method in java and is a special method that representes a class (special entry point)
        // we are going to declare some variables and print out the values and a description

        // variable for my favorite color
        //declare is just saying (string favColor;)
        //Initializing is adding a variable

        String favColor = "yellow";
        System.out.println(favColor + " this is the value for my favColor variable ");

        // variable for the year we started this class
        int yearStarted = 2025;
        System.out.println(yearStarted + " this is the value for yearStarted variable ");

        //declare variable to store my middle initial
        char middleInitial = 'C';
        System.out.println( middleInitial + " This is the valure for my middleInitial variable ");

        //variable for wheter we have pets
        boolean hasPets = true;
        System.out.println( hasPets + " this is the value for my hasPets variable ");

        //write a nice message
        String niceMessage = " you are a very demure person ";
        System.out.println( niceMessage + " is my nice message for you ");

        int numberodDays = 7;
        System.out.println(" there are " + numberodDays + " days in the week");

        double priceofCoffee = 4.99;
        System.out.println(" the price for this coffee is " + priceofCoffee);

        char favLetter = 'J';
        System.out.println(" my favorite letter is " + favLetter);

        boolean isRaining = true;
        System.out.println(" if you think it is raining, then it is " + isRaining);



    }

}
