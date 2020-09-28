package behavioral_pattern.strategy;

import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);

//    default Discounter combine(Discounter after) {
//        return value -> after.apply(this.apply(value));
//    }
}
