package Models.Entities;

import java.util.Date;

public class Reservation {

    private Integer numberHome;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer numberHome, Date checkIn, Date checkOut){
        this.numberHome = numberHome;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(Integer numberHome) {
        this.numberHome = numberHome;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }


}
