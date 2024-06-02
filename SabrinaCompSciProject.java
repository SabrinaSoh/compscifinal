/*
 *	Author:  Sabrina Soh
 *  Date: May 25, 2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class starter {
	public static void main(String args[]) 
	throws IOException{

		//NOTE: code segment takes in and isolates email domains
		System.out.print("Please type in the email:");
		System.out.println();
		
		Scanner sc = new Scanner (System.in);
		String email = sc.nextLine();
		int x = email.indexOf('@');
		String domain = email.substring(x+1);
		//System.out.print(domain);
	
		System.out.println();
		
		//NOTE: taking lines from the txt file and putting it into an array list
		ArrayList <String> domains = new ArrayList<String>();
		
		BufferedReader bf = new BufferedReader( //NOTE: used due to its readLine method & its efficiency
            new FileReader("sabrina.txt"));
		
		String line = bf.readLine(); //	readLine method is used for reading a line of text.
		 
		while (line != null) {
            domains.add(line);
            line = bf.readLine();
        }
        
        bf.close();
         
            
       /* for (String str : array) {
            System.out.println(str);
        }
        */
        
        //NOTE: code segment that checks the inputted email to the email in the verified list
        //boolean trustworthy = true;
        int a = 0;
        while(true){
            if(domain.equals(domains.get(a))){
                System.out.print("This email is trustworthy.");
                break;
            }
            else if(a == domains.size()-1){
                System.out.print("This email comes with a high risk of fraud.");
                break;
            }
            a++;
            }
		
		
	}
}
