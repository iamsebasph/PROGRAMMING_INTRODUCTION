package com.usta.sistemas;

public class Main {
    public static int[][] matrix_votes = new int[10][2];
    public static int winner;
    public static int loser;

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 19/05/2020
        //DESCRIPTION:This software Performs a simulation to vote on a bill in a department that proposes to end nightclubs and bars
        f_menu();
        fill_matrix();
        f_show_winner();
        f_show_most_votes();
        f_show_all_votes();
        f_show_less_votes();
    }

    public static void f_menu() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".     SoftVoteClubs   .");
        System.out.println(".   V1.0 19/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static void fill_matrix() {
        //DESCRIPTION: This method fills the matrix
        for (int i = 0; i < matrix_votes.length; i++) {
            matrix_votes[i][0] = (int) Math.floor((Math.random() * 5000) + 1);
            matrix_votes[i][1] = (int) Math.floor((Math.random() * 5000) + 1);
        }
    }

    public static void f_show_winner() {
        //DESCRIPTION:This method shows the winner
        int total_yes = 0, total_not = 0;
        for (int i = 0; i < matrix_votes.length; i++) {
            total_not += matrix_votes[i][0];
            total_yes += matrix_votes[i][1];
        }
        if (total_not == total_yes) {
            System.out.println("Yes and No are the same= " + total_not);
            winner = -1;
        } else if (total_not > total_yes) {
            System.out.println("The winner is the NO: " + total_not + " and the loser is: " + total_yes + " %" + (total_not * 100 / (total_not + total_yes)));
            winner = 0;
            loser = 1;
        } else {
            System.out.println("The winner is the YES: " + total_yes + " and the loser is: " + total_not + " %" + (total_yes * 100 / (total_not + total_yes)));
            winner = 1;
            loser = 0;
        }
    }

    public static void f_show_most_votes() {
        //DESCRIPTION: This column shows you who was the winner and the loser

        int more_votes_winner = matrix_votes[0][winner], more_votes_winner_row = 0;
        int more_votes_loser = matrix_votes[0][loser], more_votes_loser_row = 0;
        for (int i = 1; i < matrix_votes.length; i++) {
            if (more_votes_winner < matrix_votes[i][winner]) {
                more_votes_winner = matrix_votes[i][winner];
                more_votes_winner_row = i;
            }
            if (more_votes_loser < matrix_votes[i][loser]) {
                more_votes_loser = matrix_votes[i][loser];
                more_votes_loser_row = i;
            }
        }
        System.out.println("The municipality with the more votes by the winner was: " + more_votes_winner_row + 1 + " total votes: " + more_votes_winner);
        System.out.println("The municipality with the more votes by the loser was: " + more_votes_loser_row + 1 + " total votes: " + more_votes_loser);
    }

    public static void f_show_all_votes() {
        //DESCRIPTION: This method shows all of the votes
        System.out.println(" NO | YES");
        for (int i = 0; i < matrix_votes.length; i++) {
            System.out.println(matrix_votes[i][0] + " | " + matrix_votes[i][1]);
        }
    }
    public static void f_show_less_votes() {
        //DESCRIPTION: This column shows you who was the winner and the loser

        int less_votes_winner = matrix_votes[0][winner], less_votes_winner_row = 0;
        int less_votes_loser = matrix_votes[0][loser], less_votes_loser_row = 0;
        for (int i = 1; i < matrix_votes.length; i++) {
            if (less_votes_winner > matrix_votes[i][winner]) {
                less_votes_winner = matrix_votes[i][winner];
                less_votes_winner_row = i;
            }
            if (less_votes_loser > matrix_votes[i][loser]) {
                less_votes_loser = matrix_votes[i][loser];
                less_votes_loser_row = i;
            }
        }
        System.out.println("The municipality with the less votes by the winner was: " + less_votes_winner_row + 1 + " total votes: " + less_votes_winner);
        System.out.println("The municipality with the less votes by the loser was: " + less_votes_loser_row + 1 + " total votes: " + less_votes_loser);
    }
}
