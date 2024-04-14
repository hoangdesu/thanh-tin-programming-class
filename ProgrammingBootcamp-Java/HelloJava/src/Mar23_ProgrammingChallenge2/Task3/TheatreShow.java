package Mar23_ProgrammingChallenge2.Task3;

public class TheatreShow {
    private String name;
    private String leadActor;
    private int runningTime;
    private StarRating rating = StarRating.UNRATED;

    public TheatreShow(String name, String leadActor, int runningTime) {
        // check for valid values
        if (name == null || name.length() < 1 || (name.charAt(0) == ' ' || name.charAt(name.length()-1) == ' ')) {
            this.name = "ERROR";
        } else {
            this.name = name.toUpperCase();
        }

        if (leadActor.length() < 1 || leadActor.charAt(0) == ' ' || leadActor.charAt(leadActor.length()-1) == ' ') {
            this.leadActor = "ERROR";
        } else {
            String parsedName = Character.toTitleCase(leadActor.charAt(0)) + leadActor.substring(1, leadActor.length()-1);
            this.leadActor = parsedName;
        }


//        this.leadActor = leadActor;

        if (runningTime < 0) {
            this.runningTime = -1;
        } else {
            this.runningTime = runningTime;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public StarRating getStarRating() {
        return this.rating;
    }

    public boolean setStarRating(StarRating rating) {
        if (this.rating == rating) {
            return false;
        } else {
            this.rating = rating;
            return true;
        }
    }

    public String toString() {
//        name + : + actor + : + runtime + : + star rating
        return String.format("%s:%s:%d:%s\n", this.name, this. leadActor, this.runningTime, this.rating);
    }
}
