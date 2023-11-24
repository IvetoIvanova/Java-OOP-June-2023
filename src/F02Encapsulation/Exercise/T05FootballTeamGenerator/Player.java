package F02Encapsulation.Exercise.T05FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.\n");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        isValidStat(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        isValidStat(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        isValidStat(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        isValidStat(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        isValidStat(shooting, "Shooting");
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }


    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }

    private void isValidStat(int statValue, String statName) {
        boolean isInvalid = statValue < 0 || statValue > 100;
        if (isInvalid) {
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", statName));
        }
    }
}
