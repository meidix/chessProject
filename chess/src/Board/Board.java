package Board;

import pieces.piece;
public class Board
{
    public static piece[][] matrix = new piece[8][8];
    public Board()
    {
        for(int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
            {
                matrix[i][j] = null;
            }
    }
    public static piece get(int x, int y)
    {
        return matrix[x][y];
    }
    public static boolean isEmpty(Position pos)
    {
        if (matrix[pos.getX()][pos.getY()] == null) return true;
        else return false;
    }
    public void putPiece(piece p)
    {
        Position po = p.position();
        matrix[po.getX()][po.getY()] = p;
    }


}
