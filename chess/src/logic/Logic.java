package logic;

import Board.Board;
import Board.Position;
import pieces.*;

public class Logic {
    Board GameBoard = new Board();
  public void setPieces(){
      Position pos = new Position(0, 0);
      Rook bRook1 = new Rook(pos ,piece.Colour.BLACK);
      GameBoard.putPiece(bRook1);

      pos.setPosition(0, 7);
      Rook bRook2 = new Rook(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bRook2);

      pos.setPosition(0,1);
      Knight bKnight1 = new Knight(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bKnight1);

      pos.setPosition(0, 6);
      Knight bKnight2 = new Knight(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bKnight2);

      pos.setPosition(0, 2);
      Bishop bBishop1 = new Bishop(pos , piece.Colour.BLACK);
      GameBoard.putPiece(bBishop1);

      pos.setPosition(0,5);
      Bishop bBishop2 = new Bishop(pos , piece.Colour.BLACK);
      GameBoard.putPiece(bBishop2);

      pos.setPosition(0,3);
      Queen bQueen = new Queen(pos , piece.Colour.BLACK);
      GameBoard.putPiece(bQueen);

      pos.setPosition(0,4);
      King bKing = new King(pos,piece.Colour.BLACK);
      GameBoard.putPiece(bKing);

      pos.setPosition(1,0);
      Pawn bPawn1 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn1);

      pos.setPosition(1,1);
      Pawn bPawn2 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn2);

      pos.setPosition(1,2);
      Pawn bPawn3 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn3);

      pos.setPosition(1,3);
      Pawn bPawn4 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn4);

      pos.setPosition(1,4);
      Pawn bPawn5 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn5);

      pos.setPosition(1,5);
      Pawn bPawn6 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn6);

      pos.setPosition(1,6);
      Pawn bPawn7 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn7);

      pos.setPosition(1,7);
      Pawn bPawn8 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(bPawn8);

      pos.setPosition(6,0);
      Pawn wPawn1 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn1);

      pos.setPosition(6,1);
      Pawn wPawn2 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn2);

      pos.setPosition(6,2);
      Pawn wPawn3 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn3);

      pos.setPosition(6,3);
      Pawn wPawn4 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn4);

      pos.setPosition(6,4);
      Pawn wPawn5 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn5);

      pos.setPosition(6,5);
      Pawn wPawn6 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn6);

      pos.setPosition(6,6);
      Pawn wPawn7 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn7);

      pos.setPosition(6,7);
      Pawn wPawn8 = new Pawn(pos, piece.Colour.BLACK);
      GameBoard.putpiece(wPawn8);

      Position pos = new Position(7, 0);
      Rook wRook1 = new Rook(pos ,piece.Colour.BLACK);
      GameBoard.putPiece(wRook1);

      pos.setPosition(7, 7);
      Rook wRook2 = new Rook(pos, piece.Colour.BLACK);
      GameBoard.putPiece(wRook2);

      pos.setPosition(7,1);
      Knight wKnight1 = new Knight(pos, piece.Colour.BLACK);
      GameBoard.putPiece(wKnight1);

      pos.setPosition(7, 6);
      Knight wKnight2 = new Knight(pos, piece.Colour.BLACK);
      GameBoard.putPiece(wKnight2);

      pos.setPosition(7, 2);
      Bishop wBishop1 = new Bishop(pos , piece.Colour.BLACK);
      GameBoard.putPiece(wBishop1);

      pos.setPosition(7,5);
      Bishop wBishop2 = new Bishop(pos , piece.Colour.BLACK);
      GameBoard.putPiece(wBishop2);

      pos.setPosition(7,3);
      Queen wQueen = new Queen(pos , piece.Colour.BLACK);
      GameBoard.putPiece(wQueen);

      pos.setPosition(7,4);
      King wKing = new King(pos,piece.Colour.BLACK);
      GameBoard.putPiece(wKing);


  }
}
