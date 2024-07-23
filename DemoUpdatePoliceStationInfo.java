package emr;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class DemoUpdatePoliceStationInfo extends Frame implements ActionListener 
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="";
Frame frm;
Font f1,f2,f3;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
Button b1,b2,b3;
TextField t1,t2,t3,t4,t5,t6,t7,t8;

public  DemoUpdatePoliceStationInfo()
{
frm=new Frame("Police Station Information");
l1=new Label("POLICE STATION INFORMATION");
l2=new Label("POLICE STATION DETAILS");
l3=new Label("NAME OF POLICE STATION");
l4=new Label("POLICE STATION PHONE NO.");
l5=new Label("CONTROL ROOM NO.");
l6=new Label("EMERGENCY NO.");
l7=new Label("DISTANCE");
l8=new Label("CO CITY PHONE NO.");
l9=new Label("DIG PHONE NO.");
l10=new Label("CALLER ID");

t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");
t5=new TextField("");
t6=new TextField("");
t7=new TextField("");
t8=new TextField("");

b1=new Button("UPDATE");
b2=new Button("CLOSE");
b3=new Button("SEARCH");


f1=new Font("Arial",Font.BOLD,30);
f2=new Font("Arial",Font.BOLD,13);
f3=new Font("Arial",Font.BOLD,19);

}

public void setUpDemoUpdatePoliceStationInfo()
{
frm.setLayout(null);

l1.setBounds(450,150,650,25);
l2.setBounds(450,280,300,25);
l3.setBounds(450,350,200,25);
l4.setBounds(450,400,200,25);
l5.setBounds(450,450,200,25);
l6.setBounds(450,500,200,25);
l7.setBounds(450,550,200,25);
l8.setBounds(450,600,200,25);
l9.setBounds(450,650,200,25);
l10.setBounds(450,700,200,25);

t1.setBounds(750,350,200,25);
t2.setBounds(750,400,200,25);
t3.setBounds(750,450,200,25);
t4.setBounds(750,500,200,25);
t5.setBounds(750,550,200,25);
t6.setBounds(750,600,200,25);
t7.setBounds(750,650,200,25);
t8.setBounds(750,700,200,25);


b1.setBounds(500,750,100,25);
b2.setBounds(750,750,100,25);
b3.setBounds(600,800,100,25);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);


l1.setFont(f1);
l2.setFont(f3);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
l6.setFont(f2);
l7.setFont(f2);
l8.setFont(f2);
l9.setFont(f2);
l10.setFont(f2);
b1.setFont(f2);
b2.setFont(f2);
b3.setFont(f2);

frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(l8);
frm.add(l9);
frm.add(l10);

frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(t6);
frm.add(t7);
frm.add(t8);

frm.add(b1);
frm.add(b2);
frm.add(b3);

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
a8=t8.getText();
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

public void updateData()
{
try
{
pst=con.prepareStatement("Update policestainfo set nameofpolicesta='"+a1+"',policestaphonum='"+a2+"',CRnum='"+a3+"',emernum='"+a4+"',dis='"+a5+"',cocityphonum='"+a6+"',digphonum='"+a7+"' Where Cid='"+a8+"'");
pst.executeUpdate();
}
catch(SQLException se)
{
System.out.println(se);
}
}


public void searchData()
{
try
{
st=con.createStatement();
String str=t8.getText();
rec=st.executeQuery("Select*from policestainfo where Cid='"+str+"'");
if(rec.next())
{
t2.setText(rec.getString(2));
t3.setText(rec.getString(3));
t4.setText(rec.getString(4));
t5.setText(rec.getString(5));
t6.setText(rec.getString(6));
t7.setText(rec.getString(7));
t1.setText(rec.getString(1));
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}




public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{

getFillValue();
conn();
updateData();
}

else if(ae.getSource()==b3)
{
conn();
searchData();
}


}
}

