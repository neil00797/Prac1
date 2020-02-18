package com.adp3.submissions;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Random randGen = new Random();

        int randomNum = randGen.nextInt(10);


        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int guesses = 1;

        while(number != randomNum){
            if(number<randomNum){
                System.out.print("Too Low, Try again: ");
            }
            else{
                System.out.print("Too High, Try again: ");
            }

            number = input.nextInt();
            guesses++;

        }       //end while()

        System.out.printf("\nYEY!... You got it right after %d tries\n", guesses);

    }       //end main()

    //Nice! works perfectly. Guessed it in one try.

}       //end class
