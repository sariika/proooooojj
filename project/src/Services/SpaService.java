package Services;

public class SpaService implements Service {
    private String serviceName;
    private double cost;

    public SpaService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceDetails() {
        return "Spa Service: " + serviceName;
    }

    public double getCost() {
        return cost;
    }
}
