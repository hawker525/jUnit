package be.vdab.testsuites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * Created by Maarten Westelinck on 19/12/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({be.vdab.valueObjects.IsbnTest.class, be.vdab.valueObjects.JaarTest.class})
public class AllesMetIsbnEnJaarTest {
}
