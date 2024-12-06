package Services;

public class RoomService implements Service {
    private final String serviceName;
    private final double cost;

    public RoomService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceDetails() {
        return "Room Service: " + serviceName;
    }

    public double getCost() {
        return cost;
    }
}
