import java.applet.*;
import java.awt.*;

public class Smiley extends Applet
{
String str;
public static void main(String args[])
{

}

public void init()
{
str=getParameter("text");
if(str==null)
{
str="user";
}
str="hello"+str+"!!";
}
public void paint(Graphics g)
{
g.drawString(str,20,20);
g.setColor(Color.yellow);
g.fillOval(50,50,300,300);
g.setColor(Color.white);
g.fillOval(100,100,70,150);
g.setColor(Color.black);
g.fillOval(100,150,50,50);
g.setColor(Color.white);
g.fillOval(200,100,70,150);
g.setColor(Color.black);
g.fillOval(200,150,50,50);
g.fillRect(200,200,70,5);
}
}


