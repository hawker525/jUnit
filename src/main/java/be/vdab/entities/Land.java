package be.vdab.entities;

/**
 * Created by Maarten Westelinck on 19/12/2016.
 */
public class Land {
    private final String landcode;
    private final int oppervlakte; // je maakt getters voor de private variabelen

    public String getLandcode() {
        return landcode;
    }

    public int getOppervlakte() {
        return oppervlakte;
    }

    public Land(String landcode, int oppervlakte) {
        this.landcode = landcode;
        this.oppervlakte = oppervlakte;
    }
}
