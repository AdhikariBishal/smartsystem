package emr;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class DemoHomePage extends Frame implements ActionListener 
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String a1="",a2="",a3="",a4="";
Frame frm;
Font f1,f2;
Label l1,l2,l3,l4,l5;
Button b1,b2;
TextField t1,t2,t3,t4;

public  DemoHomePage()
{
frm=new Frame("Home Page");
l1=new Label("ADD NEW AREA RECORD WITH EMERGENCY");
l2=new Label("Name Of Area");
l3=new Label("Police Station No.");
l4=new Label("Ambulance Number");
l5=new Label("Fire Station No.");


t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");

b1=new Button("NEXT");
b2=new Button("BACK");

f1=new Font("Arial",Font.BOLD,30);
f2=new Font("Arial",Font.BOLD,13);

}

public void setUpDemoHomePage()
{
frm.setLayout(null);

l1.setBounds(350,150,750,25);
l2.setBounds(450,350,150,25);
l3.setBounds(450,400,150,25);
l4.setBounds(450,450,150,25);
l5.setBounds(450,500,150,25);

t1.setBounds(650,350,150,25);
t2.setBounds(650,400,150,25);
t3.setBounds(650,450,150,25);
t4.setBounds(650,500,150,25);

b1.setBounds(500,600,100,25);
b2.setBounds(650,600,100,25);

b2.addActionListener(this);
b1.addActionListener(this);

l1.setFont(f1);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
b1.setFont(f2);
b2.setFont(f2);

frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(b1);
frm.add(b2);
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
a4=t3.getText();
}
catch(Exception ex)
{
System.out.println("get value error="+ex);
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
pst=con.prepareStatement("insert into newArearec values('"+a1+"','"+a2+"','"+a3+"','"+a4+"')");
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
}



}
}

