import java.util.*;
class Vector1 
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
int n;
Vector v=new Vector(3,2);
System.out.println("enter no. of lements :");
n=sc.nextInt();
String str,s1;
int i;
System.out.println("enter the elements : ");
for(i=0;i<n;i++)
{
str = sc.next();
v.addElement(str);
}
int choice=0;
System.out.println("size = "+v.size());
System.out.println("capacity = "+v.capacity());
do
{
System.out.println();
System.out.println("1.ADD \n2.REMOVE \n 3.search 4.current \n 5.exit");
System.out.println("enter choice :");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("no. of elemnts to add :");
n=sc.nextInt();
for(i=0;i<n;i++)
{
str=sc.next();
v.addElement(str);
}
System.out.println("size = "+v.size());
System.out.println("capacity = "+v.capacity());
break;
case 2:
System.out.println("element to remove:");
str=sc.next();
v.removeElement(str);
System.out.println("size = "+v.size());
System.out.println("capacity = "+v.capacity());
break;
case 3:
System.out.println("index to be serached");
i=sc.nextInt();
System.out.println("searched element s : "+v.elementAt(i));
System.out.println("size = "+v.size());
System.out.println("capacity = "+v.capacity());
break;
case 4:
System.out.println("current list ");
for(i=0;i<v.size();i++)
{
System.out.println("element"+i+"is : "+v.elementAt(i));
}
System.out.println("size = "+v.size());
System.out.println("capacity = "+v.capacity());
break;
case 5:
System.exit(0);
break;
}
}while(choice>=1 && choice<=5);
}
}