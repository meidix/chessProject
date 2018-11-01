package pieces;

import Board.Position;
import Board.Board;

public class King extends piece
{
    public King(Position pos, piece.Colour col)
    {
        super(pos, col);
    }

    @Override
    public void move(Position pos)
    {

    }

    @Override
    public boolean isThere(Position pos)
    {
        int x0 = position().getX(), y0 = position().getY(), x1 = pos.getX(), y1 = pos.getY();
        if (x1 - x0 <= 1 && y1 - y0 <= 1)
        {
            if (Board.isEmpty(pos)) return true;
            else return false;
        }
        else return false;
    }


    /**
     * a method to check if the king is in check or not
     * @param p is the player.. player argument is sent to the method in order to determine the color
     * @return true if the friend king is in check
     */
    public boolean inCheck(Players.Players p)
    {
        Position pos = p.kingPos();
        for(int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (Board.get(i, j).putInCheck(pos)) return true;
            }
        }
        return false;
    }



}
