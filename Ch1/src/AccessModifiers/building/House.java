package AccessModifiers.building;

import AccessModifiers.library.Book;

/**
 * Test classes for understanding Java access modifiers
 * Created by Josef on 1/11/14.
 */
public class House {
    public House() {
        Book book = new Book();
//        book.author = "ABC";    //compile error: author has protected access in Book class
//        book.modifyTemplate();  //compile error: modifyTemplate() has protected access in Book class

//        int c = book.issueCount;    //compile error: issueCount has default access in Book class
//        book.issueHistory();        //compile error: issueHistory() has default access in Book class
    }
}
