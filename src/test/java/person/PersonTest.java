package person;

import org.junit.Test;

public class PersonTest {

    @Test(expected=IllegalArgumentException.class)
    public void testConformance() {
        Person persoana =new Person("Ionel","29808026754321");
        persoana.checkCNP();
    }

}