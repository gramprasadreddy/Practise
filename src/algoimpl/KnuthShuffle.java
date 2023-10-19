package algoimpl;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

//Knuth Shuffle Algorithm,Fisher Yates Shuffle
public class KnuthShuffle {
        public static void main(String[] args){
            int[] arr = {5,9,7,10,19,11};
            int i = arr.length-1;
            int count = 0;
            while (i-count > 0){
                int randomNumberBetweenIndex = ThreadLocalRandom.current().nextInt(i-count);
                int tempArrayVariable = arr[randomNumberBetweenIndex];

                System.out.println("Swap between " + (tempArrayVariable)+ " and "+ (arr[i]));
                arr[randomNumberBetweenIndex] =arr[i];
                arr[i] = tempArrayVariable;
                count ++;
                System.out.println(count);
            }


            System.out.println(Arrays.toString(arr));
        }
}
