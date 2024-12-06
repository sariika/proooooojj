package Booking;

public class personal {
    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "personal" +
                "userId" + userId + '\'' +
                '}';
    }
}
