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
}
