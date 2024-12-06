package Booking;

public class bookInfo extends personal{
    private String name;
    private int days;
    private int nights;

    public Payment payment;

    public bookInfo(String name, int days, int nights,String userId){
        this.setUserId(userId);
        this.name=name;
        this.days=days;
        this.nights=nights;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getNights() {
        return nights;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "\nbookInfo for " +
                " " + name + '\'' +
                "staying for  " + days +
                "days and " + nights+" nights" +" Identity Prrof:" + getUserId()  +getPayment();
    }
}
