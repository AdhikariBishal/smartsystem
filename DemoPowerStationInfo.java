package emr;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class DemoPowerStationInfo extends Frame implements ActionListener 
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="";
Frame frm;
Font f1,f2;
Label l1,l2,l3,l4,l5,l6,l7,l8;
Button b1,b2;
TextField t1,t2,t3,t4,t5,t6,t7;

public  DemoPowerStationInfo()
{
frm=new Frame("Power Station Information");
l1=new Label("POWER STATION INFORMATION");
l2=new Label("EMERGENCY ID");
l3=new Label("LOCATION OF POWER STATION");
l4=new Label("POWER STATION PHONE No.");
l5=new Label("Name Of S.D.E");
l6=new Label("S.D.E Phone No.");
l7=new Label("Name Of J.E");
l8=new Label("J.E Phone No.");

t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");
t5=new TextField("");
t6=new TextField("");
t7=new TextField("");

b1=new Button("Next");
b2=new Button("SEARCH");

f1=new Font("Arial",Font.BOLD,40);
f2=new Font("Arial",Font.BOLD,13);


}

public void setUpDemoPowerStationInfo()
{
frm.setLayout(null);

l1.setBounds(420,250,650,50);
l2.setBounds(450,350,200,25);
l3.setBounds(450,400,200,25);
l4.setBounds(450,450,200,25);
l5.setBounds(450,500,200,25);
l6.setBounds(450,550,200,25);
l7.setBounds(450,600,200,25);
l8.setBounds(450,650,200,25);

t1.setBounds(750,350,200,25);
t2.setBounds(750,400,200,25);
t3.setBounds(750,450,200,25);
t4.setBounds(750,500,200,25);
t5.setBounds(750,550,200,25);
t6.setBounds(750,600,200,25);
t7.setBounds(750,650,200,25);

b1.setBounds(500,700,100,25);
b2.setBounds(750,700,100,25);

b2.addActionListener(this);
b1.addActionListener(this);

l1.setFont(f1);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
l6.setFont(f2);
l7.setFont(f2);
l8.setFont(f2);
b1.setFont(f2);
b2.setFont(f2);


frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(l8);
frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(t6);
frm.add(t7);
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
a5=t5.getText();
a6=t6.getText();
a7=t7.getText();
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
pst=con.prepareStatement("insert into Pwrstainfo values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"')");
pst.executeUpdate();
}
catch(SQLException se)
{
System.out.println(se);
}
}

public void setID(String ID)
{
t1.setText(ID);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{

getFillValue();
conn();
putData();
DemoFireStationInfo obj=new DemoFireStationInfo();
obj.setID(t1.getText());
obj.setUpDemoFireStationInfo();
frm.setVisible(false);
}


}
}

