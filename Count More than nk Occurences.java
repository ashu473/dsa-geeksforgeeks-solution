//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 

    {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{map.put(arr[i],1);}
        }
        for(Map.Entry<Integer,Integer> ashu: map.entrySet()){
            if (ashu.getValue()>n/k){count++;}
        }
        return count;
    }
}

   /* public int countOccurence(int[] arr, int n, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
            }else{
                map.put(arr[i],1);
            }
        }
        // Using entrySet() to get the entry's of the map
        // Set<Map.Entry<String,Integer>> s = map.entrySet();
        // for(Map.Entry<Integer,Integer> ashu:s{
        //        if(ashu.getValue()>n/k) count++;
        // }
        int count=0;
        for(Map.Entry<Integer,Integer> ashu:map.entrySet()){
            if(ashu.getValue()>n/k){
                count++;
            }
        }
        return count;
    }*/
