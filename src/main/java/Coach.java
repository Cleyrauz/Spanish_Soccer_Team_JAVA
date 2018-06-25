import static org.junit.Assert.assertEquals;

public class Coach extends Person implements IAction, IPenalizable {

    private int idFederation;

    public Coach(String name, String lastName, int age, int id, int idFederation) {
        super(name, lastName, age, id);
        this.idFederation = idFederation;
    }


    public String actionInField() {
        return "Lead a game";
    }

    public String planStrategy(){
        return "Planning a strategy to win the World Cup";
    }

    public String niceName() {
        return this.getName() + " " + this.getLastName();
    }

    public int getIdFederation() {
        return idFederation;
    }

    public String getPenalize() {
        return "Oh no! I will have to see the game from very far away.";
    }
}
