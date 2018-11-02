package pieces;

import Board.Position;
import Players.Players;

import java.util.*;

import static java.lang.Math.abs;

public class Pawn extends piece
{
    public Pawn(Position u_pos, Colour col)
    {
        super(u_pos, col);
    }


    @Override
    public void move(Position pos)
    {
        int x0 = position().getX(), y0 = position().getY(), x1 = pos.getX(), y1 = pos.getY();
        if (getColour().equals(Colour.BLACK))
        {
            if (x1 <= x0 || x1 - x0 > 2 ) // TODO: throw an exception
            else if(abs(y1 - y0) > 1) // TODO: throw exception
            else if (PawnInPosition()) setPosition(x1, y1);
            else if(x1 - x0 == 1) setPosition(x1, y1);
            else // TODO: throw exception
        }
        else
        {
            if (x1 >= x0 || x0 - x1 > 2 )// TODO: throw an exception
            else if(abs(y1 - y0) > 1) // TODO: throw exception
            else if (PawnInPosition()) setPosition(x1, y1);
            else if(x0 - x1 == 1) setPosition(x1, y1);
            else // TODO: throw exception
        }

    }

    /**
     * checks if the pawn is in the starting place or not
     * @return true if in position
     */
    public boolean PawnInPosition()
    {
        if(getColour().equals(Colour.BLACK))
        {
            for (int i = 0; i < 8; i++) {
                Position pos = new Position(2, i);
                if (position().equals(pos))
                    return true;
            }
            return false;
        }
        else
        {
            for (int i = 0; i < 8; i++) {
                Position pos = new Position(6, i);
                if (position().equals(pos))
                    return true;
            }
            return false;
        }
    }

    @Override
    public boolean putInCheck(Players p)
    {
        Position king = p.kingPos();
        int x0 = this.position().getX(), y0 = this.position().getY(), x1 = king.getX(), y1 = king.getY();
        if(abs(x1 - x0) == 1 && abs(y1 - y0) == 1) return true;
        else return false;
    }

}
