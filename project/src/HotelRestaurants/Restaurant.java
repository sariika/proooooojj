package HotelRestaurants;

public class Restaurant {
    private String name;
    private String cuisineType;
    private double averageCost;

    public Restaurant(String name, String cuisineType, double averageCost) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.setAverageCost(averageCost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(double averageCost) {
        if (averageCost < 0.1) {
            throw new IllegalArgumentException("Average cost cannot be negative.");
        }
        this.averageCost = averageCost;
    }



    @Override
    public String toString() {
        return "Restaurant: " +
                name +
                ", Type of Food: " + cuisineType +
                 ", The average cost is €" +
                averageCost;
    }
}
