package be.vdab.services;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
import be.vdab.repositories.OpbrengstRepositoryStub;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Maarten Westelinck on 19/12/2016.
 *
 */
public class WinstServiceTest {

    private WinstService w;

    @Before
    public void before() {
        KostRepository k = new KostRepositoryStub();
        OpbrengstRepository o = new OpbrengstRepositoryStub();
        w = new WinstService(o, k);
    }

    @Test
    public void opbrengst50Min20Is30() {
        BigDecimal winst = w.getWinst();
        assertEquals(20.0, winst.doubleValue(), 0.0);
    }

}