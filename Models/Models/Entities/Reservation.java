package Models.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {


    private static final SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");

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

    public long Duration(){
     long deference = checkOut.getTime() - checkIn.getTime();
     return TimeUnit.DAYS.convert(deference, TimeUnit.MILLISECONDS);

    }

    public void updateDates(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room " + numberHome + ", " + "Chekin - " + sfd.format(checkIn) + " CheckOut - " + sfd.format(checkOut) +
                " NIGHTS " + Duration();

    }

}
