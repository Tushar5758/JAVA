import java.util.*;
class Student
{
int i,a;
String n;
Student(int id,String name)
{
n=name;
i=id;
}
Student(int id,String name,int age)
{
i=id;
n=name;
a=age;
}
void display()
{
System.out.println("name : "+n+"id : "+i+"age = "+a);
}

public static void main(String args[])
{
Student s= new Student(125,"tushar");
Student s1= new Student(125,"tushar",58);
s.display();
s1.display();
}
}
 

