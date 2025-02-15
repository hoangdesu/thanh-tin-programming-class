package Challenge3.Task4;

import java.util.ArrayList;

public class Panda {
    // Attributes
    private int playerNumber;
    private String playerName;
    private int healthPoint;
    private int xCoord;
    private int yCoord;
    private Team team;

    // Constructor methods
    public Panda(int playerNumber, String playerName, Team team) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        this.healthPoint = 100;
        this.team = team;
        this.xCoord = team.getXCoordHome();
        this.yCoord = team.getYCoordHome();
        ArrayList<Panda> currentMembers = team.getMemberList();
        currentMembers.add(this); // add nguyên con panda vô team hiện tại (1 or 2)
        team.setMemberList(currentMembers);
    }

    // Calculate the distance in meters from this Panda to another Panda


    public double computeDistanceToOtherPanda(Panda otherPanda) {
        double distance = Math.sqrt(Math.pow(getXCoord() - otherPanda.getXCoord(), 2) +
                Math.pow(getYCoord() - otherPanda.getYCoord(), 2));
        return distance;
    }

    public String toString() {
        return String.format("Player %d: %s, HP: %d, at (%d, %d)",
                getPlayerNumber(), getPlayerName(), getHealthPoint(),
                getXCoord(), getYCoord());
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return this.playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public int getHealthPoint() {
        return this.healthPoint;
    }
    public void setHealthPoint(int healthPoint){
        this.healthPoint = healthPoint;
    }

    public int getXCoord() {
        return this.xCoord;
    }
    public void setXCoord(int xCoord){
        this.xCoord = xCoord;
    }

    public int getYCoord(){
        return this.yCoord;
    }
    public void setYCoord(int yCoord){
        this.yCoord = yCoord;
    }

    public void setCoordinate(int xCoord, int yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public Team getTeam() {
        return this.team;
    }
    public void setTeam(Team team){
        this.team = team;
    }

    public void teleportHome() {
        this.xCoord = this.team.getXCoordHome();
        this.yCoord = this.team.getYCoordHome();
    }
}
