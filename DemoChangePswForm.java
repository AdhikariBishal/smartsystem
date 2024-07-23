package emr;
import java.awt.*;
import java.awt.event.*;
public class DemoChangePswForm extends Frame implements ActionListener 
{
String a1="",a2="",a3="",a4="";
Frame frm;
Font f1;
Label l1,l2,l3,l4;
Button b1,b2;
TextField t1,t2,t3,t4;

public  DemoChangePswForm()
{
frm=new Frame("Password Form");
l1=new Label("Enter User Id");
l2=new Label("Enter Older Password");
l3=new Label("Enter New Password");
l4=new Label("Re-Enter New Password");


t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");

b1=new Button("Insert");
b2=new Button("Exit");

f1=new Font("Arial",Font.BOLD,13);

}

public void setUpDemoChangePswForm()
{
frm.setLayout(null);

l1.setBounds(350,250,200,25);
l2.setBounds(350,300,200,25);
l3.setBounds(350,350,200,25);
l4.setBounds(350,400,200,25);

t1.setBounds(600,250,150,25);
t2.setBounds(600,300,150,25);
t3.setBounds(600,350,150,25);
t4.setBounds(600,400,150,25);

b1.setBounds(350,450,150,25);
b2.setBounds(600,450,150,25);

b2.addActionListener(this);
b1.addActionListener(this);

l1.setFont(f1);
l2.setFont(f1);
l3.setFont(f1);
l4.setFont(f1);
b1.setFont(f1);
b2.setFont(f1);


frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(b1);
frm.add(b2);
frm.setSize(600,700);
frm.setVisible(true);
}


public void conn()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("Jdbc:odbc:CreateAcc");
}
catch(Exception ex);
{
System.out.println(ex)
}
}

public void putData()
{
try
{
pst=con.prepareStatement("insert into CreateAcc Values('"+a1+"','"+a2+"','"+a3+"','"+a4+"')");
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
conn();
putData();
}

else if(ae.getSource()==b2)
{
frm.setVisible(false);
}

}
}

