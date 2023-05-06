import java.util.*;

class Collection1
{
    public static void main(String arg[])
    {
        LinkedList<Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println("Enter are :"+lobj);

        Iterator iobj = lobj.iterator();
        while(iobj.hasnext())
        {
            System.out.println(lobj.next());
        }

    }
}