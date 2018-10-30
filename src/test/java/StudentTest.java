package unimanager;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

  private Student sDummy;

  @Before
  public void init(){
    /* Create a Student object using its constructor */
    sDummy = new Student("Max", "Muster", 10000);
  }

  @Test
  public void testStudentGetter(){
    assertEquals("Max", sDummy.getFirstname());
    assertEquals("Muster", sDummy.getLastname());
    assertEquals(10000, sDummy.getStudentId());
  }

  @Test
  public void testStudentSetter(){
    sDummy.setFirstname("János");
    sDummy.setLastname("Kovács");
    sDummy.setStudentId(10001);
    assertEquals("János", sDummy.getFirstname());
    assertEquals("Kovács", sDummy.getLastname());
    assertEquals(10001, sDummy.getStudentId());
  }
}
