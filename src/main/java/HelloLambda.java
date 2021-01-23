public class HelloLambda {

    public static void main(String[] args) {

        ManiekRunner maniekRunner = new ManiekRunner();
        maniekRunner.walk();
        Runner runner = new ManiekRunner();
        handleRunner(runner);

              }
        public static void handleRunner (Runner anyRunner){
            System.out.println("handleRnner()");
            anyRunner.go();
        }
    }
