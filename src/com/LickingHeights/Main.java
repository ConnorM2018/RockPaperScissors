package com.LickingHeights;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        boolean playAgain=true;

        System.out.println("Welcome to my game of Rock Paper Scissors.");




        while(playAgain){
            // This array has two items in its list, those being "choices[0]" and "choices[1]"
            int [] choices = new int[2];


            System.out.println("Do you choose Rock [1], Paper [2], or Scissors [3]?");
            choices[0]=keyboard.nextInt();
            // choices[0] = User's choice


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
            // choices[1] = Computer's choice

            System.out.println("I choose "+choiceSpeaker(choices[1])+"!");
            System.out.println(" ");


            System.out.println(winOrLose(choices[0], choices[1]));
            System.out.println("_________________________");

            System.out.println("Do you want to play again?");
            playAgain=playAgain(keyboard);

        }


    }

    public static String winOrLose(int input, int input2){
        
        String [] output = new String[3];
        output[0]="You win!";
        output[1]="It's a tie!";
        output[2]="You lose!";

        //"input" is basically "choices[0]" while "input2" is basically "choices[1]"
        switch(input){

            case 1: //User chooses Rock

                switch(input2){

                    case 1: //Computer chooses Rock
                        return output[1];
                    case 2: //Computer chooses Paper
                        return output[2];
                    case 3: //Computer chooses Scissors
                        return output[0];
                    default:
                        return "Error";
                }
            case 2: //User chooses Paper
                switch(input2){

                    case 1: //Computer chooses Rock
                        return output[0];
                    case 2: //Computer chooses Paper
                        return output[1];
                    case 3: //Computer chooses Scissors
                        return output[2];
                    default:
                        return "Error";
                }

            case 3: //User chooses Scissors
                switch(input2){

                    case 1: //Computer chooses Rock
                        return output[2];
                    case 2: //Computer chooses Paper
                        return output[0];
                    case 3: //Computer chooses Scissors
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
    public static boolean playAgain(Scanner keyboard){
        System.out.println("Yes = [1]");
        System.out.println("No = [2]");
        int input = keyboard.nextInt();
        return (input==1);
    }
}
