/**
 * Twist in the Tale 3.2 from the OCA Java SE 7 book by Mala Gupta (Manning Publications)
 * Created by Josef on 12/25/13.
 */
class Employee {
    String name;
    int age;
//    Employee() {   // Recursive constructor invocations are not allowed.  Compilation error.
//        this();
//    }
    Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}
