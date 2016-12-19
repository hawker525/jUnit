package be.vdab.services;
import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import static org.mockito.Mockito.*;

import be.vdab.entities.Land;
import org.junit.Before;
import org.junit.Test;
import be.vdab.repositories.LandRepository;
import be.vdab.repositories.LandRepositoryStub;
public class LandServiceTest {
    private LandRepository landRepository;
    private LandService landService;
    @Before public void before() {
        landRepository = mock(LandRepository.class);
        when(landRepository.findOppervlakteAlleLanden()).thenReturn(20);
        when(landRepository.read("B")).thenReturn(new Land("B", 5));
        landService = new LandService(landRepository);
    }
    @Test public void findVerhoudingOppervlakteLandTovOppervlakteAlleLanden() {
        assertEquals(0, BigDecimal.valueOf(0.25).compareTo(
                landService.findVerhoudingOppervlakteLandTovOppervlakteAlleLanden("B")));
        verify(landRepository).findOppervlakteAlleLanden();
        verify(landRepository).read("B");
    }
}
