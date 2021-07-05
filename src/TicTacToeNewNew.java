import java.util.Scanner;

public class TicTacToeNewNew {
	public static void main(String[] args) {
		Scanner boyscanner = new Scanner(System.in);

		boolean playerturn = false;

		String[] gameboard = createNewGameBoard();

		System.out.println("Below is the Tic Tac Toe board, each number is where you can go\n");
		int[] example = new int[9];
		int x = 0;
		for (int i = 0; i < example.length; i++) {
			example[i] = x;
			x++;
			System.out.print(example[i]);
			if (i == 2 || i == 5) {
				System.out.println();
			}
		}
		System.out.println("\n\nThe game begins, player 1 start: ");

		while (true) {

			String playerLetter;

			int playerMove = boyscanner.nextInt();
			if (playerMove < 0 || playerMove > 8) {
				System.out.println("Try again");
				continue;
			}

			if (playerturn == false) {
				System.out.println("Player 1s move");
				playerLetter = "X";
				playerturn = true;
			} else {
				System.out.println("Player 2s move");
				playerLetter = "O";
				playerturn = false;
			}
			gameboard[playerMove] = playerLetter;

			if (gameboard[0] == playerLetter && gameboard[1] == playerLetter && gameboard[2] == playerLetter) {
				printBoard(gameboard);
				System.out.println("Congrats to letter " + playerLetter + " you are the winner");
				break;
			} else if (gameboard[3] == playerLetter && gameboard[4] == playerLetter && gameboard[5] == playerLetter) {
				printBoard(gameboard);
				System.out.println("Congrats to letter " + playerLetter + " you are the winner");
				break;
			} else if (gameboard[6] == playerLetter && gameboard[7] == playerLetter && gameboard[8] == playerLetter) {
				printBoard(gameboard);
				System.out.println("Congrats to letter " + playerLetter + " you are the winner");
				break;
			} else if (gameboard[0] == playerLetter && gameboard[1] == playerLetter && gameboard[6] == playerLetter) {
				printBoard(gameboard);
				System.out.println("Congrats to letter " + playerLetter + " you are the winner");
				break;
			} else if (gameboard[0] == playerLetter && gameboard[4] == playerLetter && gameboard[8] == playerLetter) {
				printBoard(gameboard);
				System.out.println("Congrats to letter " + playerLetter + " you are the winner");
				break;
			} else if (gameboard[2] == playerLetter && gameboard[4] == playerLetter && gameboard[6] == playerLetter) {
				printBoard(gameboard);
				System.out.println("Congrats to letter " + playerLetter + " you are the winner");
				break;
			} else if (gameboard[0] == playerLetter && gameboard[3] == playerLetter && gameboard[6] == playerLetter) {
				printBoard(gameboard);
				System.out.println("Congrats to letter " + playerLetter + " you are the winner");
				break;
			}	
			
			printBoard(gameboard);

		}

	}

	public static String[] createNewGameBoard() {
		String[] gameBoard = new String[9];
		for (int i = 0; i < gameBoard.length; i++) {
			gameBoard[i] = "-";
		}
		return gameBoard;
	}

	public static void printBoard(String[] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.print(board[i]);
			System.out.print(" ");
			if (i == 2 || i == 5) {
				System.out.println();
			}
		}
		System.out.println();

	}

}
