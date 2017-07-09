package ajaymehta.frequentelementinarrayhashmap;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Avi Hacker on 7/9/2017.
 */

// FInding the most frequent element in java   {7,2,2,2,9,6,6,19,13};  --> 2 is most frequent n its frequency is 3 (3 times occurance)
// we can do this task using hashmap ...just put every array element in hashmap one by one ..as a (K,V) key value pair
    // but first check ..if the hashmap containt that element than increase the count of that element by 1
    // if not than put that element in hashmap..
public class Program1 {

    static int arr[] = {7,2,2,2,9,6,6,19,13};

    public static void main(String args[]) {

        HashMap<Integer,Integer> map = new HashMap<>();

      int i=0;
        while(i < arr.length) {

            if(map.containsKey(arr[i])) { // checkingif hashmap contain this element  (element at ith location of array

                map.put(arr[i], map.get(arr[i])+1);  // if yes ...then get that element vaue n add by 1 (+1)
            } else {

                map.put(arr[i],1); // other wise put the element and its value 1
            }
            i++;
        }

        int element =0;
        int frequency =1;

        // now to iterate hashMap..we have EntrySet

        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet(); // we iterate hashmap before using...Iterator now using for each loop..

        for(Map.Entry<Integer,Integer> entry : entrySet) {

            if(entry.getValue() >frequency) { // here we comparing the frequency if..the frequency of previous element from entry is  low ..then put new value of new element ...in element n frequency variable..

                element = entry.getKey();
                frequency = entry.getValue();

            }
        }


        System.out.println("Input Array "+ Arrays.toString(arr));  // toString method of Arrays class..print the array in boxes. [ ]  with equal space..cool..
        System.out.println("Most Frequent Element "+ element);
        System.out.println("Frequency "+ frequency);



    }
}
