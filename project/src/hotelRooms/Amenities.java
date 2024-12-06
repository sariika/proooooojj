package hotelRooms;

public class Amenities {
    private boolean WiFi;
    private boolean Breakfast;
    private boolean loungeAccess;

    public Amenities(boolean WiFi, boolean BreakFast, boolean loungeAccess){
        this.Breakfast=BreakFast;
        this.loungeAccess=loungeAccess;
        this.WiFi=WiFi;
    }

    //public roomBook room ;

    public void setWiFi(boolean wiFi) {
        WiFi = wiFi;
    }

    public void setBreakfast(boolean breakfast) {
        Breakfast = breakfast;
    }

    public void setLoungeAccess(boolean loungeAccess) {
        this.loungeAccess = loungeAccess;
    }
    public String getWifi(){
        if(WiFi==true){return "WiFi Available";}
        else{return "no Wifi";}
    }
    public String getBreakfast(){
        if(Breakfast==true){return "Breakfast Available";}
        else{return "paid  Breakfast";}
    }
    public String getLA(){
        if(loungeAccess==true){return "Access to lounge area and spa services";}
        else{return "not applicable";}
    }

    @Override
    public String toString() {
        return " --Includes Amenities :" +
                " " + getWifi() +
                ", " + getBreakfast()+
                " , " + getLA()
                ;
    }
}
