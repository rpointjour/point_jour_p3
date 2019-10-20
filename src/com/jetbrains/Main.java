package com.jetbrains;
/* Java Program for implementing Computer Aided Instruction (CAI) */

import java.util.*;

class CAI
{
    public static void main(String args[])
    {
        int correctAnswers = 0;
        int actualAnswer, userAnswer;
        int[] operands = new int[2];
        String question;

        Scanner sc = new Scanner(System.in);

        //Loop till user answers 10 correct questions
        while(correctAnswers <= 10)
        {
            //Generate question
            question = newQuestion(operands);

            //Calculate answer
            actualAnswer = operands[0] * operands[1];

            //Display question
            System.out.print("\n " + question);

            //Get answer
            userAnswer = sc.nextInt();

            //If both answers doesn't match loop both matches
            while(userAnswer != actualAnswer)
            {
                //Display a wrong message to user
                displayWrongMessage();

                //Displaying the same question again
                System.out.println("\n " + question) ;

                //Get answer from user
                userAnswer = sc.nextInt();
            }

            //Once user answers correctly display correct message
            displayCorrectMessage();

            //Counting total number of correct answers
            correctAnswers++;
        }
    }

    //Method that displays a new question to user
    public static String newQuestion(int[] operands)
    {
        String question;

        int Min = 1, Max = 9;

        //Generate two 1 digit integers randomly
        operands[0] = Min + (int)(Math.random() * ((Max - Min) + 1));
        operands[1] = Min + (int)(Math.random() * ((Max - Min) + 1));

        //Forming question
        question = " How much is " + operands[0] + " times " + operands[1] + " ? ";

        //Return question to user
        return question;
    }

    //Method that displays wrong message to user
    public static void displayWrongMessage()
    {
        int index;
        String message = "";

        //Generate a random number
        int Min = 0, Max = 3;
        index = Min + (int)(Math.random() * ((Max - Min) + 1));

        //Selecting message
        switch(index)
        {
            case 0: message = "No. Please try again."; break;
            case 1: message = "Wrong. Try once more."; break;
            case 2: message = "No. Don't give up!"; break;
            case 3: message = "No. Keep trying."; break;
            default: break;
        }

        //Printing the message present at the generated index
        System.out.println("\n " + message + " \n");
    }

    //Method that displays correct message to user
    public static void displayCorrectMessage()
    {
        int index;
        String message = "";

        //Generate a random number
        int Min = 0, Max = 3;
        index = Min + (int)(Math.random() * ((Max - Min) + 1));

        //Selecting message
        switch(index)
        {
            case 0: message = "Very good!"; break;
            case 1: message = "Excellent!"; break;
            case 2: message = "Nice work!"; break;
            case 3: message = "Keep up the good work!"; break;
            default: break;
        }

        //Printing the message present at the generated index
        System.out.println("\n " + message + " \n");
    }
}
