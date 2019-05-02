package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        boolean victory;


        Scanner keyboard;
        keyboard = new Scanner(System.in);

	System.out.println("Welcome to my game of Rock Paper Scissors.");
	System.out.println("Do you choose Rock [1], Paper [2], or Scissors [3]?");
	input=keyboard.nextInt();
	System.out.println("You chose "+choiceSpeaker(input)+"!");
	victory=victoryChooser(input);


    }


    public static boolean victoryChooser(int input){

        int choice;
        choice=(int)(Math.random()*100);
        while(choice>3||choice==0){
            choice=(int)(Math.random()*100);
        }
        System.out.println("I choose "+choice+"!");

        switch(input){
            case 1:
                switch(choice){
                    case 1:
                    case 2:
                    case 3:
                }
            case 2:
                switch(choice){
                    case 1:
                    case 2:
                    case 3:
                }
            case 3:
                switch(choice){
                    case 1:
                    case 2:
                    case 3:
                }

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
    }
}
