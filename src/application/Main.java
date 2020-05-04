package application;

import chess.ChessMatch;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Chess Game");
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		


	}

}
