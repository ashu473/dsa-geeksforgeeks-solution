//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
	public static int addMinChar(String str){
	    int res=0;
	    int start=0;
	    int len=str.length();
	    int end=len-1;
		while(start < end) {
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else {
                res++;
                start = 0;
                end = len - res - 1;
            }
        }
        return res;
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String str = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.addMinChar(str));
        }
        
    }
}

// } Driver Code Ends