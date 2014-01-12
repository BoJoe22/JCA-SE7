package AccessModifiers.library;

/**
 * Test classes for understanding Java access modifiers
 * Created by Josef on 1/11/14.
 */
public class Librarian {
    public Librarian() {
        Book book = new Book();

        book.author = "ABC";    //protected member of Book class
        book.modifyTemplate();  //protected method of Book class

        int c = book.issueCount;    //default access member of Book class
        book.issueHistory();        //default access method of Book class
    }
}
