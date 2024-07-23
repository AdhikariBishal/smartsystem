package emr;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class DemoLoginForm extends Frame implements ActionListener
{
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rec;
JFrame frm;
Font f1;
JLabel l1,l2,l3;
JButton b1,b2,b3,b4,b5;
JTextField t1,t2;

public DemoLoginForm()
{
frm=new JFrame("Login form");
l1=new JLabel("Enter The User Id");
l2=new JLabel("Enter The Password");
l3=new JLabel();

t1=new JTextField("");
t2=new JTextField("");


b1=new JButton("FORGET PASSWORD");
b2=new JButton("CHANGE PASSWORD");
b3=new JButton("LOGIN");
b4=new JButton("EXIT");
b5=new JButton("Create Acc");

f1=new Font("Arial",Font.BOLD,13);


}

public void setUpDemoLoginForm()
{
frm.setLayout(null);

l1.setBounds(250,250,150,25);
l2.setBounds(250,300,150,25);
l3.setBounds(250,150,250,25);

t1.setBounds(450,250,150,25);
t2.setBounds(450,300,150,25);


b1.setBounds(250,400,150,25);
b2.setBounds(450,400,150,25);
b3.setBounds(650,250,150,25);
b4.setBounds(650,300,150,25);
b5.setBounds(650,350,150,25);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

l1.setFont(f1);
l2.setFont(f1);
l3.setFont(f1);
b1.setFont(f1);
b2.setFont(f1);
b3.setFont(f1);
b4.setFont(f1);
b5.setFont(f1);


frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(t1);
frm.add(t2);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(b4);
frm.add(b5);

frm.setSize(600,700);
frm.setVisible(true);
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

public void searchData()
{
try
{
st=con.createStatement();
String str1=t1.getText();
String str2=t2.getText();
rec=st.executeQuery("Select*from CreateAcc  where UserID='"+str1+"' and  Psw='"+str2+"'");
if(rec.next())
{
DemoCaller obj=new DemoCaller();
obj.setUpDemoCaller();
}
else
{
l3.setText("INVALID USERID AND PASSWORD");

}
}
catch(Exception ex)
{
System.out.println(ex);
}
}


public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b3)
{
conn();
searchData();
}

else if(ae.getSource()==b4)
{
frm.setVisible(false);
}

else if(ae.getSource()==b5)
{
DemoCreateAcc obj=new DemoCreateAcc();
obj.setUpDemoCreateAcc();
frm.setVisible(false);
}



}
}
