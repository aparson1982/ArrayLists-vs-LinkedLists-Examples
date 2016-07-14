/**
 * Write a description of class LinkedListVowels here.
 * 
 * @author (Robert Parson) 
 * @version (2/14/16)
 */

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class LinkedListVowels
{
   
   public static void main(String args[])
   {
       LinkedList<String> words = new LinkedList<String>();
      
       Scanner input = new Scanner(System.in);
       String line="";
      
       System.out.print("\n Press 'Enter' to enter a word. Type 'QUIT' to run the program.\n\n");
       do
       {
           System.out.print("Enter a word: ");
           input.useDelimiter("[^a-zA-Z]+");
           if(input.hasNext())
           {
               line = input.nextLine();
           }
           words.add(line);
       }
       while(!((line.toUpperCase()).equals("QUIT"))); //do until "quit"
             
       words.removeLast();  //since the last word is "quit" it removes quit
      
       System.out.print("\n LinkedList BEFORE vowels are removed: \t");
       System.out.print(words);
      
       System.out.println("\n\n\n Removing words that begin with Vowels... ");
                  
       for (Iterator<String> word = words.iterator(); word.hasNext();)
       {
           String vWord = word.next();
                      
           if(hasVowelAtStart(vWord.toUpperCase()) == true)
           {
               word.remove();
           }
           
           
       }
      
       //Printing elements of list after removing
       System.out.print("\n LinkedList AFTER vowels are removed: \t");
       System.out.print(words);
      
       System.out.println("\n\n");  
    }
     
   public static boolean hasVowelAtStart(String vWord)  //public static String hasVowelAtStart(String s)
   {
       /*if(vWord.startsWith ("A") || vWord.startsWith("E") || vWord.startsWith ("I") || vWord.startsWith ("O") || vWord.startsWith ("U"));
       {
           return vWord;
       }*/
       return ( vWord.startsWith ("A") || vWord.startsWith ("E") || vWord.startsWith ("I") || vWord.startsWith ("O") || vWord.startsWith ("U") );
   }
}