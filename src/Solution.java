public class Solution {

    public static void main(String[] args){

        System.out.println( "count" + numberOfSteps(14));

    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num> 0){
            System.out.println(num);
            if(num %2 !=0 && num !=1){
                num = num - 1;
                count++;
            }
            num = num/2;
            count++;
        }
       return count;

    }


}
