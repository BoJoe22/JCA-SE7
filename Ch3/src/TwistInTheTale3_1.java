/**
 * Twist in the Tale 3.1 from the OCA Java SE 7 book by Mala Gupta (Manning Publications)
 * Created by Josef on 12/24/13.
 */
class Phone {
    String phoneNumber = "123456789";
    void setNumber() {
        String phoneNumber;
        phoneNumber = "987654321";
    }
}

class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println(p1.phoneNumber);
    }
}
