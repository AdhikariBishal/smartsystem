package emr;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class DemoAddArea extends Frame implements ActionListener
{
Connection con;
Statement st;
ResultSet rec;
PreparedStatement pst;
String a1="",a2="",a3="",a4="",a5="";
Font f1,f2;
Frame frm;
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2,t3,t4,t5;
Button b1,b2;

public DemoAddArea()
{
frm=new Frame("Add Area");

l1=new Label("Add Area Name");
l2=new Label("Area Name");
l3=new Label("Area Code");
l4=new Label("Police Station Number");
l5=new Label("Fire Station Number");
l6=new Label("Power Station Number");


t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");
t5=new TextField("");


b1=new Button("Save");
b2=new Button("Close");

f1=new Font("Arial",Font.BOLD,40);
f2=new Font("Arial",Font.BOLD,13);

}

public void setUpDemoAddArea()
{
frm.setLayout(null);

l1.setBounds(600,100,500,50);
l2.setBounds(450,250,200,50);
l3.setBounds(450,300,200,50);
l4.setBounds(450,350,200,50);
l5.setBounds(450,400,200,50);
l6.setBounds(450,450,200,50);

t1.setBounds(750,250,300,25);
t2.setBounds(750,300,300,25);
t3.setBounds(750,350,300,25);
t4.setBounds(750,400,300,25);
t5.setBounds(750,450,300,25);

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
frm.add(t5);




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
a4=t4.getText();
a5=t5.getText();
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
pst=con.prepareStatement("insert into AddArea values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"')");
pst.executeUpdate();
}
catch(SQLException se)
{
System.out.println(se);
}
}

public void setID(String ID)
{
t2.setText(ID);
}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{

getFillValue();
conn();
putData();
}

else if(ae.getSource()==b2)
{
frm.setVisible(false);
}

}
}



