import com.lakshya.algo.util.*;
class LMLinkedListIteratorTestCase
{
public static void main(String gg[])
{
LMLinkedList list1,list2;
list1=new LMLinkedList();
list1.add(100);
list1.add(200);
list1.add(300);
list1.add(400);
list1.add(4,500);
System.out.println("Iterating from list1");
LMIterator iterator;
iterator=list1.iterator();
while(iterator.hasNext())
{
int data=iterator.next();
System.out.println(data);
}
}
}