package Arrays;

import java.util.Scanner;

public class pra12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1. Initialize an empty 3x3 board ('-' means empty)
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        char currentPlayer = 'X';
        boolean gameOver = false;
        int moves = 0;

        System.out.println("=== TIC TAC TOE ===");

        // 2. Game loop runs until someone wins or all 9 spaces are filled
        while (!gameOver && moves < 9) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row (0-2) and column (0-2) separated by space: ");

            int row = s.nextInt();
            int col = s.nextInt();

            // 3. Validate the user's move
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Please enter numbers between 0 and 2.");
                continue;
            }
            if (board[row][col] != '-') {
                System.out.println("That spot is already taken! Try again.");
                continue;
            }

            // 4. Place the mark on the board
            board[row][col] = currentPlayer;
            moves++;

            // 5. Check if the current player won
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                gameOver = true;
            } else if (moves == 9) {
                printBoard(board);
                System.out.println("🤝 It's a draw!");
            } else {
                // Switch player for the next turn
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        s.close();
    }

    // Helper method to display the board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Helper method to check rows, columns, and diagonals for a win
    public static boolean checkWin(char[][] b, char player) {
        for (int i = 0; i < 3; i++) {
            // Check rows and columns
            if ((b[i][0] == player && b[i][1] == player && b[i][2] == player) ||
                (b[0][i] == player && b[1][i] == player && b[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        return (b[0][0] == player && b[1][1] == player && b[2][2] == player) ||
               (b[0][2] == player && b[1][1] == player && b[2][0] == player);
    }
}
