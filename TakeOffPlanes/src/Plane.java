public class Plane {
    private String planeId;
    private int fuelLevel;
    private int arrivalTime;

    public Plane(String planeId, int fuelLevel, int arrivalTime) {
        this.planeId = planeId;
        this.fuelLevel = fuelLevel;
        this.arrivalTime = arrivalTime;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Plane Id : "+planeId +" | Fuel Level : "+ fuelLevel +" | Plane Arrival Time : "+arrivalTime+" PM";
    }
}
