package be.vdab.valueObjects;

/**
 * Created by maarten on 12/16/16.
 *
 */
public class Jaar {
    private final int jaar;

    public Jaar(int jaar) {
        this.jaar = jaar;
    }

    public boolean isSchrikkeljaar() {
        return jaar % 400 == 0 || jaar % 100 != 0 && jaar % 4 == 0;
    }
}
