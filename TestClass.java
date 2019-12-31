/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.lang.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        /*
        input:
            4
            G: I want to go on 19
            M: No that is not possible lets go on 21
            G: No 19 is final and 21 is not
            M: OKAY as you wish
        output:
            Date
        */
        // Write your code here
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	int twe=0,nin=0;
    	while(t-->=0)
    	{
    		String s=sc.nextLine();
    		int index1=s.indexOf("19");
    		int index2=s.indexOf("21");
    		if(index1>=0) {
    			if(s.charAt(0)=='G')
    			{
    				nin+=2;

    			}
    			if(s.charAt(0)=='M')
    			{
    				nin+=1;

    			}
    		}
    		if(index2>=0) {
    			if(s.charAt(0)=='G')
    			{
    				twe+=2;

    			}
    			if(s.charAt(0)=='M')
    			{
    				twe+=1;

    			}
    		}

    	}
		//System.out.println("nin "+ nin+" twe "+twe);
    	if(nin>twe)
    	{
    		System.out.println("Date");
    	}
    	else
    	{
    		System.out.println("No Date");
    	}


    }
}
