package test.com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Solution {

     public static void main(String args[])
     {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         String ans="";
         
         if(n%2==1)
         {
             ans="Weird";
         }
         else
         {
             if(n>=6 && n<=20)
             {
                 ans="Weird";
             }
             else
             {
                 ans="Not Weird";
             }
         }
         System.out.println(ans);
     }
}

