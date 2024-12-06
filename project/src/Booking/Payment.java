package Booking;

public class Payment {
    private PType ptype;

    public Payment(PType ptype){
        this.ptype= ptype;
    }

    public void setPtype(PType ptype) {
        this.ptype = ptype;
    }

    public PType getPtype() {
        return ptype;
    }

    @Override
    public String toString() {
        return " Payment by " + ptype
                ;
    }
}
