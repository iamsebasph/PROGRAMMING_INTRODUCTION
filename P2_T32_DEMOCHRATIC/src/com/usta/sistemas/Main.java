package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 07/05/2020
        //DESCRIPTION:This software generates votes of N candidates
        int total_candidates = f_menu_total_candidates();
        int[] vector_votes = f_fill_vector_votes(total_candidates);
        f_show_the_winner(vector_votes);
        f_show_all_votes(vector_votes);
    }
    public static int f_menu_total_candidates() {
        System.out.println(".......................");
        System.out.println(".    SoftDemocratic   .");
        System.out.println(".   V1.0 07/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the total of candidates");
        Scanner keyboard = new Scanner(System.in);
        int total_candidates = keyboard.nextInt();
        while (total_candidates < 2){
            System.err.println("ERR: The number of candidates must be greater than 1");
            System.out.println("Input again the total of candidates");
            total_candidates = keyboard.nextInt();
        }
        return total_candidates;
    }
    public static int[] f_fill_vector_votes (int total_candidates){
        //DESCRIPTION: This method returns a vector with votes
        int[] vector_votes = new int[total_candidates];
        for (int i=0;i<total_candidates; i++){
            vector_votes[i] = (int) Math.floor((Math.random() * (5000)+1));
        }
        return vector_votes;
    }
    public static void f_show_the_winner(int[] vector_votes){
        //DESCRIPTION: This vector shows the winner candidates
        int winner_votes=0, winner_number=0;
        for (int i=0; i<vector_votes.length;i++){
            if (i==0){
               winner_votes = vector_votes[i];
            }else {
                if (vector_votes[i]>winner_votes){
                   winner_votes = vector_votes[i];
                   winner_number = i;
                }
            }
        }
        System.out.println("The winner candidate was: "+winner_number+" with: "+winner_votes+" votes.");
        f_show_the_second(vector_votes, winner_number);
    }
    public static void f_show_the_second (int[] vector_votes, int winner){
        //DESCRIPTION: This method shows the candidate on the second place
        int second=0, second_votes=0;
        for (int i=0;i<vector_votes.length;i++){
           if (winner != i){
               if (second_votes < vector_votes[i]){
                   second_votes=vector_votes[i];
                   second=i;
               }
           }
        }
        System.out.println("The second candidate is: "+second+" with "+second_votes+" votes.");
    }
    public static void f_show_all_votes (int[] vector_votes){
        //DESCRIPTION: This method shows the total of votes
        int total_votes =0;
        for (int i=0;i<vector_votes.length;i++){
            total_votes+= vector_votes[i];
            System.out.println("The total votes of the candidate ("+(i+1)+") are: "+vector_votes[i]);
        }
        System.out.println("The total of votes are: "+total_votes);
    }
}
