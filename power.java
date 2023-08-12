import java.util.*;
class power
{
public static void main(String args[])
{
int x,n,ans;
power p=new power();
Scanner sc = new Scanner(System.in);

System.out.println("enter the base");
x=sc.nextInt();

System.out.println("enter the exponent");
n=sc.nextInt();
ans=p.exp(x,n);
System.out.println("ans = "+ans);
}
int exp(int a,int b)
{
if(b==0)
{
return 1;
}
else
{
return (a*exp(a,b-1));
}
}
}
