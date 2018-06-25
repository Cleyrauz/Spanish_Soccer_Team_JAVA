public class BenchPlayer extends Person implements IAction, ITrain {

    private String playingPosition;
    private int squadNumber;

    public BenchPlayer(String name, String lastName, int age, int id, String playingPosition, int squadNumber) {
        super(name, lastName, age, id);
        this.playingPosition = playingPosition;
        this.squadNumber = squadNumber;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public String getPlayingPosition() {
        return playingPosition;
    }

    public String train() {
        return "Training";
    }

    public String niceName() {
        return this.getName() + " " + this.getLastName();
    }

    public String warmUp() {
        return "Warming up";
    }

    public String actionInField() {
        return "Sit in bench";
    }
}
