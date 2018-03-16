package counter;

import java.util.Scanner;

/**
 * Test the Observer Observable behavior for counter object
 * @author Manusporn Fukkham
 */
public class ObserverTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ConsoleView view = new ConsoleView(counter);
        counter.addObserver(view);

        ConsoleView consoleView = new ConsoleView(counter);
        while (true){
            System.out.print("How much? ");
            int howmuch = new Scanner(System.in).nextInt();
            counter.add(howmuch);
        }
    }
}
