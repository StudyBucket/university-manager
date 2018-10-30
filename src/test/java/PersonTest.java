package unimanager;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

  private Person pDummy;

  @Before
  public void init(){
    /* Create a Person object using its constructor */
    pDummy = new Person("Ludwig Mies", "van der Rohe");
  }

  @Test
  public void testPersonGetter(){
    assertEquals("Ludwig Mies", pDummy.getFirstname());
    assertEquals("van der Rohe", pDummy.getLastname());
  }

  @Test
  public void testPersonSetter(){
    pDummy.setFirstname("Walter");
    pDummy.setLastname("Gropius");
    assertEquals("Walter", pDummy.getFirstname());
    assertEquals("Gropius", pDummy.getLastname());
  }
}
