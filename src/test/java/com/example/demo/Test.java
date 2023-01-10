package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.MemberDao;

public class Test {
	public static void main(String[] args) {
		Solution t = new Solution();
		int[] arr = {-1,0,3,5,9,12};
		t.firstBadVersion(5);
	}
}  

class Solution {
	public int firstBadVersion(int n) {
	       int result = binarySearch(0, n);
	         System.out.println("result"+result);
	       return result;
	    }
	    private int binarySearch(int left, int right){
	        if(left<=right){
	            int mid = left + (right-left)/2;
	            System.out.println("sadsa:");
	            if(isBadVersion(mid)){
	                 System.out.println("isBadVersion:"+mid);
	                if((mid>0 && !isBadVersion(mid-1))||mid==0){
	                    return mid;
	                }else{
	                    right = mid-1;
	                }
	            }else{
	                left = mid;
	            }
	            return binarySearch(left, right);
	        }
	        return -1;
	    }
	    
	    boolean isBadVersion(int a) {
	    	 return a==4;
	    }
	    
}
