package delegation;

public class Printer {
    // the delegator
    RealPrinter realPrinter = new RealPrinter();

    // create the delegate
    void print() {
        realPrinter.print();
    }
}
