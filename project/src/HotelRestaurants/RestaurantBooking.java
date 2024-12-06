package HotelRestaurants;

public final class RestaurantBooking {

    private String customerName;
    private String bookingDate;
    private int numPeople;

    public RestaurantBooking(String customerName, String bookingDate, int numPeople){
        this.customerName = customerName;
        this.bookingDate = bookingDate;
        this.numPeople = numPeople;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    @Override
    public String toString() {
        return "Booking for: " +
                customerName  +
                ", Date: " + bookingDate +
                ", Amount of People: " + numPeople;
    }
}
