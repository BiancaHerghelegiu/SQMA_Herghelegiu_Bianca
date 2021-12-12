package person;

import org.junit.Test;

public class PersonExistenceTest {

    @Test(expected =IllegalArgumentException.class)
    public void testExistence() {
        Person persoana=new Person("Bianca",null);
        persoana.checkCNP();
    }
}
