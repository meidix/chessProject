package pieces;

import Board.Position;

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
        if (x0 = x1 || y0 = y1) setPosition(x1, y1);
    }



}
