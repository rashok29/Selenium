package com.selenium1;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
String str= "Ashok";
String rev= "";
int len=str.length();
for (int i =len-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
System.out.println(rev);
if(str.equals(rev)) {
	System.out.println("palindrom");
}else {
		System.out.println("not");
	}
}
}

