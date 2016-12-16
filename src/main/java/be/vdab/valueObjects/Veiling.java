package be.vdab.valueObjects;

/**
 * Created by maarten on 12/16/16.
 *
 */
public class Veiling {

    private int hoogsteBod = 0;

    public void doeBod(int bedrag) {
        if (bedrag > hoogsteBod) hoogsteBod = bedrag;
    }

    public int getHoogsteBod() {
        return hoogsteBod;
    }
}
