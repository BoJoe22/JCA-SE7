package AccessModifiers.library;

/**
 * Test classes for understanding Java access modifiers
 * Created by Josef on 1/11/14.
 */
public class CourseBook extends Book {
    public CourseBook() {
        author = "ABC";     //protected member from Book class
        modifyTemplate();   //protected method from Book class

        int c = issueCount; //default accessibility member from Book class
        issueHistory();     //default accessibility method from Book class
    }
}
