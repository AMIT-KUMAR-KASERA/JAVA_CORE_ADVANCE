/*1. to remove dublicates from arrayList
  ===========================================================================================================================================================================

package com.collection.question;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("aabbccddeeffgg");
		
		String str = a.get(0);
		char ch[]=str.toCharArray();
		String result="";
		
		for(int i=0;i<str.length();i++)
		{ 
			boolean found=false;
			char c=ch[i];
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					found=true;
				}
				
			}
			if(!found)
			{
				result+=c;
			}	
			
		}
		System.out.println("unique value is:-"+result);

	}

}
============
  2nd approch

  package com.collection.question;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("aabbccddeeffgg");
		
		String str = a.get(0);
		
		StringBuilder sb=new StringBuilder();
		
		
		for(int i=0;i<str.length();i++)
		{
			boolean found=false;
			char ch=str.charAt(i);
			
			for(int j=i+1;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					found=true;
				}
			}
			if(!found)
			{
				sb.append(ch);
			}
			
		}
		System.out.println(sb);

	}
}

