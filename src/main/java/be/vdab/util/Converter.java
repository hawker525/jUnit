package be.vdab.util;

import java.math.BigDecimal;

/**
 * Created by maarten on 12/16/16.
 *
 */
public class Converter {
    private static final BigDecimal AANTAL_CENTIMER_IN_EEN_INCH = BigDecimal.valueOf(2.54);

    public BigDecimal inchesNaarCentimeters(BigDecimal inches) {
        return inches.multiply(AANTAL_CENTIMER_IN_EEN_INCH);
    }
}
