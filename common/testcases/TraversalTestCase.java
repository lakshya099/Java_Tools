import com.lakshya.algo.util.*;
class TraversalTestCase
{
public static void main(String gg[])
{
LMList<Integer> list=new LMArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
//list.forEach((e)->{System.out.println(e);});
LMIterator<Integer> iterator=list.iterator();
while(iterator.hasNext())
{
int x=iterator.next();
System.out.println(x);
}
System.out.println("******************************************************************");
LMList<String> list1=new LMLinkedList<>();
list1.add("Goa");
list1.add("London");
list1.add("Kashmer");
list1.add("M.P");
list1.add("Bombay");
list1.forEach((e)->{System.out.println(e);});
}
}
