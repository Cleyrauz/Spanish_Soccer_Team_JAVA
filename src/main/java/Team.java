import java.util.ArrayList;

public class Team {

    private String name;
    private String country;
    private ArrayList<Player> players;
    private ArrayList<Person> massageTherapists;
    private Person coach;

    public void Team(String name, String country){
        this.country = country;
        this.name = name;
        players = new ArrayList<Player>();
        massageTherapists = new ArrayList<Person>();
    }

    public void setCoach(Person coach) {
        this.coach = coach;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void addMassageTheraphist(Person massageTherapist){
        massageTherapists.add(massageTherapist);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Person getCoach() {
        return coach;
    }

    public ArrayList<Person> getMassageTherapists() {
        return massageTherapists;
    }

    public Player getPlayerById(int id){
        for(Player player : players){
            if(player.getId() == id){
                return player;
            }
        }
        return null;
    }

    public Player getPlayerByPlayingPosition(String position){
        for(Player player: players){
            if(player.getPlayingPosition().equals(position)){
                return player;
            }
        }

        return null;
    }
}
