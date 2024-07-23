package emr;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class DemoUpdateCaller extends Frame implements ActionListener 
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String q1="",q2="",q3="",q4="",q5="",q6="",q7="",q8="",q9="",w1="",w2="",w3="",w4="",w5="",w6="",w7="",w8="",w9="";
Frame frm;
Font f1,f2;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,a1,a2,a3,a4,a5,a6,a7,a8,a9;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,d1;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,s1,s2,s3,s4,s5,s6,s7,s8;
Checkbox c1,c2;
CheckboxGroup cb1;
public DemoUpdateCaller()
{
frm=new Frame("Caller Form");
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
s6=new TextField("");
s7=new TextField("");
s8=new TextField("");


b1=new Button("UPDATE");
b2=new Button("SEARCH");
b3=new Button("Add New Caller");
b4=new Button("Child Rec Info");
b5=new Button("Police");
b6=new Button("Hospital");
b7=new Button("Fire Station");
b8=new Button("Power Station");
b9=new Button("Case of Accident");
d1=new Button("Exit");

cb1=new CheckboxGroup();
c1=new Checkbox("MARRIED",cb1,true);
c2=new Checkbox("UNMARRIED",cb1,false);

f1=new Font("Arial",Font.BOLD,20);
f2=new Font("Arial",Font.BOLD,12);
}


public void setUpDemoUpdateCaller()
{

frm.setLayout(null);

l1.setBounds(150,150,550,25);
l2.setBounds(150,200,100,25);
l3.setBounds(150,250,100,25);
l4.setBounds(150,300,100,25);
l5.setBounds(150,350,100,25);
l6.setBounds(150,400,100,25);
l7.setBounds(150,450,100,25);
l8.setBounds(150,500,100,25);
l9.setBounds(500,250,100,25);
a1.setBounds(500,300,100,25);
a2.setBounds(500,350,100,25);
a3.setBounds(500,400,100,25);
a4.setBounds(500,450,100,25);
a5.setBounds(900,250,100,25);
a6.setBounds(900,300,100,25);
a7.setBounds(900,350,100,25);
a8.setBounds(900,400,100,25);
a9.setBounds(900,450,100,25);

t1.setBounds(300,200,100,25);
t2.setBounds(300,250,100,25);
t3.setBounds(300,300,100,25);
t4.setBounds(300,350,100,25);
t5.setBounds(300,400,100,25);
t6.setBounds(300,450,100,25);
t7.setBounds(300,500,100,25);
t8.setBounds(700,250,100,25);
t9.setBounds(700,300,100,25);
s1.setBounds(700,350,100,25);
s2.setBounds(700,400,100,25);
s3.setBounds(700,450,100,25);
s4.setBounds(1100,250,100,25);
s5.setBounds(1100,300,100,25);
s6.setBounds(1100,350,100,25);
s7.setBounds(1100,400,100,25);
s8.setBounds(1100,450,100,25);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
d1.addActionListener(this);

b1.setBounds(1100,200,150,25);
b2.setBounds(1100,500,150,25);
b3.setBounds(1400,150,150,25);
b4.setBounds(1400,225,150,25);
b5.setBounds(1400,300,150,25);
b6.setBounds(1400,375,150,25);
b7.setBounds(1400,450,150,25);
b8.setBounds(1400,525,150,25);
b9.setBounds(1400,600,150,25);
d1.setBounds(1400,675,150,25);


c1.setBounds(700,550,100,25);
c2.setBounds(700,600,100,25);


l1.setFont(f1);
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
c1.setFont(f2);
c2.setFont(f2);
b1.setFont(f2);
b2.setFont(f2);
b3.setFont(f2);
b4.setFont(f2);
b5.setFont(f2);
b6.setFont(f2);
b7.setFont(f2);
b8.setFont(f2);
b9.setFont(f2);
d1.setFont(f2);

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
frm.add(s6);
frm.add(s7);
frm.add(s8);


frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(b4);
frm.add(b5);
frm.add(b6);
frm.add(b7);
frm.add(b8);
frm.add(b9);
frm.add(d1);

frm.add(c1);
frm.add(c2);

frm.setSize(600,700);
frm.setVisible(true);
}

public void getFillValue()
{
try
{
q1=t1.getText();
q2=t2.getText();
q3=t3.getText();
q4=t4.getText();
q5=t5.getText();
q6=t6.getText();
q7=t7.getText();
q8=t8.getText();
q9=t9.getText();
w1=s1.getText();
w2=s2.getText();
w3=s3.getText();
w4=s4.getText();
w5=s5.getText();
w6=s6.getText();
w7=s7.getText();
w8=s8.getText();
if(c1.getState()==true)
{
w9="MARRIED";
}
else
{
w9="UNMARRIED";
}

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
pst=con.prepareStatement("update Callerinfo set callname='"+q2+"',Fname='"+q3+"',Mname='"+q4+"',State='"+q5+"',Str='"+q6+"',Monum='"+q7+"',Callage='"+q8+"',Fage='"+q9+"',Mage='"+w1+"',distr='"+w2+"',Hnum='"+w3+"',Callbg='"+w4+"',Fbg='"+w5+"',Mbg='"+w6+"',Vill='"+w7+"',Telnum='"+w8+"',status='"+w9+"' where Emerid='"+q1+"' ");
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
String str=t1.getText();
rec=st.executeQuery("Select*from Callerinfo  where Emerid='"+str+"'");
if(rec.next())
{
t2.setText(rec.getString(2));
t3.setText(rec.getString(3));
t4.setText(rec.getString(4));
t5.setText(rec.getString(5));
t6.setText(rec.getString(6));
t7.setText(rec.getString(7));
t8.setText(rec.getString(8));
t9.setText(rec.getString(9));
s1.setText(rec.getString(10));
s2.setText(rec.getString(11));
s3.setText(rec.getString(12));
s4.setText(rec.getString(13));
s5.setText(rec.getString(14));
s6.setText(rec.getString(15));
s7.setText(rec.getString(16));
s8.setText(rec.getString(17));
c1.getState(rec.getString(18));
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

else if(ae.getSource()==b2)
{
conn();
searchData();
}


}

public void paint(Graphics gh)
{
gh.drawRect(100,100,1200,700);
gh.drawRect(1350,100,300,700);
}

}
