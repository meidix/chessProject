package Board;

import pieces.piece;
/**
 * Position class
 * used for the address of each square in the board
 */

public class Position
{
    private int x;
    private int y;

    // just initializing the two numbers to member variables
    public Position(int u_x, int u_y)
    {
        x = u_x;
        y = u_y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public void setPosition(int _x, int _y)
    {
        x = _x;
        y = _y;
    }

    //TODO: override the equals function
}
