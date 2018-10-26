package logic;

import Board.*;
import pieces.*;

// TODO: should be checked for a better efficiency
public class Logic {
    Rook[] wRook = new Rook[2];
    Rook[] bRook = new Rook[2];
    Pawn[] wPawn = new Pawn[8];
    Pawn[] bPawn = new Pawn[8];
    Bishop[] bBishop = new Bishop[2];
    Bishop[] wBishop = new Bishop[2];
    King[] bKing = new King[1];
    King[] wKing = new King[1];
    Knight[] wKnight = new Knight[2];
    Knight[] bKnight = new Knight[2];
    Queen[] wQueen = new Queen[1];
    Queen[] bQueen = new Queen[1];

    Board GameBoard = new Board();
    Position pos = new Position(0,0);
    // For put pieces in Board
  public void setPieces(){
      Pawn[] arrwPawn = new Pawn[8];
      for (int i=0 ; i<8 ; i++){
          pos.setPosition(6,i);
          arrwPawn[i] = new Pawn (pos , piece.Colour.WHITE);
          GameBoard.putPiece(arrwPawn[i]);
      }

      Pawn[] arrbPawn = new Pawn[8];
      for(int i=0 ; i<8 ; i++){
          pos.setPosition(0,i);
          arrbPawn[i] = new Pawn(pos , piece.Colour.BLACK);
          GameBoard.putPiece(arrbPawn[i]);
      }


      //set black pieces in the board

      pos.setPosition(0,0);
      Rook bRook1 = new Rook(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bRook1);;

      pos.setPosition(0,7);
      Rook bRook2 = new Rook(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bRook2);


      pos.setPosition(0,1);
      Knight bKnight1 = new Knight(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bKnight1);

      pos.setPosition(0,6);
      Knight bKnight2 = new Knight(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bKnight1);

      pos.setPosition(0,2);
      Bishop bBishop1 = new Bishop(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bBishop1);

      pos.setPosition(0,5);
      Bishop bBishop2 = new Bishop(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bBishop2);

      pos.setPosition(0,3);
      Queen bQueen = new Queen(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bQueen);

      pos.setPosition(0,4);
      King bKing = new King(pos, piece.Colour.BLACK);
      GameBoard.putPiece(bKing);

      //set white pieces in the board

      pos.setPosition(7,0);
      Rook wRook1 = new Rook(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wRook1);

      pos.setPosition(7,7);
      Rook wRook2 = new Rook(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wRook2);

      pos.setPosition(7,1);
      Knight wKnight1 = new Knight(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wKnight1);

      pos.setPosition(7,6);
      Knight wKnight2 = new Knight(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wKnight1);

      pos.setPosition(7,2);
      Bishop wBishop1 = new Bishop(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wBishop1);

      pos.setPosition(7,5);
      Bishop wBishop2 = new Bishop(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wBishop2);

      pos.setPosition(7,3);
      Queen wQueen = new Queen(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wQueen);

      pos.setPosition(7,4);
      King wKing = new King(pos, piece.Colour.WHITE);
      GameBoard.putPiece(wKing);



      Rook arrwRook[] = {wRook1,wRook2};
      Rook arrbRook[] = {bRook1,bRook2};
      Queen arrwQueen[] = {wQueen};
      Queen arrbQueen[] = {bQueen};
      Knight arrwKnight[] = {wKnight1,wKnight2};
      Knight arrbKnight[] = {bKnight1,bKnight2};
      King arrwKing[] = {wKing};
      King arrbKing[] = {bKing};
      Bishop arrwBishop[] = {wBishop1,wBishop2};
      Bishop arrbBishop[] = {bBishop1,bBishop2};
  }
    //For set Turn
  public piece.Colour Turn(boolean b){
      boolean turn = b;
      if(turn == true){return piece.Colour.WHITE;}
      else {return piece.Colour.BLACK;}
  }

  public void WhiteMovement(int i , int j , int k , int l){
      if(GameBoard.get(i, j).isAlive() == true && GameBoard.get(i,j).getColour()== piece.Colour.WHITE){
          pos.setPosition(k,l);
          if(GameBoard.isEmpty(pos)==true) {
              GameBoard.get(i, j).move(pos);
          }

      }
  }

  public void BlackMovement(int i , int j , int k , int l){
      if(GameBoard.get(i,j).isAlive() == true && GameBoard.get(i,j).getColour() == piece.Colour.BLACK){
          pos.setPosition(k,l);
          if(GameBoard.isEmpty(pos) == true){
              GameBoard.get(i,j).move(pos);
          }
      }
  }
    //a piece in (i,j) kill a piece in (k,l)
  public void CaptuePiece(int i , int j , int k , int l){
      if(GameBoard.get(i,j).getColour() != GameBoard.get(k,l).getColour()){
          pos.setPosition(k,l);
          GameBoard.get(i,j).capture(pos);
          GameBoard.get(k,l).captured();


          //We need a method to null the (k,l) cell in GameBoard
          GameBoard.setNull(k,l);

          pos.setPosition(k,l);
          GameBoard.get(i,j).move(pos); //to move the killer in new cell



      }
  }

}
