package com.company;

// a subroutine is a named out of line block of code that may be executed by simply writing its name in a program statement, these are called methods in java

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int globalVariable = 7;
    public static void myMessage(){ // this is a method definition
        int localVariable = 5; //can only be accessed within the scope, the curly brackets {}
        System.out.println("Here is an intro to methods");
        //System.out.println(MethodsClass2.addNums(6,6));
        System.out.println(globalVariable);
    }

    public static void main(String[] args){
        System.out.println("type in a min and max number");
        System.out.println(getRandom(getIntInput(),getIntInput()));
    }
    public static int getIntInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt((max-min)+1)+min;
    }
    public static String getName(){
        System.out.println("Type in your name");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
//why to use local instead of global
//makes a subroutine self-contained
//releases storage when subroutine terminates
//able to test/debug subroutine independently
//easier to re-use subroutine in another program
//local variable values cannot be inadvertently/accidentally altered by a subroutine call from the subroutine

//parameters
//a parameter is used to pass data about between methods
//a method can be given data to run with and can be called again with different data
//e.g. public static int addNumbers(int x, int y){