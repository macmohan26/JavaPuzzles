package practice.arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        System.out.println(search(new int[]{2,3,4,5,6,7}, 5)); // 3
        System.out.println(search(new int[]{2,3,4,5,6,7}, 9)); // -1

    }

    public static int search(int[] nums, int target){

        int ret = -1;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == target){
                ret = i;
                break;
            }
        }
        return ret;
    }
}
