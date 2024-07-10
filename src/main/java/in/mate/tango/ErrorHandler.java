package in.mate.tango;

public class ErrorHandler extends Exception {
    
    ErrorHandler(String statuscode){
    super(statuscode);
    }
}
