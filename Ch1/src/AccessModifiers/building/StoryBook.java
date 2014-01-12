package AccessModifiers.building;

import AccessModifiers.library.Book;

/**
 * Test classes for understanding Java access modifiers
 * Created by Josef on 1/11/14.
 */
public class StoryBook extends Book {
    public StoryBook() {
        author = "ABC";     //protected member from Book class
        modifyTemplate();   //protected member from Book class

//        int c = issueCount; //compile error: issueCount has default access in Book class
//        issueHistory();     //compile error: issueHistory has default access in Book class
    }
}
