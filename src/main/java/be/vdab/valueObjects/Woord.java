package be.vdab.valueObjects;

/**
 * Created by maarten on 12/16/16.
 *
 */
public class Woord {
    private String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    public boolean isPalindroom(){
        return woord.equals(new StringBuilder(woord).reverse().toString());
    }
}
