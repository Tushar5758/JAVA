import java.awt.*;
import java.awt.event.*;

public class AWTGUI extends Frame implements ActionListener
{
Button b1=new Button("Save");
Label l1 = new Label("Name : ",Label.LEFT);
Label l2 = new Label("Age : ",Label.LEFT);
Label l3 = new Label("Gender : ",Label.LEFT);
Label l4 = new Label("Address : ",Label.LEFT);
Label l5 = new Label("Course : ",Label.LEFT);
Label l6 = new Label("Semester : ",Label.LEFT);
Label l7 = new Label("Student details",Label.CENTER);
Label label=new Label();
TextField t1 = new TextField();
Choice c1 = new Choice();
CheckboxGroup cbg = new CheckboxGroup();
Checkbox ck1 = new Checkbox("Male",false,cbg);
Checkbox ck2 = new Checkbox("Female",false,cbg);
TextArea t2 = new TextArea(" ",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
Choice course = new Choice();
Choice sem = new Choice();
Choice age = new Choice();

public AWTGUI()
{
setBackground(Color.blue);
setForeground(Color.black);
setLayout(null);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(t1);
add(t2);
add(ck1);
add(ck2);
add(course);
add(sem);
add(age);
add(b1);
course.add("CSE");
course.add("MEC");
course.add("IT");
course.add("AUTO");
sem.add("1");
sem.add("2");
sem.add("3");
sem.add("4");
sem.add("5");
sem.add("5");
sem.add("6");
sem.add("7");
sem.add("8");
age.add("17");
age.add("18");
age.add("19");
age.add("20");
age.add("21");
add(label);
l1.setBounds(25,65,90,20);l2.setBounds(25,90,90,20);l3.setBounds(25,120,90,20);
l4.setBounds(25,185,90,20);l5.setBounds(25,260,90,20);l6.setBounds(25,290,90,20);
l7.setBounds(10,40,280,20);
t1.setBounds(120,65,170,20);t2.setBounds(120,185,170,60);
ck1.setBounds(120,120,50,20);ck2.setBounds(170,120,60,20);
course.setBounds(120,260,200,20);sem.setBounds(120,290,50,20);age.setBounds(120,90,50,20);
b1.setBounds(120,350,50,30);
label.setBounds(140,400,90,50);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("Save"))
{
label.setText("Data is Saved");
}
}
public static void main(String args[])
{
AWTGUI stu = new AWTGUI();
stu.setSize(500,500);
stu.setTitle("Student Registration");
stu.setVisible(true);
}
}