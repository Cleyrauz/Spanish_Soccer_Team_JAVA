public class Referee extends Person implements IAction {

    public Referee(String name, String lastName, int age, int id) {
        super(name, lastName, age, id);
    }

    public String actionInField() {
        return "Apply rules in game";
    }

    public String penalize(IPenalizable person){
        return person.getPenalize();
    }

    public String niceName() {
        return this.getName() + " " + this.getLastName();
    }
}
