package com.usta.sistemas;

public class Main {
    public static int[][] matrix = new int[123][8];
    public static int[] total_votes= new int[8];
    public static String[] vector_partides= {"liberal", "Conservador", "Alianza verde", "La U" , "cambio radical", "Centro democrático", "MIRA" , "Polo"};
    public static int winner_votes=0;
    public static int winner_columns=0;


    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 21/05/2020
        //DESCRIPTION:This software Perform the simulation of a voting process for the Boyacá governorate where there are seven (8) candidates from the main political parties in Colombia
        f_menu();
        f_fill_matrix();
        f_total_votes();
        for (int i=0; i<total_votes.length;i++){
            System.out.println("Politic party: "+vector_partides[i]+", Total votes: "+total_votes[i]);
        }
        f_show_winner_and_second();
    }

    public static void f_menu() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".  SoftVotingProcess  .");
        System.out.println(".   V1.0 21/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static void f_fill_matrix() {
        //DESCRIPTION: This method fills the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) Math.floor((Math.random() * 1000) + 1);
            }
        }

    }

    public static void f_total_votes() {
        //DESCRIPTION: This method calculates the total vote for every party
        for (int j = 0; j < matrix[0].length; j++){
            for (int i = 0; i < matrix.length; i++){
                total_votes[j]+=matrix[i][j];  //Sum every row by every column
            }
        }
    }
    public static void f_show_winner_and_second(){
        //DESCRIPTION: This method shows the winner and the second place
        int loser_votes=total_votes[0], loser_columns=0;
        winner_votes=total_votes[0];
        for (int i=1;i<total_votes.length;i++){
            if (winner_votes<total_votes[i]){
                winner_votes=total_votes[i];
                winner_columns=i;
            }
        }
        //Second place
        for (int i=1;i<total_votes.length;i++){
            if (winner_columns != i){
                if (loser_votes<total_votes[i]){
                    loser_votes=total_votes[i];
                    loser_columns=i;
                }
            }
        }
        System.out.println("The winner is: "+vector_partides[winner_columns]+ ", total votes: "+total_votes[winner_columns]);
        System.out.println("The second place is: "+vector_partides[loser_columns]+ ", total votes: "+total_votes[loser_columns]);
    }
}
