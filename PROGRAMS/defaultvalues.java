import java.util.*;
class defaultvalues
{
byte b;
static int i;
short s;
static long l;
static double d;
static char c;
boolean b1;
static float f;
void display()
{
System.out.println("default value of bytes : "+b);
}
public static void main(String args[])
{
defaultvalues dv= new defaultvalues();
System.out.println("Default Value of byte: " +dv.b);
System.out.println("Default Value of short: "+dv.s);
System.out.println("Default Value of int: "+i);
System.out.println("Default Value of long: "+l);
System.out.println("Default Value of float: "+f);
System.out.println("Default Value of double: "+d);
System.out.println("Default Value of char:"+c);
System.out.println("Default Value of boolean:"+dv.b1);

System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
 System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
 System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
 System.out.println("Size of byte: " + (Byte.BYTES) + " bytes.");
 System.out.println("Size of short: " + (Short.BYTES) + " bytes.");
 System.out.println("Size of Integer: " + (Integer.BYTES) + " bytes.");
System.out.println("Size of Long: " + (Long.BYTES) + " bytes.");
dv.display();
}
}
