/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author anmolvalecha
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        List <Integer> L = new ArrayList<Integer>();
        
        for (int i=0; i<n; i++) {
            int numL = sc.nextInt();
            L.add(numL); 
        }
        
        int m = sc.nextInt(); 
        
        for (int i=0; i<m; i++) {
            String query = sc.next(); 
            
            switch(query) {
                case "Insert": {
                    int index = sc.nextInt(); 
                    int number = sc.nextInt(); 
                    L.add(index, number);
                    break;
                }
                    case "Delete": {
                    int index = sc.nextInt(); 
                    L.remove(index);
                    break;
                }
            }
        }
        
        for (int number : L){
            System.out.print(number + " ");
        }
    }
}