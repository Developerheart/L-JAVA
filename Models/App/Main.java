package App;

import Models.Entities.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Number Room: ");
        Integer numberRoom = sc.nextInt();

        System.out.print("Check-In date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-Out date(dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());


        Reservation novoC = new Reservation(numberRoom, checkIn, checkOut);

        System.out.print(novoC.toString());



        sc.close();


    }
}
