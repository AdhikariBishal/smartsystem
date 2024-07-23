package emr;
import java.awt.*;
import java.awt.event.*;
public class DemoEmergencyCall extends Frame implements ActionListener 
{
Frame frm;
Font f1,f2,f3;
Label l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,a1,a2,a3,a4,a5,a6,a7,a8,a9;
Button b1;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,s1,s2,s3,s4,s5;
Choice g1,g2,g3;
Checkbox c1,c2;
CheckboxGroup cb1;
public DemoEmergencyCall()
{
frm=new Frame("HOME PAGE");
l0=new Label ("EMERGENCY CALL SYSTEM CALL 999");
l1=new Label("CALLER INFORMATION");
l2=new Label("EMERGENCY ID");
l3=new Label("CALLER NAME");
l4=new Label("FATHER NAME");
l5=new Label("MOTHER NAME");
l6=new Label("STATE");
l7=new Label("STR/MOHALLA");
l8=new Label("MOBILE NUMBER");
l9=new Label("AGE");
a1=new Label("AGE");
a2=new Label("AGE");
a3=new Label("DISTRICT");
a4=new Label("HOME NUMBER");
a5=new Label("BLOOD GROUP");
a6=new Label("BLOOD GROUP");
a7=new Label("BLOOD GROUP");
a8=new Label("VILL/TOWN");
a9=new Label("TELL NUMBER");

t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");
t5=new TextField("");
t6=new TextField("");
t7=new TextField("");
t8=new TextField("");
t9=new TextField("");
s1=new TextField("");
s2=new TextField("");
s3=new TextField("");
s4=new TextField("");
s5=new TextField("");

g1=new Choice();
g1.add("AB+");
g1.add("AB-");
g1.add("B+");
g1.add("B-");
g1.add("O+");
g1.add("O-");
g1.add("A+");
g1.add("A-");

g2=new Choice();
g2.add("AB+");
g2.add("AB-");
g2.add("B+");
g2.add("B-");
g2.add("O+");
g2.add("O-");
g2.add("A+");
g2.add("A-");

g3=new Choice();
g3.add("AB+");
g3.add("AB-");
g3.add("B+");
g3.add("B-");
g3.add("O+");
g3.add("O-");
g3.add("A+");
g3.add("A-");



b1=new Button("Exit");

cb1=new CheckboxGroup();
c1=new Checkbox("MARRIED",cb1,true);
c2=new Checkbox("UNMARRIED",cb1,false);

f1=new Font("Arial",Font.BOLD,30);
f2=new Font("Arial",Font.BOLD,12);
f3=new Font("Arial",Font.BOLD,19);
}


public void setUpDemoEmergencyCall()
{

frm.setLayout(null);

l0.setBounds(600,100,570,25);
l1.setBounds(300,150,250,25);
l2.setBounds(300,200,100,25);
l3.setBounds(300,250,100,25);
l4.setBounds(300,300,100,25);
l5.setBounds(300,350,100,25);
l6.setBounds(300,400,100,25);
l7.setBounds(300,450,100,25);
l8.setBounds(300,500,100,25);
l9.setBounds(650,250,100,25);
a1.setBounds(650,300,100,25);
a2.setBounds(650,350,100,25);
a3.setBounds(650,400,100,25);
a4.setBounds(650,450,100,25);
a5.setBounds(1050,250,100,25);
a6.setBounds(1050,300,100,25);
a7.setBounds(1050,350,100,25);
a8.setBounds(1050,400,100,25);
a9.setBounds(1050,450,100,25);

t1.setBounds(450,200,100,25);
t2.setBounds(450,250,100,25);
t3.setBounds(450,300,100,25);
t4.setBounds(450,350,100,25);
t5.setBounds(450,400,100,25);
t6.setBounds(450,450,100,25);
t7.setBounds(450,500,100,25);
t8.setBounds(850,250,100,25);
t9.setBounds(850,300,100,25);
s1.setBounds(850,350,100,25);
s2.setBounds(850,400,100,25);
s3.setBounds(850,450,100,25);
s4.setBounds(1250,400,100,25);
s5.setBounds(1250,450,100,25);

g1.setBounds(1250,250,100,25);
g2.setBounds(1250,300,100,25);
g3.setBounds(1250,350,100,25);


b1.setBounds(600,600,100,25);

b1.addActionListener(this);

c1.setBounds(400,600,100,25);
c2.setBounds(400,650,100,25);

l0.setFont(f1);
l1.setFont(f3);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
l6.setFont(f2);
l7.setFont(f2);
l8.setFont(f2);
l9.setFont(f2);
a1.setFont(f2);
a2.setFont(f2);
a3.setFont(f2);
a4.setFont(f2);
a5.setFont(f2);
a6.setFont(f2);
a7.setFont(f2);
a8.setFont(f2);
a9.setFont(f2);
g1.setFont(f2);
g2.setFont(f2);
g3.setFont(f2);
c1.setFont(f2);
c2.setFont(f2);
b1.setFont(f2);

frm.add(l0);
frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(l8);
frm.add(l9);
frm.add(a1);
frm.add(a2);
frm.add(a3);
frm.add(a4);
frm.add(a5);
frm.add(a6);
frm.add(a7);
frm.add(a8);
frm.add(a9);

frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(t6);
frm.add(t7);
frm.add(t8);
frm.add(t9);
frm.add(s1);
frm.add(s2);
frm.add(s3);
frm.add(s4);
frm.add(s5);

frm.add(g1);
frm.add(g2);
frm.add(g3);


frm.add(b1);

frm.add(c1);
frm.add(c2);

frm.setSize(600,700);
frm.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{



}


}

