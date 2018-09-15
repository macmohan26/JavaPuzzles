package practice.loops;

public class NestedLoops {

    public static void main(String[] args) {

        int counter =0;
        for (int idx = 0; idx < 100; idx++){

            for (int j=0; j < 2; j++){
                System.out.println("the value of idx was " + idx + "--------" + j);
                counter++;
            }
        }
        System.out.println("COUNTER:" +counter);
    }
}
