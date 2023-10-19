/*
package algoimpl;

import java.util.*;

class LeastRecentlyUsed {

	*/
/* input array of numbers(referred as processes)
	 using LRU approach print last 4 processes and page fault
	create array of size 4 and add all first elements and also add page fault value to 4 
	 iterate through remaining elements and if any of the elements which already exists in the 	array add page fault to 0 else page fault to 1
	 during the iteration replace the new process with least recently used.. to do that we need to keep a variable for least recenlty used which is lru *//*



    public static void main(String[] args) {

        int[] inputArray = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};

        leastRecentlyUsedProcessAndPageFault(inputArray);
    }

    public static void leastRecentlyUsedProcessAndPageFault(int[] inputArray) {

        int[] processArray = new int[4];
        int[] lruArr = new int[4];

        for (int i = 0; i < 4; i++) {

            processArray[i] = inputArray[i];
        }

        lruArr = processArray;

        for (int i = 4; i < inputArray.length; i++) {

            //get process and see if process already exists
            // if exists then update lru

            int existingPageIndex = -1;
            for (int k = 0; i < processArray.length; i++) {

                if (inputArray[j] == processArray[k]) {
                    int temp = -1;
                    existingPageIndex = k;
                    temp = processArray[1];
                    processArray[1] = processArray[k];
                    processArray[k] = temp;
                    return;

                } else {
                    processArray[4] =

                }

            }

        }

    }*/
