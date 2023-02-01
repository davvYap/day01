package myapp;

import java.io.Console;

public class Hello {
    //entry point
    public static void main(String[] args){

        //get the console
        //declare a variable to hold the console
        Console cons = System.console();

        // prompt the user for an input, all input received are in String datatype
        String name = cons.readLine("What is your name?");
        String phoneNum = cons.readLine("What is your contact number?");
        String strAge = cons.readLine("How old are you?");

        // to remove extra whitespace from the input
        name = name.trim();
        String newName = name.toUpperCase();

        int age = Integer.parseInt(strAge);

        if (age >= 30){
            System.out.printf("Hello Sir!\n");
        }else {
            System.out.printf("Hello %s!\n", name);
            System.out.printf("Hello %s!\n", newName);
        }

        // System.out.printf("Hello %s\nYour contact number is %s\n", input, phoneNum);
        // System.out.printf("Your age is %s\n",strAge);
        // System.out.printf("Greater than 50? %b\n", age>50);

        switch(name.trim().toLowerCase()){
            case "davv":
                System.out.printf("Hi Davv!\n");
                break;
            case "david":
                System.out.printf("Hi David!\n");
                break;
            default:
                System.out.printf("Hello World!\n");
        }

        while(age > 0){
            System.out.printf("---- %d\n",age);     // %d = digit, %f = float
            age--;
        }


    }
}
