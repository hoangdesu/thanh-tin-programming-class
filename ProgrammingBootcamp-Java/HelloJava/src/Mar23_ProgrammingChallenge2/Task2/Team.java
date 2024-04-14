package Mar23_ProgrammingChallenge2.Task2;

public class Team {
    // TODO: Declare private fields - name, wins, losses
    private String name;
    private int wins, losses;


    // TODO: Define mutator methods - (setters)
    //       setName(), setWins(), setLosses()
    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }


    // TODO: Define accessor methods - (getters)
    //       getName(), getWins(), getLosses()

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    // TODO: Define getWinPercentage()
    public double getWinPercentage() {
        return this.wins / ((double) wins + (double) losses);
    }


    // TODO: Define printStanding()
    public void printStanding() {
        if (this.getWinPercentage() >= 0.5) {
            System.out.printf("Congratulations, %s has a winning average!\n", this.name);
        } else {
            System.out.printf("%s has a losing average.\n", this.name);
        }
    }
}