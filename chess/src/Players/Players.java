package Players;

import pieces.*;
import Board.Position;
import Board.Board;

/**
 * class for players names
 * determining the colour of each player
 * using their name and family for determining the winner of the game
 */

public class Players
{
    private String name;
    private String family;
    private piece.Colour color;

    /**
     * default Constructor
     * @param userName the input name of the player
     * @param userFamily the input family of the player
     * @param col the Colour of the player
     */
    public Players(String userName, String userFamily, piece.Colour col)
    {
        name = userName;
        family = userFamily;
        color = col;
    }

    public  final String getName() { return name; }     //name get
    public final String getFamily() { return family; }      //family get
    public final piece.Colour getColor() { return  color; }     //colour get

    public void setName(String s) { name = s; }     //name set
    public void setFamily(String s) { family = s; }     //family set
    public void setColor(piece.Colour col) { color = col; }     //colour set


    /**
     * a method to return the postion of the king in order to check if the king is in check or not
     * @return the position in which the player's king is located
     */
    public Position kingPos()
    {
        Position pos = new Position();
        for (int i = 0; i < 8; i ++)
            for (int j = 0; j < 8; j++)
            {
                if (Board.get(i, j).getClass().getName() == "pieces.King") {
                    pos.setPosition(i, j);
                    if (Board.get(i, j).getColour() != this.color) return pos;
                }
                else throw new //Exception;
            }

    }
}
