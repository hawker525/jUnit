package be.vdab.valueObjects;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by maarten on 12/16/16.
 *
 */
public class JaarTest {

    @Test
    public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar(){
        Jaar jaar = new Jaar(2000);
        assertEquals(true, jaar.isSchrikkeljaar());
    }

    @Test
    public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() throws Exception {
        assertEquals(false, new Jaar(1900).isSchrikkeljaar());
    }

    @Test
    public void equalsOpTweeDezelfdeJarenMoetTrueZijn() throws Exception {
        assertEquals(new Jaar(2015), new Jaar(2015));
    }

    @Test
    public void equalsOpTweeVerschillendeJarenMoetFalseZijn(){
        assertNotEquals(new Jaar(2015), new Jaar(2016));
    }

    @Test
    public void hashCodeOpTweeDezelfdeJarenMoetGelijkZijn(){
        assertEquals(new Jaar(2015).hashCode(), new Jaar(2015).hashCode());
    }
}