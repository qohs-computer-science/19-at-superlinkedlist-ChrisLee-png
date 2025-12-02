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
            }
        }
        return lim;
    }

    public boolean removeConsonants() {
        ListIterator <String> iter = this.listIterator();
        boolean leo = false;
        while(iter.hasNext())
        {
            if("aeiou".indexOf(iter.next().toLowerCase())==-1)
            {
                leo=true;
                iter.remove();
            }
        }
        return leo;
    }

    public LinkedList<String> removeDuplicates() {
        ListIterator <String> iter1 = this.listIterator();
        LinkedList <String> r = new LinkedList <String>();
        int i=0;
        while(iter1.hasNext())
        {
            ListIterator <String> iter2 = this.listIterator();
            String med = iter1.next();
            int ii=0;
            while(iter2.hasNext())
            {
                String nik =iter2.next();
                if((i!=ii)&&med.equals(nik))
                {
                    iter2.remove();
                    r.add(nik);
                }
                ii++;
            }
            i++;
        }
        return r;
    }

    public LinkedList<String> concatenateStrings() {
        ListIterator <String> iter = this.listIterator();
        LinkedList <String> r = new LinkedList <String>();
        String nic = "";
        while(iter.hasNext())
        {   
            nic += iter.next();
            r.add(nic);
        }
        return r;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
        ListIterator <String> iter1 = this.listIterator();
        ListIterator <String> iter2 = list2.listIterator();
        LinkedList <String> r = new LinkedList <String>();
        while(iter1.hasNext())
        {
            r.add(iter1.next());
            r.add(iter2.next());
        }
        return r;
    }

    public String toString() {
        ListIterator <String> iter = this.listIterator();
        String kat = "";
        while(iter.hasNext())
        {
            kat+=iter.next();
            if(iter.hasNext())
                kat+=", ";
        }
        return kat;
    }
} // end SuperLinkedList