import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeWithComputer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        boolean playerTurn = true;
        boolean gameEnd = false;

        while (!gameEnd) {
            printBoard(board);

            if (playerTurn) {
                System.out.println("Player's turn");
                int row, col;
                while (true) {
                    try {
                        System.out.print("Enter a row (0, 1 or 2): ");
                        row = sc.nextInt();
                        System.out.print("Enter a column (0, 1 or 2): ");
                        col = sc.nextInt();

                        if (row < 0 || row > 2 || col < 0 || col > 2) {
                            System.out.println("Invalid input, try again.");
                        } else if (board[row][col] != ' ') {
                            System.out.println("Cell already taken, try again.");
                        } else {
                            board[row][col] = 'X';
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter numbers only.");
                        sc.next(); // clear invalid input
                    }
                }
            } else {
                System.out.println("Computer's turn...");
                int row, col;

                // Simple strategy: play the first empty spot (improvement over random)
                outerLoop:
                for (row = 0; row < 3; row++) {
                    for (col = 0; col < 3; col++) {
                        if (board[row][col] == ' ') {
                            board[row][col] = 'O';
                            break outerLoop;
                        }
                    }
                }
            }

            // Check for winner
            if (checkWin(board, playerTurn ? 'X' : 'O')) {
                printBoard(board);
                if (playerTurn) {
                    System.out.println("Game ended, Player Wins!");
                } else {
                    System.out.println("Game ended, Computer Wins!");
                }
                gameEnd = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("Game ended in a draw!");
                gameEnd = true;
            }

            // Switch turn
            playerTurn = !playerTurn;
        }

        sc.close();
    }

    // Prints the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    // Check win condition
    public static boolean checkWin(char[][] b, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == symbol && b[i][1] == symbol && b[i][2] == symbol) return true; // row
            if (b[0][i] == symbol && b[1][i] == symbol && b[2][i] == symbol) return true; // column
        }
        if (b[0][0] == symbol && b[1][1] == symbol && b[2][2] == symbol) return true; // diagonal
        if (b[0][2] == symbol && b[1][1] == symbol && b[2][0] == symbol) return true; // reverse diagonal
        return false;
    }

    // Check if board is full
    public static boolean isBoardFull(char[][] b) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == ' ') return false;
            }
        }
        return true;
    }
}
