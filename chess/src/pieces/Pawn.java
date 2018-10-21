package pieces;

import Board.Position;

public class Pawn extends piece
{
    public Pawn(Position u_pos, Colour col)
    {
        super(u_pos, col);
    }


    @Override
    public void move(Position pos)
    {
        if (getColour().equals(Colour.BLACK))
        {
            if (PawnInPosition())
            {
                if(position().getY() == pos.getY() && position().getX() - pos.getX() >=2 && position().getX() - pos.getX() == 1)
                {
                    setPosition(pos.getX(), pos.getY());
                }
                else
                    //TODO: throw exception;
            }
            else
            {
                if(position().getY() == pos.getY() && position().getX() - pos.getX() == 1)
                {
                    setPosition(pos.getX(), pos.getY());
                }
                else{
                    //TODO: throw exception
                }
            }
        }
        else
        {
            if (PawnInPosition())
            {
                if(position().getY() == pos.getY() && position().getX() - pos.getX() == 2 && position().getX() - pos.getX() == 1)
                {
                    setPosition(pos.getX(), pos.getY());
                }
                else{
                    //TODO: throw exception;
                }

            }
            else
            {
                if(position().getY() == pos.getY() && position().getX() - pos.getX() == 1)
                {
                    setPosition(pos.getX(), pos.getY());
                }
                else {
                    //TODO: throw exception
                }

            }
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
