package chess;

import Players.Players;
import logic.Logic;
import pieces.piece;

import java.util.Scanner;

public class chess {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            String Player1name = input.next();
            String Player1family = input.next();
            Players player1 = new Players(Player1name , Player1family , piece.Colour.WHITE);

            String Player2name = input.next();
            String Player2family = input.next();
            Players player2 = new Players(Player2name , Player2family , piece.Colour.BLACK);

            Logic logic = new Logic();
            logic.setPieces();
        }
    }
}
