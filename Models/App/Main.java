package App;

import Models.Entities.Reservation;
import Models.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        try {
            System.out.print("Number Room: ");
            Integer numberRoom = sc.nextInt();

            System.out.print("Check-In date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.print("Check-Out date(dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            //System.out.println("Error in reservation's date. Please set an date musb be after check In");

            Reservation novoC = new Reservation(numberRoom, checkIn, checkOut);
            System.out.print(novoC.toString());
            //System.out.print(novoC.toString());

            //update

            System.out.println();

            System.out.println("Enter date to update the reservation");
            System.out.print("Check-In: ");
            Date newCheckIn = sdf.parse(sc.next());

            System.out.print("Check-Out: ");
            Date newCheckOut = sdf.parse(sc.next());

            novoC.updateDates(newCheckIn, newCheckOut);

        }

        catch(ParseException error){
            System.out.println("Invalide date format");
        }
        catch (DomainException error){
            System.out.println("Error in reservation: " + error.getMessage());
        }
        sc.close();
    }
}
