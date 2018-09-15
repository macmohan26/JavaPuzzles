package practice.loops;

public class ForLoopPractice {

    public static void main(String[] args) {

        String name = "sfdfewencsoidfhsjdf";

        for (int i = 0; i < 100; i++){
            System.out.println("i: " + i);
        }

        System.out.println("**********************Loop For String*******************************");
        // for string



        for (int i=0; i<name.length(); i++){
            System.out.println("char: "+ name.charAt(i));
        }

        System.out.println("**********************Reverse the String Order*******************************");

        for (int i = name.length()-1;  i >=0; i--){
            System.out.println("char: "+ name.charAt(i));
        }

        System.out.println("**********************Even Number Between 0 to 100*******************************");

        for (int i = 0; i <= 100; i+=2){
            System.out.println("i: " + i);
        }
    }

}
