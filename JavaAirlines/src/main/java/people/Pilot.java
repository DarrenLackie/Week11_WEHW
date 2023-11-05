package people;

public class Pilot extends Person {

    private String licenceNumber;
    private CrewRank crewRank;

    public Pilot(String name, String licenceNumber, CrewRank crewRank) {
        super(name);
        this.licenceNumber = licenceNumber;
        this.crewRank = crewRank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane(){
        return "Vroom vroom away we go!";
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public CrewRank getCrewRank() {
        return crewRank;
    }
}
