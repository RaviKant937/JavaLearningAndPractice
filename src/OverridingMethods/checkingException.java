package OverridingMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class SubClass{
    public void abcd() throws IOException {
        System.out.println("tell me");
    }
}
public class checkingException extends SubClass{
    /**
     * IOException,FileNotFoundException works but SQLException will not work here
     * @throws IOException
     */
    @Override
    public void abcd() throws IOException {
        System.out.println("lsjdlfk");
    }
    public static void main(String[] args) {
        checkingException checkingException = new checkingException();
        try {
            checkingException.abcd();
        }catch (Exception exception){
            System.out.println(exception.getStackTrace());
        }
    }
}
