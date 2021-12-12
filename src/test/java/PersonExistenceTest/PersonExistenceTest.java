package PersonExistenceTest;

import org.junit.Test;
import person.Person;

public class PersonExistenceTest {

    @Test(expected =IllegalArgumentException.class)
    public void testExistence() {
        Person persoana=new Person("Bianca",null);
        persoana.checkCNP();
    }
}
