import java.util.ArrayList;
import java.util.Date;

public class Match {
    private Date creation;
    private Date date;
    private TeamSeason localTeam;
    private TeamSeason visitantTeam;
    private String location;
    private MatchResult result;

    Match(){
        this.creation=new Date();
        this.result=new MatchResult();
    }
    Match(String location, Date date){
        this.creation=new Date();
        this.setLocation(location);
        this.setDate(date); //asigne fecha
        this.result=new MatchResult();

    }
    Match(String location, Date date, TeamSeason localTeam, TeamSeason visitantTeam){
        this.creation=new Date();
        this.setLocation(location);
        this.setDate(date);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
        this.result=new MatchResult();
    }
    public String generateMarker(){
        return String.format("%s %s %s",
        this.getLocalTeam().getName(),
                this.result.generateMarker(),
                this.getVisitantTeam().getName()
    );
    }
    public void setDate(Date newDate){
        this.date = newDate;
        return;
    }
    public void setLocalTeam(TeamSeason local){
        this.localTeam = local;
        return;
    }
    public void setVisitantTeam(TeamSeason visitant){
        this.visitantTeam = visitant;
        return;
    }

    public void setLocation(String newLocation){
        this.location = newLocation;
        return;
    }

    // makeGoal:: (TeamSeason, Player) -> void
    private void makeGoal(TeamSeason team, Player player){
        if (team.getName()!=this.localTeam.getName()&&
                team.getName()!=this.visitantTeam.getName()) return;
        player.setGoalCounter(player.getGoalCounter()+1);
        player.getName();
    }
    // makeLocalGoal:: (TeamSeason, Player) -> void
    public void makeLocalGoal(int position) {
        Player player= this.localTeam.getPlayers().get(position);
        this.makeGoal(this.localTeam, player);
        this.result.incrementMarkerLocal();
    }
    public void makeVisitantGoal (int position){
        Player player= this.visitantTeam.getPlayers().get(position);
        this.makeGoal(this.visitantTeam,player);
        this.result.incrementMarkerVisitant();
    }
    public String getResult(){
        return "";
    }
    public TeamSeason getLocalTeam() {
        return localTeam;
    }
    public TeamSeason getVisitantTeam() {
        return visitantTeam;
    }
    public Date getCreation() {
        return creation;
    }
}
