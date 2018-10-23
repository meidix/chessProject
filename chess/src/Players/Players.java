package Players;

import Board.Board;
import Board.Position;
import pieces.*;

public class Players
{
    private String name;
    private String family;
    private piece.Colour color;
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
