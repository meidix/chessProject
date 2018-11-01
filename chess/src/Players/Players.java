package Players;

import pieces.*;

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
}
