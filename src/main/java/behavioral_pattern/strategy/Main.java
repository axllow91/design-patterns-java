package behavioral_pattern.strategy;

import java.math.BigDecimal;

/*
* Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.
* Typically, we would start with an interface which is used to apply an algorithm, and then implement it multiple times for each possible algorithm.
* Let's say we have a requirement to apply different types of discounts to a purchase,
* based on whether it's a Christmas, Easter or New Year. First, let's create
* a Discounter interface which will be implemented by each of our strategies:
*
* */
public class Main {
    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();
        BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));
        
    }
}
