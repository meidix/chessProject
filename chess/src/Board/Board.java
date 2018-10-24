package Board;

import pieces.piece;

/**
 * a class for initilizing the game board
 * matrix is the board
 * defined static
 * should be used outside of class without any need to a Board obj
 *
 */
public class Board
{
    public static piece[][] matrix = new piece[8][8];

    /**
     * default constructor
     * setting all the matrix cells to null
     */
    public Board()
    {
        for(int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
            {
                matrix[i][j] = null;
            }
    }

    /**
     * return the piece in the addressed cell
     * @param x the parameter of Position defining rows.
     * @param y the parameter o Position defining coloumns
     * @return the piece located in the indexed cell of the matrix
     */
    public static piece get(int x, int y)
    {
        return matrix[x][y];
    }

    /**
     * see if the addressed cell is empty
     * @param pos the position in which it checks if is empty or not
     * @return the boolean type (true ot false) in either case
     */
    public static boolean isEmpty(Position pos)
    {
        if (matrix[pos.getX()][pos.getY()] == null) return true;
        else return false;
    }

    /**
     * puts the piece in the addressed cell
     * @param p the piece that we is going to be put
     */
    public void putPiece(piece p)
    {
        Position po = p.position();
        matrix[po.getX()][po.getY()] = p;
    }
}
