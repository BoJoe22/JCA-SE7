import java.util.ArrayList;

/**
 * Twist in the Tale 4.4 from the OCA Java SE 7 book by Mala Gupta (Manning Publications)
 * Created by Josef on 1/13/14.
 */
public class TwistInTheTale4_4 {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();

        String one = "One";
        String two = new String("Two");

        myArrList.add(one);
        myArrList.add(two);

        ArrayList<String> yourArrList = myArrList;
        one.replace("O", "B");

        for (String val : myArrList)
            System.out.print(val + ":");

        for (String val : yourArrList)
            System.out.print(val + ":");

        StringBuilder[] myArrListA = new StringBuilder[] {new StringBuilder("A"), new StringBuilder("B"),
                new StringBuilder("C")};

        StringBuilder[] yourArrListA = myArrListA.clone();
        myArrListA[0].replace(0,1,"Z");

        for (StringBuilder val : myArrListA)
            System.out.print(val + ":");

        for (StringBuilder val : yourArrListA)
            System.out.print(val + ":");
    }
}
