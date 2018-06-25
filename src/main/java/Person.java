public abstract class Person {

    private String name;
    private String lastName;
    private int age;
    private int id;

    public Person(String name, String lastName, int age, int id) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String travel(){
        return "Traveling to Rusia";
    }

    public String concentration(){
        return "Concentration: Ohhhhmmmm";
    }


}
