package emr;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class DemoCreateAcc extends Frame implements ActionListener
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String a1="",a2="",a3="",a4="",a5="";
Font f1,f2;
Frame frm;
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2,t3,t4;
Button b1,b2;
Choice c1;
public DemoCreateAcc()
{
frm=new Frame("CreateAcc");

l1=new Label("Create Account");
l2=new Label("Enter User ID");
l3=new Label("Enter Password");
l4=new Label("Re-Enter Password");
l5=new Label("Select Security ?");
l6=new Label("Give Answer");

t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");

c1=new Choice();
c1.addItem("Where Do You Live?");
c1.addItem("What is Your Age?");
c1.addItem("Who is Your Favourite FootBall Player?");

b1=new Button("Save");
b2=new Button("Close");

f1=new Font("Arial",Font.BOLD,40);
f2=new Font("Arial",Font.BOLD,13);

}


public void setUpDemoCreateAcc()
{
frm.setLayout(null);

l1.setBounds(500,100,500,50);
l2.setBounds(450,250,200,25);
l3.setBounds(450,300,200,25);
l4.setBounds(450,350,200,25);
l5.setBounds(450,400,200,25);
l6.setBounds(450,450,200,25);

t1.setBounds(750,250,300,25);
t2.setBounds(750,300,300,25);
t3.setBounds(750,350,300,25);
t4.setBounds(750,450,300,25);

c1.setBounds(750,400,300,25);

b1.setBounds(500,550,100,25);
b2.setBounds(800,550,100,25);

b1.addActionListener(this);
b2.addActionListener(this);


l1.setFont(f1);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
l6.setFont(f2);
c1.setFont(f2);
b1.setFont(f2);
b2.setFont(f2);

frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);

frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);

frm.add(c1);

frm.add(b1);
frm.add(b2);

frm.setSize(500,600);
frm.setVisible(true);
}

public void getFillValue()
{
try
{
a1=t1.getText();
a2=t2.getText();
a3=t3.getText();
a4=c1.getSelectedItem();
a5=t4.getText();
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
pst=con.prepareStatement("insert into CreateAcc values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"')");
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

if(ae.getSource()==b2)
{

frm.setVisible(false);
}

}
}

  






















