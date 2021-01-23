package java_demo.exeption;

public class ExceptionExample {

    //checked exceptions - all inherited from Exceptions but RuntimeExceptions
    //unchecked exceptions - all inherited from RuntimeException
    //errors - inherited directly from Throwable

    public static void main(String[] args) {

        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
            //handle [the only right action] or declare [don't do that]
            //SOLID
        String myNick;
        try {
            myNick = exceptionGenerator.nick();
        } catch (NoNickCheckedException e) {
            e.printStackTrace();
            System.out.println("Problem with nick generator");
            myNick = "this user has no nick";
        } finally {
            //finally wykonuje się zawsze nawet przy obsłudze wyjątku
            // myNick = "finally"; - zawsze podstawi się "finally"
        }

        System.out.println("My nick is " + myNick);

        System.out.println("Now with runtime exceptions...");

        ExceptionGenerator exceptionGenerator2 = new ExceptionGenerator();
        //handle [the only right action] or declare [don't do that]
        //SOLID
        String myNick2;
        try {
            myNick = exceptionGenerator2.nickWithRuntimeException();
        } catch (NoNickRuntimeExc e) {
            e.printStackTrace();
            System.out.println("Problem with nick generator 2");
            myNick2 = "this user has no nick 2";
        } finally {
            //finally wykonuje się zawsze nawet przy obsłudze wyjątku
            // myNick = "finally"; - zawsze podstawi się "finally"
        }

        //String nullString = null;
        //nullString.concat(" ma kota");

        System.out.println("with dealer");
        NickDealer nickDealer = new NickDealer(new ExceptionGenerator());
        String myNickDealer;

        try {
            myNickDealer = nickDealer.nickFromDealer();
        } catch (NoNickCheckedException e) {
            myNickDealer = "no nick from dealer";
            System.out.printf("Problem with dealer");

        }
        System.out.println("Nick from myDealer "+myNickDealer);
        nickDealer.nick();

        System.out.println("here?");
    }
}
