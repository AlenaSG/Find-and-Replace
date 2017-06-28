import org.junit.*;
import static org.junit.Assert.*;

public class FindAndReplaceTest {

  @Test
  public void runFindAndReplace_AContainsA_true() {
    String stringOne = "A";
    String stringTwo = "A";
    Boolean expected = true;
    assertEquals(expected, stringOne.contains(stringTwo));
  }

  @Test
  public void runFindAndReplace_ReplaceCatWithDog_String() {
    FindAndReplace testFind = new FindAndReplace();
    String stringOne = "Cathedral";
    String stringTwo = "Cat";
    String stringThree = "Dog";
    String expected = "Doghedral";
    assertEquals(expected, testFind.findAndReplace(stringOne, stringTwo, stringThree));
  }

  @Test
  public void runFindAndReplace_ReplaceUpperWithLowerCase_String() {
    FindAndReplace testFind = new FindAndReplace();
    String stringOne = "Cathedral";
    String stringTwo = "cat";
    String stringThree = "Dog";
    String expected = "Doghedral";
    assertEquals(expected, testFind.findAndReplace(stringOne, stringTwo, stringThree));
  }
}
