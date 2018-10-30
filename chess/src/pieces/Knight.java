package pieces;

import Board.Board;
import Board.Position;

public class Knight extends piece
{
    public Knight(Position pos, piece.Colour col)
    {
        super(pos, col);
    }

    @Override
    public void move(Position pos)
    {
        if(isThere(pos))
        {
            this.setPosition(pos.getX(), pos.getY());
        }
    }

    @Override
    public boolean isThere(Position pos)
    {
        int x0 = this.position().getX(), y0 = this.position().getY(), x1 = pos.getX(), y1 = pos.getY();
        if((x0 + 2 == x1 && y0 + 1 == y1) || (x0 + 1 == x1 && y0 + 2 == y1))
        if(!Board.isEmpty(pos))
            return true;
        else
        {
            if(Board.get(pos.getX(), pos.getY()).getColour().equals(this.getColour()))
                return false;
            else return true;
        }
    }

}
