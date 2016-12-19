package be.vdab.valueObjects;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Maarten Westelinck on 19/12/2016.
 *
 */
public class IsbnTest {

    @Test(expected = IllegalArgumentException.class)
    public void isbn13CijfersLang(){
       Isbn i = new Isbn(1111411L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isbnBegintNietMet978() {
        Isbn i = new Isbn(111111L);
    }

     @Test(expected = IllegalArgumentException.class)
    public void isbnBegintNietMet979() {
        Isbn i = new Isbn(114545623L);
    }

    @Test
    public void juistIsbnNummerTest() {
        Isbn i = new Isbn(9789027439642L);
        assertNotNull(i);
    }

    @Test(expected = IllegalArgumentException.class)
    public void foutIsbnNummerTest() {
        Isbn i = new Isbn(9789025439642L);
    }

}