package be.vdab.valueObjects;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by maarten on 12/16/16.
 */
public class WoordTest {


    @Test
    public void eenLetterWoordIsEenPalindroom() {
        Woord woord = new Woord("a");
        assertTrue(woord.isPalindroom());
    }

    @Test
    public void muisIsGeenPalindroom() {
        Woord woord = new Woord("muis");
        assertFalse(woord.isPalindroom());
    }

    @Test
    public void LepelIseenPalindroom() {
        Woord woord = new Woord("lepel");
        assertTrue(woord.isPalindroom());
    }
}