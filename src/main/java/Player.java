public class Player extends Person implements IAction, ITrain, IPenalizable {

    private int squadNumber;
    private String playingPosition;

    public Player(String name, String lastName, int age, int id, String playingPosition, int squadNumber) {
        super(name, lastName, age, id);
        this.playingPosition = playingPosition;
        this.squadNumber = squadNumber;
    }

    public String train() {
        return "Training";
    }

    public String niceName() {
        return this.getName() + " " + this.getLastName();
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public String getPlayingPosition() {
        return playingPosition;
    }

    public String Interview(){
        return "Give an Interview";
    }

    public String actionInField() {
        return "Play Soccer";
    }

    public String getPenalize() {
        return "Oh no! I am not going to play the next game.";
    }
}

