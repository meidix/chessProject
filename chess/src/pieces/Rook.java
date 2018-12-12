package pieces;

import Board.Board;
import Board.Position;
import Players.Players;

public class Rook extends piece
{
    public Rook(Position u_pos, Colour col)
    {
        super(u_pos, col);
    }

    @Override
    public void move(Position pos)
    {
        int x0 = position().getX(), y0 = position().getY(), x1 = pos.getX(), y1 = pos.getY();
        if (x0 == x1 || y0 == y1)
            if(this.isThere(pos))
                setPosition(x1, y1);
    }

    @Override
    public boolean isThere(Position pos)
    {
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
        else return false;
    }

    @Override
    public boolean putInCheck(Players p)
    {
        Position pos = p.kingPos();
        int x0 = this.position().getX(), y0 = this.position().getY(), x1 = pos.getX(), y1 = pos.getY();
        if(x0 == x1 || y0 == y1) return true;
        else return false;
    }


}
