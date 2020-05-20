package com.usta.sistemas;

public class Main {
    public static int[][] matrix_votes = new int[123][2];
    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 19/05/2020
        //DESCRIPTION:This software Performs a simulation to vote on a bill in a department that proposes to end nightclubs and bars
        f_menu();
        fill_matrix();
        f_show_winner();
    }
    public static void f_menu() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".     SoftVoteClubs   .");
        System.out.println(".   V1.0 19/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
    public static void fill_matrix(){
        //DESCRIPTION: This method fills the matrix
        for (int i=0;i<matrix_votes.length;i++){
            matrix_votes[i][0] = (int) Math.floor((Math.random()*5000)+1);
            matrix_votes[i][1] = (int) Math.floor((Math.random()*5000)+1);
        }
    }
    public static void f_show_winner(){
        //DESCRIPTION:This method shows the winner
        int total_yes=0, total_not=0;
        for (int i=0;i<matrix_votes.length;i++){
            total_not+=matrix_votes[i][0];
            total_yes+=matrix_votes[i][1];
        }
        if (total_not==total_yes){
            System.out.println("Yes and No are the same= "+total_not);
        }else if (total_not>total_yes){
            System.out.println("The winner is the NO: "+total_not+" and the loser is: "+total_yes);
        }else{
            System.out.println("The winner is the YES: "+total_yes+" and the loser is: "+total_not);
        }
    }
}
