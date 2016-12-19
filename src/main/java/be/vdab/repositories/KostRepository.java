package be.vdab.repositories;

import java.math.BigDecimal;

/**
 * Created by Maarten Westelinck on 19/12/2016.
 *
 */
public interface KostRepository {
    BigDecimal findTotaleKost();
}
