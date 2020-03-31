package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSuggestionsAnswer {
	
	 public List<List<String>> suggestedProducts(String[] products, String searchWord) {
	       
	        List<List<String>> list = new ArrayList();
	        Arrays.sort(products);
	     
	        for(int i=0;i<searchWord.length();i++){
	            List<String> sub = new ArrayList();            
	            String str = searchWord.substring(0,i+1);
	                        
	            String[] subArr = new String[products.length];            
	            int counter=0;
	            for(int j=0;j<subArr.length && counter<3;j++){
	                if( products[j].length()>=str.length() && products[j].substring(0,i+1).equals(str)){
	                    String str2 = products[j].substring(i+1,products[j].length());
	                    sub.add(str+str2);
	                    counter++;
	                }                             
	            }
	            list.add(sub);                        
	        }              
	        return list;
	    }

}
