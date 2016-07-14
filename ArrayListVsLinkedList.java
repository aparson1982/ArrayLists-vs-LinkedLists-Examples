
/**
 * Write a description of class ArrayListVsLinkedList here.
 * 
 * @author (Robert Parson) 
 * @version (2/14/16)
 */
import java.util.*;

public class ArrayListVsLinkedList
{
    public static void main(String args[])
    {
        long nano1 = System.nanoTime();
        int interval = 100000;
        long counter = 0;
        int intervalCounter = 0;
        double seconds = 1000000000;
        
        List<Integer> arrayL = new ArrayList<Integer>();
        System.out.println("Adding 1e6 integers to the END of an ArrayList. \n Below is the time interval for ever 100000 entries. \n");
        //add to end of Array List
        for(int i=0; i<1e7; i++)
        {
                arrayL.add(i);
                counter++;
                
                if(counter % interval == 0)
                {
                    intervalCounter++;
                    System.out.println("Array List Interval #"+intervalCounter+":  "+((System.nanoTime() - nano1)/seconds)+" sec.");
                    
                }
        }
        
        long nano2 = System.nanoTime();
        LinkedList<Integer> LinList = new LinkedList<Integer>();
        counter = 0;
        intervalCounter = 0;
        System.out.println("\n\n\n Adding 1e6 integers to the END of a Linked List. \n Below is the time interval for ever 100000 entries. \n");
        //add to end of Linked List
        for(int j=0; j<1e7; j++)
        {
            LinList.add(j);
            counter++;
            
            if(counter % interval == 0)
            {
                intervalCounter++;
                System.out.println("Linked List Interval #"+intervalCounter+":  "+((System.nanoTime() - nano2)/seconds)+" sec.");
            }
        }
        
        long nano3 = System.nanoTime();
        List<Integer> arrayL2 = new ArrayList<Integer>();
        counter = 0;
        intervalCounter = 0;
        System.out.println("\n\n\n Adding 1e6 integers to the BEGINNING of an ArrayList. \n Below is the time interval for ever 100000 entries. \n");
        //add to beginning of Linked List
        for(int k=0; k<1e6; k++)
        {
            arrayL2.add(0, k);
            counter++;
            
            if(counter % interval == 0)
            {
                intervalCounter++;
                System.out.println("Array List Interval #"+intervalCounter+":  "+((System.nanoTime() - nano3)/seconds)+" sec.");
            }
        }
        
        
        long nano4 = System.nanoTime();
        LinkedList<Integer> LinList2 = new LinkedList<Integer>();
        counter = 0;
        intervalCounter = 0;
        System.out.println("\n\n\n Adding 1e6 integers to the BEGINNING an Linked List. \n Below is the time interval for ever 100000 entries. \n");
        //add to beggining of Linked List
        for(int m=0; m<1e6; m++)
        {
            LinList2.addFirst(m);
            counter++;
            
            if(counter % interval == 0)
            {
                intervalCounter++;
                System.out.println("Linked List Interval #"+intervalCounter+":  "+((System.nanoTime() - nano4)/seconds)+" sec.");
            }
        }
        
        System.out.println("\n\n\n Insertion Big-O time for an ArrayList at the END is Constant O(1). \n The insertion Big-O time at the END for a LinkedList can either be O(N) or O(1). \n\n The insertion Big-O time at the BEGINNING of an ArrayList is O(N) which makes \n the growth rate much higher than that of the insertion time at the BEGINNING of a LinkedList. \n The insertion Big-O time at the BEGINNING of a LinkedList is CONSTANT O(1).");
    }
}
