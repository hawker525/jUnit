package be.vdab.services;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
import be.vdab.repositories.OpbrengstRepositoryStub;
import static org.mockito.Mockito.*;
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
    private KostRepository k;
    private OpbrengstRepository o;

    @Before
    public void before() {
        k = mock(KostRepository.class);
        o = mock(OpbrengstRepository.class);
        when(k.findTotaleKost()).thenReturn(BigDecimal.valueOf(20));
        when(o.findTotaleOpbrengst()).thenReturn(BigDecimal.valueOf(50));
        w = new WinstService(o, k);
    }

    @Test
    public void opbrengst50Min20Is30() {
        BigDecimal winst = w.getWinst();
        assertEquals(20.0, winst.doubleValue(), 0.0);
        verify(k).findTotaleKost();
        verify(o).findTotaleOpbrengst();
    }

}