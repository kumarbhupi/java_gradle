import junit.framework.TestCase;

public class LibraryTest extends TestCase {

  public void testBookBook() {
    Library library = new Library();
    assert library.bookBook();
    assert !library.bookBook();
  }
}