public class MassageTherapist extends Person implements IAction {

    private String certification;
    private int yearsOfExperience;

    public MassageTherapist(String name, String lastName, int age, int id, String certification, int yearsOfExperience) {
        super(name, lastName, age, id);
        this.certification = certification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String actionInField() {
        return "Give massage";
    }

    public String niceName() {
        return this.getName() + " " + this.getLastName();
    }

    public String getCertification() {
        return certification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
