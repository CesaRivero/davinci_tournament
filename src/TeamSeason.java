import java.util.ArrayList;

public class TeamSeason extends Team {private int position;
    private ArrayList<Player> players;


    public ArrayList<Player> getPlayers(){
        return this.players;
    }
    public void addPlayer(Player player){
        //this.players;
        return;
    }

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int position){
        this.position = position;
        return;
    }

    TeamSeason(){


    }
    TeamSeason(String name){
        this.setName(name);

    }
}