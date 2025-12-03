class SLLTester {
  //Christopher Lee, pd 6, 12/3/25
  //File will test the coded SuperLinkedList methods
  public static void main(String[] args) {
    SuperLinkedList e = new SuperLinkedList();
    e.add("a");
    e.add("b");
    e.add("c");
    e.add("d");
    e.add("e");

    SuperLinkedList jas = new SuperLinkedList();
    jas.add("Z");
    jas.add("Z");
    jas.add("z");
    jas.add("z");
    jas.add("z");

    SuperLinkedList col = new SuperLinkedList();
    col.add("a");
    col.add("A");
    col.add("a");
    col.add("A");
    col.add("a");

    System.out.println("\nList e contains before removeVowels: "+e.toString());
    e.removeVowels();
    System.out.println("After removeVowels, list e contains: "+e.toString());

    e.add("c");
    e.add("d");
    e.add("a");
    e.add("u");
    e.add("z");
    System.out.println("List e contains before removeConsonants and after things are added: "+e.toString());
    e.removeConsonants();
    System.out.println("After removeConsonants is run, list e contains: "+ e.toString());
    
    System.out.println("\nList jas contains before removeDuplicates: "+jas.toString());
    jas.removeDuplicates();
    System.out.println("List jas contains after removeDuplicates: "+jas.toString());

    
    System.out.println("\nList col contains before concatenateStrings: "+col.toString());
    System.out.println("concatenateStrings returns: "+col.concatenateStrings());


    e = new SuperLinkedList();
    e.add("Z");
    e.add("z");
    e.add("Z");
    e.add("z");
    e.add("Z");
    System.out.println("\nList e contains before mix: "+e.toString());

    System.out.println("List col contains before mix: "+col.toString());
    System.out.println("mix returns: "+e.mix(col));
  } // end main
} // end class