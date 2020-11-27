 
//We are creating a java I/O scanner class
package com.elikidsoftware;

Import java.util.*;

public class Main {

    public static void main(String args[]) {
       String name1, name2;
       System.out.print("Enter your name: ");
       Scanner sc = new Scanner(System.in);
       name1 = sc.nextLine();
       //Break for humans to read
       System.out.print("Enter your PC's name: ");
       Scanner in = new Scanner(System.in);
       name2 = in.nextLine();
       // Break for humans to read
       System.out.println(name1 + " How are you!");
       System.out.println("Hope he is treating the codes well " + name2);
   }
}
