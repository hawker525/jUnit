package be.vdab.repositories;

import java.math.BigDecimal;

/**
 * Created by Maarten Westelinck on 19/12/2016.
 */
public class KostRepositoryStub implements KostRepository{
    public BigDecimal findTotaleKost() {
        return new BigDecimal(20);
    }
}
