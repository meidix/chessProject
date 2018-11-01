package pieces;

import Board.Board;
import Board.Position;

public class Queen extends piece
{
    public Queen(Position pos, piece.Colour col)
    {
        super(pos, col);
    }

    @Override
    public void move(Position pos)
    {
        // FIXME: double check this funtion
        int x0 = position().getX(), y0 = position().getY(), x1 = pos.getX(), y1 = pos.getY();
        if (x0 == x1 || y0 == y1)
            if(this.isThere(pos))
                setPosition(x1, y1);
        else if(x1 != x0)
        {
            int gap = Math.abs(x1 - x0);
            if (Math.abs(y1 - y0) == gap)
            {
                if (isThere(pos)) setPosition(x1, y1);
                else // TODO: throw an exception
            }
        }
        else // TODO: throw an exception
    }

    @Override
    public boolean isThere(Position pos)
    {
        // FIXME: double check this function later
        int x0 = position().getX(), y0 = position().getY(), x1 = pos.getX(), y1 = pos.getY();
        if(x0 == x1)
        {
            if (y0 < y1)
            {
                for(int i = y0; i < y1; i++)
                {
                    Position position = new Position(x0, i);
                    if(!Board.isEmpty(position))
                        return false;

                }
                return true;
            }
            else
            {
                for(int i = y1; i < y0; i++)
                {
                    Position position = new Position(x0, i);
                    if(!Board.isEmpty(position))
                        return false;

                }
                return true;
            }
        }
        else if(y0 == y1)
        {
            if (x0 < x1)
            {
                for(int i = x0; i < x1; i++)
                {
                    Position position = new Position(i, y0);
                    if(!Board.isEmpty(position))
                        return false;
                }
                return true;
            }
            else
            {
                for(int i = x1; i < x0; i++)
                {
                    Position position = new Position(i, y0);
                    if(!Board.isEmpty(position))
                        return false;
                }
                return true;
            }
        }
        else if(x0 > x1)
        {
            for (int i = x1; i < x0; i++) {
                Position p = new Position(x1, x1 + 1);
                if (!Board.isEmpty(p)) return false;
            }
            return true;
        }
        else
        {
            for (int i = x0; i < x1; i++) {
                Position p = new Position(x1, x1 + 1);
                if (!Board.isEmpty(p)) return false;
            }
            return true;
        }
    }

}
