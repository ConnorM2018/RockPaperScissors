package com.LickingHeights;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        System.out.println("Welcome to my game of Rock Paper Scissors.");
        mainGame();
    }
    
    
    public static void mainGame(){


        int [] choices = new int[2];


        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Do you choose Rock [1], Paper [2], or Scissors [3]?");
        choices[0]=keyboard.nextInt();


        while(choices[0]>3||choices[0]<1){
            System.out.println("Invalid input. Please try again.");
            System.out.println(" ");
            System.out.println("Do you choose Rock [1], Paper [2], or Scissors [3]?");
            choices[0]=keyboard.nextInt();
        }


        System.out.println("_________________________");
        System.out.println("You chose "+choiceSpeaker(choices[0])+"!");


        choices[1]=(int)(Math.random()*100);
        while(choices[1]>3||choices[1]==0){
            choices[1]=(int)(Math.random()*100);
        }


        System.out.println("I choose "+choiceSpeaker(choices[1])+"!");
        System.out.println(" ");


        System.out.println(winOrLose(choices[0], choices[1]));
        System.out.println("_________________________");


    }







    public static String winOrLose(int input, int input2){

        System.out.println("I choose "+choiceSpeaker(input2)+"!");
        System.out.println(" ");

        String [] output = new String[3];
        output[0]="You win!";
        output[1]="It's a tie!";
        output[2]="You lose!";

        switch(input){

            case 1:

                switch(input2){

                    case 1:
                        return output[1];
                    case 2:
                        return output[2];
                    case 3:
                        return output[0];
                    default:
                        return "Error";
                }
            case 2:
                switch(input2){

                    case 1:
                        return output[0];
                    case 2:
                        return output[1];
                    case 3:
                        return output[2];
                    default:
                        return "Error";
                }

            case 3:
                switch(input2){

                    case 1:
                        return output[2];
                    case 2:
                        return output[0];
                    case 3:
                        return output[1];
                    default:
                        return "Error";
                }
            default:
                return "Error";
        }
    }

    public static String choiceSpeaker(int input){

        switch(input){

            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
        }
        return "[ERROR]";
    }
}
