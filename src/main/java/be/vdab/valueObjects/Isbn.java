package be.vdab.valueObjects;

import java.util.regex.Pattern;

/**
 * Created by Maarten Westelinck on 19/12/2016.
 */
public class Isbn {

    private long isbn;
    private static final Pattern EXPR = Pattern.compile("(978|979)\\d{10}");

    @Override
    public String toString() {
        return Long.toString(isbn);
    }

    public Isbn(long isbn) {
        if(!checkIsbn(isbn)) throw new IllegalArgumentException();
        this.isbn = isbn;
    }


    private static boolean checkIsbn(long isbn){
        if(!EXPR.matcher(Long.toString(isbn)).matches()) return false;

        long sum_even = 0, sum_oneven = 0;
        String sIsbn = Long.toString(isbn);
        for(int i = 0; i < sIsbn.length()-1; i++) {
            Long cijfer = Long.parseLong(sIsbn.charAt(i) + "");
            if((i+1) % 2 == 0){
               sum_even += cijfer;
            } else {
                sum_oneven += cijfer;
            }
        }
        long sum = sum_oneven + sum_even * 3;
        long difference =(long) Math.ceil(((float)sum)/10) * 10 - sum;
        return (difference == 10) ? sIsbn.charAt(12) == '0' : String.valueOf(sIsbn.charAt(12)).equals(Long.toString(difference));
    }
}
