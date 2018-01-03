package models;

/**
 * Created by Guest on 1/3/18.
 */
public class Player {
    private String name;
    private String status;// winner or loser

    public Player(String name){
        this.name = name;
    }

    public String getStatus(){
        return this.status;
    }
    public String getName(){
        return this.name;
    }
    public  void setStatus(String status){
        this.status =status;
    }
    public  void setName(String name){
        this.name =name;
    }
}
