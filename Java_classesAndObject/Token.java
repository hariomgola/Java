package Java_classesAndObject;

public class Token {
    private static int tokenNumber;
    private int counterNumber;
    private String servieType;
    
    // constructor
    public Token(String _serviceType){
        this.servieType = _serviceType;
        tokenNumber++;
    }

    public static int getTokenNumber(){
        return tokenNumber;
    }
    // Functionality method
    public int getCounterNumber(){
        if(servieType.equalsIgnoreCase("Deposit"))
            return 3;
            if(servieType.equalsIgnoreCase("Withdraw"))
            return 2;
            if(servieType.equalsIgnoreCase("Cheque depositt"))
            return 1;
            if(servieType.equalsIgnoreCase("Others"))
            return 4;
        return 0; // for error handling.
    }
    public String getServiceType(){
        return servieType;
    }
}
