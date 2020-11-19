import java.util.Scanner;
//UC-1 creating board and initalizing with blank space 
public class TicTacToeGame {
	public static char[] createBoard(){
		char[] board=new char[10];
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
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board=createBoard();
		TicTacToeGame TicTacToeGameObj=new TicTacToeGame();
		TicTacToeGameObj.choosePlayer();
	}
}
