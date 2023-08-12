import java.util.*;
class Threading
{
public static void main(String args[])
{
A a = new A();
a.start();
B b = new B();
Thread t = new Thread(b);
t.start();
}
}
class A extends Thread
{
int i;
public void run()
{

for(i=1;i<=28;i++)
{
System.out.println(i+" ");
try
{
Thread.sleep(500);
}
catch(Exception e)
{
}
}
}
}
class B implements Runnable
{
public void run()
{
for(int i=1;i<=26;i++)
{
System.out.println((char)(i+64)+" ");
try
{
Thread.sleep(550);
}
catch(Exception e)
{
}
}
}
}
