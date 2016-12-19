package be.vdab.services;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.OpbrengstRepository;

import java.math.BigDecimal;

/**
 * Created by Maarten Westelinck on 19/12/2016.
 *
 */
public class WinstService {
    private OpbrengstRepository opbrengstRepository;
    private KostRepository kostRepository;

    public WinstService(OpbrengstRepository opbrengstRepository, KostRepository kostRepository) {
        this.opbrengstRepository = opbrengstRepository;
        this.kostRepository = kostRepository;
    }

    public BigDecimal getWinst() {
        return opbrengstRepository.findTotaleOpbrengst().min(kostRepository.findTotaleKost());
    }
}
