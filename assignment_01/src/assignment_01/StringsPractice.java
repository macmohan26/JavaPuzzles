package assignment_01;

// We have a loud barking dog. The "hour parameter is the current hour time in the range 0 ..23.
// We are in trouble if the dog is barking and the hour is before 7 or after 20.
// Return true if we are in trouble.



public class StringsPractice {

    public static void main(String[] args) {

        dogTrouble(true,6);
        dogTrouble(true,7);
        dogTrouble(false, 6);

        System.out.println(dogTrouble(true,6));  // true
        System.out.println(dogTrouble(true,7));  // false
        System.out.println(dogTrouble(false,6)); // false

    }

    public static boolean dogTrouble(boolean barking, int hour){
           // New method to solve the method.
        return (barking && (hour < 7 || hour > 20));

        // Traditional method to solve the problem.
//        if (barking && (hour < 7 || hour > 20)){
//
//            return true;
//        }else
//        return false;
    }
}
