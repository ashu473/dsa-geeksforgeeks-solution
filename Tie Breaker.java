//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList
		    ArrayList<String>names=new ArrayList<>();
		    
		    //adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        names.add(sc.next());
		    }
		    Solution ob = new Solution();
		    //calling TieBreak method and printing the result
		    System.out.println(ob.TieBreak(names,n));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
        public static String TieBreak(ArrayList<String>names, int n)
    {
        //Your code here
        TreeMap<String,Integer> m=new TreeMap<>();
        for(int i=0;i<names.size();i++){
            m.put(names.get(i),m.getOrDefault(names.get(i),0)+1);
        }
        
        int maxValue=Collections.max(m.values()); // maximum value in the map
        
        for(Map.Entry<String,Integer> x:m.entrySet()){
            
            if(x.getValue()==maxValue){
                return x.getKey();
            }
            
        }
        return null;
        
    }
}