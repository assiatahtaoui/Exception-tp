package exercie2;

public class CompteInexistantException extends Exception{
    public CompteInexistantException (String message){
        super("compte inexistant");
    }
}
