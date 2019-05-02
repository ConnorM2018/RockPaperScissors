package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mainGame();
    }
    public static void mainGame(){
        int input;


        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Welcome to my game of Rock Paper Scissors.");
        System.out.println("Do you choose Rock [1], Paper [2], or Scissors [3]?");
        input=keyboard.nextInt();
        System.out.println("You chose "+choiceSpeaker(input)+"!");
        victoryChooser(input);
    }

    public static void victoryChooser(int input){

        int choice;
        choice=(int)(Math.random()*100);
        while(choice>3||choice==0){
            choice=(int)(Math.random()*100);
        }
        System.out.println("I choose "+choiceSpeaker(choice)+"!");

        switch(input){
            case 1:
                switch(choice){
                    case 1:
                        System.out.println("It's a tie!");
                        break;
                    case 2:
                        System.out.println("You lose!");
                        break;
                    case 3:
                        System.out.println("You win!");
                        break;
                }
                break;
            case 2:
                switch(choice){
                    case 1:
                        System.out.println("You win!");
                        break;
                    case 2:
                        System.out.println("It's a tie!");
                        break;
                    case 3:
                        System.out.println("You lose!");
                        break;
                }
                break;
            case 3:
                switch(choice){
                    case 1:
                        System.out.println("You lose!");
                        break;
                    case 2:
                        System.out.println("You win!");
                        break;
                    case 3:
                        System.out.println("It's a tie!");
                        break;
                }
                break;

        }
        mainGame();


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
        return "Deathpacito";
    }
}
