package Board;

import pieces.piece;

/**
 * Position class
 * used for the address of each square in the board
 * x defines the rows
 * y defines the coloumns
 */

public class Position
{
    private int x;
    private int y;

    /**
     * used when the position is going to be set
     * not default
     */
    public Position() {
        x = 0;
        y = 0;
    }

    /**
     * the main Constructor and the default one
     * @param u_x the value that defines the x
     * @param u_y the value that defines the y
     */
    public Position(int u_x, int u_y)
    {
        x = u_x;
        y = u_y;
    }


    public int getX() { return x; }         //getter function
    public int getY() { return y; }         //getter function
    public void setPosition(int _x, int _y)     // setter function
    {
        x = _x;
        y = _y;
    }

    //TODO: override the equals function
}
