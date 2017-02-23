package edu.oregonstate.cs361.battleship;

/**
 * Created by michaelhilton on 1/5/17.
 */
public class Ship {
    private String name;
    private int length;
    private Coordinate start;
    private Coordinate end;
    private Coordinate[] myPoints;
    public Ship(String n, int l,Coordinate s, Coordinate e) {
        name = n;
        length = l;
        start = s;
        end = e;
    }
    public Ship(String n, int l) {
        name = n;
        length = l;
    }

    public void setLocation(Coordinate s, Coordinate e) {
        start = s;
        end = e;

    }
    public void setPoints(Coordinate[] points){
        myPoints = points;
    }

    public Coordinate[] getPoints(){
        return myPoints;
    }

    public boolean covers(Coordinate test) {
        //horizontal
        if(start.getAcross() == end.getAcross()){
            for(int i = 0; i < this.length; i++){
                Coordinate loop = new Coordinate(start.getAcross(), start.getDown() + i);
                if(test.equals(loop))
                    return true;
            }
        }
        //vertical
        else{
            for(int i = 0; i < this.length; i++){
                Coordinate loop = new Coordinate(start.getAcross() + i, start.getDown());
                if(test.equals(loop)){
                    return true;
                }
            }
            return false;


        }
        return false;
    }

    public int getLength(){
        return length;
    }

}
