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
        } catch (NoNickException e) {
            e.printStackTrace();
            System.out.println("Problem with nick generator");
            myNick = "this user has no nick";
        } finally {
            //finally wykonuje się zawsze nawet przy obsłudze wyjątku
            // myNick = "finally"; - zawsze podstawi się "finally"
        }

        System.out.println("My nick is " + myNick);

        String nullString = null;
        nullString.concat(" ma kota");

        System.out.println("here?");
    }
}
