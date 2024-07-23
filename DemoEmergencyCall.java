package emr;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class DemoEmergencyCall extends Frame implements ActionListener 
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="",a11="",a12="",a13="",a14="",a15="",a16="",a17="",a18="";
Frame frm;
Font f1,f2,f3;
Label l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,p1,p2,p3,p4,p5,p6,p7,p8,p9;
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
p1=new Label("AGE");
p2=new Label("AGE");
p3=new Label("DISTRICT");
p4=new Label("HOME NUMBER");
p5=new Label("BLOOD GROUP");
p6=new Label("BLOOD GROUP");
p7=new Label("BLOOD GROUP");
p8=new Label("VILL/TOWN");
p9=new Label("TELL NUMBER");

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



b1=new Button("Next");

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
p1.setBounds(650,300,100,25);
p2.setBounds(650,350,100,25);
p3.setBounds(650,400,100,25);
p4.setBounds(650,450,100,25);
p5.setBounds(1050,250,100,25);
p6.setBounds(1050,300,100,25);
p7.setBounds(1050,350,100,25);
p8.setBounds(1050,400,100,25);
p9.setBounds(1050,450,100,25);

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
p1.setFont(f2);
p2.setFont(f2);
p3.setFont(f2);
p4.setFont(f2);
p5.setFont(f2);
p6.setFont(f2);
p7.setFont(f2);
p8.setFont(f2);
p9.setFont(f2);
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
frm.add(p1);
frm.add(p2);
frm.add(p3);
frm.add(p4);
frm.add(p5);
frm.add(p6);
frm.add(p7);
frm.add(p8);
frm.add(p9);

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

public void getFillValue()
{
try
{
a1=t1.getText();
a2=t2.getText();
a3=t3.getText();
a4=t4.getText();
a5=t5.getText();
a6=t6.getText();
a7=t7.getText();
a8=t8.getText();
a9=t9.getText();
a10=s1.getText();
a11=s2.getText();
a12=s3.getText();
a13=g1.getSelectedItem();
a14=g2.getSelectedItem();
a15=g3.getSelectedItem();
a16=s4.getText();
a17=s5.getText();

 if(c1.getState()==true)
{
 a18="MARRIED";
}
else 
{
 a18="UNMARRIED";
}
 }
 catch(Exception ex)
{
System.out.println("VALUR ERROR="+ex);
}
}

public void conn()
{
try
{ 
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection("jdbc:odbc:DSNEMR");
 }
 catch(Exception ex)
 {
  System.out.println(ex);
 }
}
public void putData()
{
 try
 {
   pst=con.prepareStatement("insert into emrngcallsystm values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"','"+a11+"','"+a12+"','"+a13+"','"+a14+"','"+a15+"','"+a16+"','"+a17+"','"+a18+"')");
   pst.executeUpdate();
 }
 catch(SQLException se)
 {
  System.out.println(se);
 }
}



public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{

getFillValue();
conn();
putData();
DemoHospital obj=new DemoHospital();
obj.setID(t1.getText());
obj.setUpDemoHospital();
frm.setVisible(false);
}


}
}
