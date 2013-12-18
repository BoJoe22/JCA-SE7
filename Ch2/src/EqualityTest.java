/**
 * Created by josef on 12/17/13.
 */
public class EqualityTest {
    public static void main(String[] args) {
        int number = 10;
        boolean bool = true;
        char myChar = 'c';
        float myFloat = 2.2234f;
        System.out.println(number > myFloat);
        System.out.println(myChar > number);
        System.out.println((int)myChar);
//        System.out.println(bool > myChar);    //shouldn't compile
    }
}
