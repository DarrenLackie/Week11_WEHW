package airline;

public enum PlaneType {

    BOEING747(300, 3000),
    DREAMLINER(200, 2000),
    BOEING737(100, 1000),
    TESTSMALLPLANE(2, 50);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
