package unimanager;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LecturerTest {

  private Lecturer lDummyOne;
  private Lecturer lDummyTwo;

  @Before
  public void init(){
    /* Create a Lecturer object using its constructor */
    lDummyOne = new Lecturer("Johannes", "Itten", 1001, "Formmeister");
    lDummyTwo = new Lecturer("Wilhelm", "Wagenfeld", 1002);
  }

  @Test
  public void testLecturerGetter(){
    /* with academicDegree */
    assertEquals("Johannes", lDummyOne.getFirstname());
    assertEquals("Itten", lDummyOne.getLastname());
    assertEquals(1001, lDummyOne.getEmployeeId());
    assertEquals("Formmeister", lDummyOne.getAcademicDegree());

    /* without academicDegree */
    assertEquals("Wilhelm", lDummyTwo.getFirstname());
    assertEquals("Wagenfeld", lDummyTwo.getLastname());
    assertEquals(1002, lDummyTwo.getEmployeeId());
    assertEquals(null, lDummyTwo.getAcademicDegree());
  }

  @Test
  public void testLecturerSetter(){
    /* with academicDegree */
    lDummyOne.setFirstname("Anni");
    lDummyOne.setLastname("Albers");
    lDummyOne.setEmployeeId(1003);
    lDummyOne.setAcademicDegree("Werkstattmeisterin");
    assertEquals("Anni", lDummyOne.getFirstname());
    assertEquals("Albers", lDummyOne.getLastname());
    assertEquals(1003, lDummyOne.getEmployeeId());
    assertEquals("Werkstattmeisterin", lDummyOne.getAcademicDegree());

    /* without academicDegree */
    lDummyTwo.setFirstname("Farkas");
    lDummyTwo.setLastname("Molnár");
    lDummyTwo.setEmployeeId(1004);
    lDummyTwo.setAcademicDegree(null);
    assertEquals("Farkas", lDummyTwo.getFirstname());
    assertEquals("Molnár", lDummyTwo.getLastname());
    assertEquals(1004, lDummyTwo.getEmployeeId());
    assertEquals(null, lDummyTwo.getAcademicDegree());
  }
}
