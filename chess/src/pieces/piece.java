package pieces;

import Board.Board;
import Board.Position;

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
    /**
     * an enum for the colours
     *
     */
    protected enum Colour
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
     *
     */
    public piece()
    {
        isAlive = true;
    }

    /**
     *
     * @param u_pos
     * the position of the piece
     *
     *
     * @param col
     * the colour of the piece
     *
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
    }

    public void capture(Position pos)
    {
        if (Board.isEmpty(pos)) return;
        piece p = Board.get(pos.getX(), pos.getY());
        p.captured();
        this.move(pos);
    }

    public void move(Position pos){}
    public void captured()
    {
            isAlive = false;

    }

    public boolean isAlive()
    {
        return isAlive;
    }
    public Position position()
    {
        return position;
    }
    public void setPosition(int x, int y)
    {
        position.setPosition(x, y);
    }
    public boolean isThere(Position pos) {return true;}



}
