package exercie2;

public class FondsInsuffisantsException extends Exception{
    public FondsInsuffisantsException(String message){
        super("fond insuffisant");
    }
}
