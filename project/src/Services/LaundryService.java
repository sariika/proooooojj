package Services;

public class LaundryService implements Service {
    private String serviceName;
    private double cost;

    public LaundryService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceDetails() {
        return "Laundry Service: " + serviceName;
    }

    public double getCost() {
        return cost;
    }
}
