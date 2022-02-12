package mark.nestedClasses;

import java.util.Random;

class StandardThread implements Runnable {

    @Override
    public void run() {
        System.out.println("StandardThreadClass");
    }
}

/**
 * Example of Anonymous Class which can be used in Threads.
 */
public class AnonymousClassExample {
    public static void main(String[] args) throws InterruptedException {

        //Standard class
        Thread threadStandardClass = new Thread(new StandardThread());

        // AnonymousClass
        Thread threadAnonymousClass = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadAnonymousClass");
            }
        });

        // Lambda
        Thread threadAnonymousClassLambda = new Thread(() -> System.out.println("threadAnonymousClassLambda"));

        threadStandardClass.start();
        threadAnonymousClass.start();
        threadAnonymousClassLambda.start();

        threadStandardClass.join();
        threadAnonymousClass.join();
        threadAnonymousClassLambda.join();

        System.out.println();

        Calculating calculating = new Calculating();
        calculating.print.output();
    }
}

/**
 * Example of INNER Anonymous Class.
 */
interface IOutput {
    void output();
}

class Calculating {
    int calc;

    Calculating(){
        Random random = new Random();
        calc = random.nextInt(10);
    }

    IOutput print = new IOutput() {
        public void output() {
            boolean push = false;
            int cols = 5;
            int rows = 7;
            for (int j = 1; j <= cols; j++) {
                System.out.print("|");
                if (j == cols / 2 + 1) {
                    push = true;
                }
                for (int k = 1; k <= rows; k++) {
                    if (k == rows / 2 + 1 && push) {
                        System.out.print(calc);
                        push = false;
                    } else
                        System.out.print("-");
                }
                System.out.print("|");
                System.out.println();
            }
        }
    };
}
