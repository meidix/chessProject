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

    }

    @Override
    public boolean isThere(Position pos)
    {
        if(Board.isEmpty(pos))
            return false;
        return true;
    }

}
