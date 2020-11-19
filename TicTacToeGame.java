import java.util.Scanner;
public class TicTacToeGame {
//intialize with empty board
	public static char[] createBoard(){
		char[] board=new char[9];
		for (int index = 1; index < board.length; index++) {
			board[index]=' ';
		}
		return board;
	}

	//uc-2 usrselection wheter it is o or x
	public void choosePlayer() {
		Scanner sc=new Scanner(System.in);
		char computer='x';
		System.out.println("Enter your choice o or x");
		char user=sc.next().charAt(0);
		if (user=='x'||user=='X') {
			computer='O';
		}else if (user=='o'||user=='O') {
			computer='X';
		}else
			System.out.println("Invalid");
		System.out.println("player is :"+user+" " +"Computer Marks is :"+computer);
	}
	//UC3 display the board
	
	public void displayBoard(char[] show) {
		for (int i = 0; i < show.length; i++) {
			if (i==3||i==6) {
				System.out.println();
			}
			System.out.print(show[i]+"|");
		}
	}
	

	//main method
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] showBoard=createBoard();
		TicTacToeGame TicTacToeObj=new TicTacToeGame();
		TicTacToeObj.choosePlayer();
		 TicTacToeObj.displayBoard(showBoard);

		
	}
}
