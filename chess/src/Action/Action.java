package Action;

import Board.Position;
import java.util.*;

public class Action {
    private static Stack<Action> action = new Stack<Action>();
    private Position startPosition;
    private Position endPosition;
    private boolean captures;

    public Action() {}
    public Action(Position sp, Position ep, boolean cap)
    {
        startPosition = sp;
        endPosition = ep;
        captures = cap;
        action.push(this);
    }

    public Action undo()
    {
        return action.pop();
    }

    public Position getStartPosition() {return startPosition; }
    public Position getEndPosition() { return endPosition; }
    public Boolean captures() { return captures; }

    public void setStartPosition(Position pos) { startPosition = pos; }
    public void setEndPosition(Position pos) { endPosition = pos; }
    public void setCaptures(boolean flag) { captures = flag; }





}
