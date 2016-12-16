package be.vdab.valueObjects;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by maarten on 12/16/16.
 *
 */
public class VeilingTest {

    private Veiling v;

    @Before
    public void before() {
        v = new Veiling();
    }

    @Test
    public void hoogsteBodIs0VoorEersteBod() {
        Veiling v = new Veiling();
        assertEquals(0, v.getHoogsteBod());
    }

    @Test
    public void naEersteBodIsHoogsteBodGelijkAanEersteBod() {
        Veiling v = new Veiling();
        int bod =120;
        v.doeBod(bod);
        assertEquals(bod, v.getHoogsteBod());
    }

     @Test
    public void naMeerdereBiedingenIsHoogsteBodGelijkAanSom() {
        Veiling v = new Veiling();
        int b1 = 50;
        int b2 = 70;
        int b3 = 90;
        int b4 = 30;
        v.doeBod(b1);
        v.doeBod(b2);
        v.doeBod(b3);v.doeBod(b4);
        assertEquals(b3, v.getHoogsteBod());
    }

}