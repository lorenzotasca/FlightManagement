package tascal;

import java.time.LocalDate;

public class Flight {
    String code;
    String departureAp;
    String arrivalAp;
    LocalDate dateFly;
    String dapartureTime;
    String arrivalTime;
    int nSeats;
    double cost;

    public Flight(String dAp, String aAp, LocalDate dateF, String dTime, String aTime, int nS, double c){
        departureAp = dAp;
        arrivalAp = aAp;
        dateFly = dateF;
        dapartureTime = dTime;
        arrivalTime = aTime;
        nSeats = nS;
        cost = c;
        code = dateF.getDayOfMonth() + "-" + dateF.getMonth() + "#" + dAp + "_" + aAp + "#" + dateF.getYear();
    }

    public String getCode(){
        return code;
    }

}
