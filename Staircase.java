import java.util.*;

public class Staircase {
    public static void StaircaseFunc(int n) {
        //create an array filled n with spaces
        List<String> myList  = new ArrayList<String>();

        //iterate n times and each time replace the last item in the 
        //array with a # and then print it out
        for (int i=0; i<n; i++) {
            myList.add(" ");
        }

        String myString = "";
        for (int i=n -1; i>0; i--) {
            myList.set(i, "#");

            myString += (myList.get(i));

            System.out.println(myString);
        }
    }
}