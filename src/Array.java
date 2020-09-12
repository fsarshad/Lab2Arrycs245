
//Created a two sum method in the class array to meet the requirements of the
//lab, I followed the lab assignment and tested the examples
//they look good. Professor approved of following the origional spec sheet.

public class Array {
    public  int[]  twoSum  (int [] nums, int target){
        int[] anArray = new int[]{-1,-1};
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] != nums[j] && nums[i]+nums[j] == target){
//                    anArray = new int[1];
                      anArray[0] = i;
                      anArray[1] = j;
                    return anArray;
                }
//                if(nums[i]+nums[j] == target){
//                    anArray = new int[2];
//                    anArray[0] = i;
//                    anArray[1] = j;
//                    return anArray;
//                }

            }
        }
      return anArray;
    }

//this is where you test the cases and add target values.
    public void test()
    {
        int[] result;
        int target = 40;
        int[] testNums = new int[]{35,5, 20, 20, 5, 35};

        result = twoSum(testNums, target);
        if (result[0] == -1)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println("[" + result[0] + "] , [" + result[1] + "]");
        }
    }
    public static void main(String[] args) {
        Array test = new Array();
        test.test();
    }
}
