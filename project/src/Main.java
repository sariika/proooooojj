import Booking.PType;
import Booking.Payment;
import Booking.bookInfo;
import HotelRestaurants.Restaurant;
import HotelRestaurants.RestaurantBooking;
import Services.LaundryService;
import Services.RoomService;
import Services.Service;
import Services.SpaService;
import hotelRooms.*;


public class Main {
    public static void main(String[] args) {
        roomBook room1 = new roomBook(101, Type.SINGLE,Availibility.VACANT);
        roomBook room2 = new roomBook(102,Type.DOUBLE,Availibility.OCCUPIED);

        Amenities am_single= new Amenities(true,true,false);
        Amenities am_double= new Amenities(true,true,true);
        room1.setAmenities(am_single);
        room2.setAmenities(am_double);


        System.out.println(room1);
        System.out.println(room2);

        //tells the count of room Available
        System.out.println("There are "+Room.roomsAvailable()+" rooms available at the hotel");

        //book info
        bookInfo booking1 = new bookInfo("Alice",3,2,"IRP");
        bookInfo booking2 = new bookInfo("Bob",2,1,"passport");

        Payment pay1 = new Payment(PType.CARD);
        Payment pay2 =new Payment(PType.CASH);

        booking1.setPayment(pay1);
        booking2.setPayment(pay2);

        System.out.println(booking1);
        System.out.println(booking2);

        // Creating some restaurant instances
        Restaurant restaurant1 = new Restaurant("Ocean View", "Seafood", 50.0);
        Restaurant restaurant2 = new Restaurant("Spice Haven", "Indian", 30.0);

        // Display restaurant details
        System.out.println("\nAvailable Restaurants:");
        System.out.println(restaurant1);
        System.out.println(restaurant2);

        // Creating restaurant booking instances
        RestaurantBooking rbooking1 = new RestaurantBooking("Alice", "2024-12-7", 2);
        RestaurantBooking rbooking2 = new RestaurantBooking("Bob", "2024-12-8", 4);

        // Display booking details
        System.out.println("\n Restraunt Bookings:");
        System.out.println(rbooking1);
        System.out.println(rbooking2);

        // Creating services
        Service spaService = new SpaService("Aromatherapy", 100.0);
        Service roomService = new RoomService("Breakfast in Bed", 20.0);
        Service laundryService = new LaundryService("Dry Cleaning", 15.0);

        // Display service details
        System.out.println("\nAvailable Services:");
        System.out.println(spaService.getServiceDetails() + " - Cost: €" + spaService.getCost());
        System.out.println(roomService.getServiceDetails() + " - Cost: €" + roomService.getCost());
        System.out.println(laundryService.getServiceDetails() + "- Cost: €" + laundryService.getCost());
    }
}