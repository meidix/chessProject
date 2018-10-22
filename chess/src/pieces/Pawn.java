package pieces;

import Board.Position;
import java.util.*;

public class Pawn extends piece
{

    /**
     *
     * @param u_pos
     * the position of the piece
     *
     * @param col
     * the colour of the piece
     *
     */
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
            else if(Math.abs(y1 - y0) > 1) // TODO: throw exception
            else if (PawnInPosition()) setPosition(x1, y1);
            else if(x1 - x0 == 1) setPosition(x1, y1);
            else // TODO: throw exception
        }
        else
        {
            if (x1 >= x0 || x0 - x1 > 2 )// TODO: throw an exception
            else if(Math.abs(y1 - y0) > 1) // TODO: throw exception
            else if (PawnInPosition()) setPosition(x1, y1);
            else if(x0 - x1 == 1) setPosition(x1, y1);
            else // TODO: throw exception
        }

    }

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

}
