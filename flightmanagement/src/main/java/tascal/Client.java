package tascal;

import java.time.LocalDate;

public class Client {
    String surname;
    String name;
    String bornNation;
    String bornCity;
    LocalDate bornDate;
    String code;

    public Client(String s, String n, String bN, String bC, LocalDate bD){
        surname = s;
        name = n;
        bornNation = bN;
        bornCity = bC;
        bornDate = bD;
        code = n.charAt(0) + s + bN + bC.substring(0, 2) + bD.getYear();
    }

    public String getCode(){
        return code;
    }
}
