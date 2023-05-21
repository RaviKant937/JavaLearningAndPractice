package play_with_exceptions;

public class ReturnWithinTryBlock {
    public static void main(String[] args) {
        subtract();
    }

    public static void subtract(){
        try{
            System.out.println("we are in try block.");
            System.exit(0);//it is used to terminate the JVM abruptly.
            return;
        }catch (Exception exception){

        }finally {
            System.out.println("we are in finally block.");
        }
    }
}
