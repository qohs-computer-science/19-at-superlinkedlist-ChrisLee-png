//Christopher Lee, Pd 6, 12/3/25
//File will test the coded SuperLinkedList methods
import java.util.LinkedList;
import java.util.ListIterator;

class SLLTester {
  
  public static void main(String[] args) {
    SuperLinkedList e = new SuperLinkedList();
    e.add("a");
    e.add("b");
    e.add("c");
    e.add("d");
    e.add("e");

    SuperLinkedList jas = new SuperLinkedList();
    jas.add("Z");
    jas.add("a");
    jas.add("Z");
    jas.add("z");
    jas.add("z");
    jas.add("u");
    jas.add("z");

    SuperLinkedList col = new SuperLinkedList();
    col.add("a");
    col.add("A");
    col.add("a");
    col.add("A");
    col.add("a");

    SuperLinkedList a = new SuperLinkedList();
    a.add("Z");
    a.add("z");
    a.add("Z");
    a.add("z");
    a.add("Z");

    System.out.println("\nThis is list e: \n"+e.toString());
    System.out.println("This is list jas: \n"+jas.toString());
    System.out.println("This is list col: \n"+col.toString());
    System.out.println("This is list a: \n"+a.toString());
    
    System.out.println("\nList jas contains before removeVowels: "+jas.toString());
    jas.removeVowels();
    System.out.println("After removeVowels, list jas contains: "+jas.toString());

    System.out.println("\nList e contains before removeConsonants: "+e.toString());
    e.removeConsonants();
    System.out.println("After removeConsonants is run, list e contains: "+ e.toString());
    
    System.out.println("\nList jas contains before removeDuplicates: "+jas.toString());
    jas.removeDuplicates();
    System.out.println("List jas contains after removeDuplicates: "+jas.toString());

    
    System.out.println("\nList col contains before concatenateStrings: "+col.toString());
    System.out.println("concatenateStrings returns: ");
    printList(col.concatenateStrings());

    System.out.println("\nList a contains before mix: "+a.toString());
    System.out.println("List col contains before mix: "+col.toString());
    System.out.println("mix returns: ");
    printList(a.mix(col));
  } // end main
  public static void printList(LinkedList<String> e){
    ListIterator <String> ee = e.listIterator();
    while(ee.hasNext())
    {
      System.out.println(ee.next());
    }//loops through list
    
    
  }//end printList
} // end class