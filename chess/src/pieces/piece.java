package pieces;

import Board.Board;
import Board.Position;
import Players.Players;

/**
 * just an abstract class to make it somehow generic
 * other classes like Knight and Bishops are going to inherit from it
 * using the colour as an enum
 * a position for each piece
 * and a variable checks to see if they are alive
 *
 */
public class piece
{

    public static enum Colour
    {
        WHITE, BLACK;
    }
    private boolean isAlive;
    private Position position;
    private static Board board = new Board();
    private Colour colour;

    /**
     * the default constructor.
     * for creating objects of this type to put something in them
     * this Constructor wont be used in sub classes
     */
    public piece()
    {
        isAlive = true;
    }

    /**
     *
     * @param u_pos the position of the piece
     * @param col the colour of the piece
     * this constructor is used in the subclasses
     */
    public piece(Position u_pos, Colour col)
    {
        isAlive = true;
        position = u_pos;
        colour = col;
    }
    public Colour getColour()
    {
        return colour;
    }       //getter function

    /**
     * captures the piece in the given position
     * @param pos the position of the piece that is going to be captured
     */
    public void capture(Position pos)
    {
        if (Board.isEmpty(pos)) return;
        piece p = Board.get(pos.getX(), pos.getY());
        p.captured();
        this.move(pos);
    }

    // moves the piece if valid
    public void move(Position pos){}

    // changes the state of isAlive paramater
    public void captured() { isAlive = false; }


    public boolean isAlive() { return isAlive; }        // getter function
    public Position position() { return position; }     //getter function
    public void setPosition(int x, int y)               // setter function
    {
        position.setPosition(x, y);
    }

    /**
     * checks if there is any other piece in the path of the piece movement
     * @param pos is the destination of the movement
     * @return true if there is no pieces in the way
     */
    public boolean isThere(Position pos) {return true;}

    /**
     * a method for determining if a piece puts the king in check
     * @param p the player that has the king.
     * @return true if it puts the king in that position in check and, false if otherwise
     */
    public boolean putInCheck(Players p) {return true;}



}
