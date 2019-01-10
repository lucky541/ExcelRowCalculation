package com.lucky.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service("ServiceImop")
public class ServiceImp implements ServiceLocal {

	public ResultDto  getNum(String s) {
		Map<Character,Integer> map = new HashMap();
		char ch =0;
	    for(int i=1;i<=26;i++){
	    	ch = (char)(64+i);
	    	map.put(ch,i);
	    }
		int n = s.length()-1;
		int ans=0;
		int i=0;
		System.out.println(s.charAt(i));
		while(n>=0){
			int t = map.get(s.charAt(i));
		    ans += (Math.pow(26, n)* t );
		    n--; i++;
		}
		ResultDto res = new ResultDto();
		res.result= "result "+ans;
		return res;
	}
	
	public static void main(String args[]){
		
		String s=  "A";
		
		Map<Character,Integer> map = new HashMap();
		char ch =0;
	    for(int i=1;i<=26;i++){
	    	ch = (char)(64+i);
	    	map.put(ch,i);
	    }
		
		System.out.println(map);
		
		int n = s.length()-1;
		int ans=0;
		int i=0;
		while(n>=0){
		   
		    ans += (Math.pow(26, n)* map.get(s.charAt(i)));
		   // System.out.println(ans);
		    n--; i++;
		}
		
		System.out.println(ans);
		
		
	}

}
