package logic;

public class Logic {
    public enum Colour
    {
        WHITE, BLACK;
    }

    public Colour Turn(){
        boolean turn = false;
        if( turn == true){
          return Colour.WHITE;
        }
        else{
            return Colour.BLACK;
        }
    }
}
