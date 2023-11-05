package people;

public class CabinCrewMember extends Person {

    private CrewRank crewRank;

    public CabinCrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;
    }

    public CrewRank getCrewRank() {
        return crewRank;
    }

    public String talkToPassengers(){
        return "Sir, the seatbelt sign is still on. Please sit down";
    }
}
