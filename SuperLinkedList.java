import java.util.LinkedList;
import java.util.ListIterator;
//import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        ListIterator <String> iter = this.listIterator();
        boolean lim = false;
        while(iter.hasNext())
        {
            if("aeiou".indexOf(iter.next().toLowerCase())!=-1)
            {
                lim=true;
                iter.remove();
            }//removes vowels
        }//loops through list
        return lim;
    }//end removeVowels() method

    public boolean removeConsonants() {
        ListIterator <String> iter = this.listIterator();
        boolean leo = false;
        while(iter.hasNext())
        {
            if("aeiou".indexOf(iter.next().toLowerCase())==-1)
            {
                leo=true;
                iter.remove();
            }//removes consonants
        }//loops through list
        return leo;
    }//end removeConsonants() method

    public LinkedList<String> removeDuplicates() {
        LinkedList <String> r = new LinkedList <String>();
        int i=0;
        while(i<this.size())
        {
            String med = this.get(i);
            ListIterator <String> iter = this.listIterator();
            int ii=0;
            while(iter.hasNext())
            {
                String nik =iter.next();
                if((i!=ii)&&med.equals(nik))
                {
                    r.add(nik);
                    iter.remove();
                }//removes duplicates
                ii++;
            }//loops through list for a second time
            i++;
        }//loops through list
        return r;
    }//end removeDuplicates() method

    public LinkedList<String> concatenateStrings() {
        ListIterator <String> iter = this.listIterator();
        LinkedList <String> r = new LinkedList <String>();
        String nic = "";
        while(iter.hasNext())
        {   
            nic += iter.next();
            r.add(nic);
            
        }//loops through list
        return r;
    }//end concatenateStrings() method

    public LinkedList<String> mix(LinkedList<String> list2) {
        ListIterator <String> iter1 = this.listIterator();
        ListIterator <String> iter2 = list2.listIterator();
        LinkedList <String> r = new LinkedList <String>();
        while(iter1.hasNext())
        {
            r.add(iter1.next());
            r.add(iter2.next());
        }//adds string from list 1 then list 2
        return r;
    }//end mix() method

    public String toString() {
        ListIterator <String> iter = this.listIterator();
        String kat = "";
        while(iter.hasNext())
        {
            kat+=iter.next();
            if(iter.hasNext())
                kat+=", ";
        }//loops through list
        return kat;
    }//end toString() method
} // end SuperLinkedList