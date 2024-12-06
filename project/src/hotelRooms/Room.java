package hotelRooms;

public abstract class Room {
    protected int Rno;
    protected Type type;
    protected Availibility availibility;
    //crate a constant number of rules
    public static final int totalRooms = 20;
    public static int roomsBooked;
    public static int availableRooms;

    private Amenities amenities;

    protected Room(int Rno, Type type, Availibility availibility){

        this.Rno=Rno;
        this.availibility=availibility;
        this.type=type;


        //everytime the constructor is called roomsbooked score goes up
        roomsBooked++;

    }

    public void setRno(int rno) {
        Rno = rno;
    }

    public int getRno() {
        return Rno;
    }

    public static int roomsAvailable(){
        availableRooms=totalRooms-roomsBooked;
        System.out.println(availableRooms);
        return availableRooms;

    }

    public void setAmenities(Amenities amenities) {
        this.amenities = amenities;
    }

    public Amenities getAmenities() {
        return amenities;
    }

    public abstract double price();

    @Override
    public String toString() {
        return "Room" +
                "Room No." + Rno +
                ", Room Type :" + type +
                ", availibility:" + availibility + getAmenities();


    }
}
