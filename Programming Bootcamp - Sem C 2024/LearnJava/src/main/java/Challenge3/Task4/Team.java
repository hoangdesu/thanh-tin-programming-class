package Challenge3.Task4;

import java.util.ArrayList;

// Define the Team class here
public class Team {
    // Attributes
    private int teamNumber, xCoordHome, yCoordHome;
    private ArrayList<Panda> teamMembers;

    // Constructor methods
    //    default empty constructor
    public Team() {}

    public Team(int teamNumber, int xCoordHome, int yCoordHome) {
        this.teamNumber = teamNumber;
        this.xCoordHome = xCoordHome;
        this.yCoordHome = yCoordHome;
        teamMembers = new ArrayList<>();
    }


    // Define the getTeamNumber method
    public int getTeamNumber() {
        return this.teamNumber;
    }

    // Define the setTeamNumber method
    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    // Define the getMemberList method
    public ArrayList<Panda> getMemberList() {
        return this.teamMembers;
    }

    // Define the setMemberList method
    public void setMemberList(ArrayList<Panda> members) {
        this.teamMembers = members;
    }

    // Define the getXCoordHome method
    public int getXCoordHome() {
        return this.xCoordHome;
    }

    // Define the setXCoordHome method
    public void setXCoordHome(int xCoordHome) {
        this.xCoordHome = xCoordHome;
    }

    // Define the getYCoordHome method
    public int getYCoordHome() {
        return this.yCoordHome;
    }

    // Define the setYCoordHome method
    public void setYCoordHome(int yCoordHome) {
        this.yCoordHome = yCoordHome;
    }

}

