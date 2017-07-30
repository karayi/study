package com.sk.learn;

import java.io.*;
import java.util.*;

public class LogestString {
  public static void main(String[] args) throws IOException {


	  
	  
    String s;
   Map<Integer,  String> lines = new HashMap<Integer, String>();
    lines.put("Hello World".length(), "Hello World");
    lines.put(" ".length(), " ");
    lines.put("CodeEval".length(), "CodeEval");
    lines.put("Quick Fox".length(), "Quick Fox");
    lines.put("A".length(), "a");
    lines.put("San Francisco".length(), "San Francisco");
    int i=0;
    int n=2;
   /* while ((s = in.readLine()) != null) {
        if(i==0){
          n=Integer.parseInt(s);   
        }
      lines.put(s.length(), s);
      i++;
    }*/
    
    MyComparator comp = new MyComparator(lines);
		Map<Integer, String> newMap = new TreeMap(comp);
        newMap.putAll(lines);
        int j = 0;
   for (Map.Entry<Integer, String> entry : newMap.entrySet())
        {
        	if(j < n){
        		 System.out.println(entry.getValue());
        	}else{
        		break;
        	}
        	
           j++;
        }
    
  }
}

class MyComparator implements Comparator {
    Map<Integer, String> map;

        public MyComparator(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return (o2.toString()).compareTo(o1.toString());
    }
}
