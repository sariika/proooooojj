package hotelRooms;

import hotelRooms.Type;

public class roomBook extends Room {

    public roomBook(int Rno, Type type, Availibility availability) {
        super(Rno, type, availability);
    }

    @Override
    public double price() {
        if (type == Type.SINGLE) {
            return 150;
        } else if (type == Type.DOUBLE) {
            return 300;
        } else if (type == Type.TWIN_ROOM) {
            return 280;
        } else {
            return 400;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Price: " + price();
    }
}
