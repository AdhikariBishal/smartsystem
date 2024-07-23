package emr;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class DemoInfoAboutAccident extends Frame implements ActionListener
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String q1="",q2="",q3="",q4="",q5="",q6="",q7="",q8="",q9="",w1="",w2="",w3="",w4="",w5="";
Frame frm;
Font f1,f2;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
Button b1,b2,b3,b4,b5,b6,b7;
Choice c1;
Checkbox g1,g2,g3,g4,g5,g6,g7;
CheckboxGroup cb1,cb2,cb3;

public DemoInfoAboutAccident()
{
frm=new Frame("InfoAboutAccident");

l1=new Label("INFORMATION ABOUT ACCIDENT");
l2=new Label("SELECT AREA");
l3=new Label("CASE NUMBER");
l4=new Label("NAME OF CALLER");
l5=new Label("LOCATION OF CALLER");
l6=new Label("TIME OF ACCIDENT");
l7=new Label("VEHICLE NUMBER");
l8=new Label("VEHICLE NUMBER 2nd");
l9=new Label("AMBULANCE NUMBER");
l10=new Label("POLICE STATION NUMBER");
l11=new Label("FIRE STATION NUMBER");
l12=new Label("CONTACT NUMBER");

t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");
t5=new TextField("");
t6=new TextField("");
t7=new TextField("");
t8=new TextField("");
t9=new TextField("");
t10=new TextField("");

c1=new Choice();
c1.add("DEHARADUN");
c1.add("DELHI");
c1.add("MUMBAI");
c1.add("GOA");
c1.add("SIMLA");
c1.add("LADAK");

cb1=new CheckboxGroup();
cb2=new CheckboxGroup();
cb3=new CheckboxGroup();
g1=new Checkbox("ROAD ACCIDENT",cb1,true);
g2=new Checkbox("OTHER ACCIDENT",cb2,false);
g3=new Checkbox("TWO WHEELER",cb2,true);
g4=new Checkbox("FOUR WHEELER",cb2,false);
g5=new Checkbox("ONSPOT DEATH",cb3,true);
g6=new Checkbox("NORMAL INJURED",cb3,false);
g7=new Checkbox("SERIOUS INJURED",cb3,false);

b1=new Button("ADD NEW AREA");
b2=new Button("MAIN FORM");
b3=new Button("SAVE RECORD");
b4=new Button("UPDATE");
b5=new Button("NEW RECORD");
b6=new Button("SEARCH ");
b7=new Button("CLOSE ");


f1=new Font("Arial",Font.BOLD,30);
f2=new Font("Arial",Font.BOLD,13);

}


public void setUpDemoInfoAboutAccident()
{
frm.setLayout(null);

l1.setBounds(450,80,700,25);
l2.setBounds(800,150,150,25);
l3.setBounds(400,340,200,25);
l4.setBounds(400,380,200,25);
l5.setBounds(400,420,200,25);
l6.setBounds(400,460,200,25);
l7.setBounds(400,500,200,25);
l8.setBounds(400,540,200,25);
l9.setBounds(400,580,200,25);
l10.setBounds(400,620,200,25);
l11.setBounds(400,660,200,25);
l12.setBounds(400,700,200,25);

t1.setBounds(650,340,150,25);
t2.setBounds(650,380,150,25);
t3.setBounds(650,420,150,25);
t4.setBounds(650,460,150,25);
t5.setBounds(650,500,150,25);
t6.setBounds(650,540,150,25);
t7.setBounds(650,580,150,25);
t8.setBounds(650,620,150,25);
t9.setBounds(650,660,150,25);
t10.setBounds(650,700,150,25);

g1.setBounds(400,150,150,25);
g2.setBounds(400,180,150,25);
g3.setBounds(600,150,150,25);
g4.setBounds(600,180,150,25);
g5.setBounds(950,190,150,25);
g6.setBounds(950,220,150,25);
g7.setBounds(950,250,150,25);

c1.setBounds(800,180,110,25);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);

b1.setBounds(800,220,110,25);
b2.setBounds(950,400,100,25);
b3.setBounds(950,450,100,25);
b4.setBounds(500,750,100,25);
b5.setBounds(950,500,100,25);
b6.setBounds(600,800,100,25);
b7.setBounds(700,750,100,25);

l1.setFont(f1);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
l6.setFont(f2);
l7.setFont(f2);
l8.setFont(f2);
l9.setFont(f2);
l10.setFont(f2);
l11.setFont(f2);
l12.setFont(f2);
g1.setFont(f2);
g2.setFont(f2);
g3.setFont(f2);
g4.setFont(f2);
g5.setFont(f2);
g6.setFont(f2);
g7.setFont(f2);
c1.setFont(f2);
b3.setFont(f2);
b4.setFont(f2);
b5.setFont(f2);
b1.setFont(f2);
b2.setFont(f2);
b6.setFont(f2);
b7.setFont(f2);

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
frm.add(l11);
frm.add(l12);

frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(t6);
frm.add(t7);
frm.add(t8);
frm.add(t9);
frm.add(t10);

frm.add(c1);

frm.add(g1);
frm.add(g2);
frm.add(g3);
frm.add(g4);
frm.add(g5);
frm.add(g6);
frm.add(g7);

frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(b4);
frm.add(b5);
frm.add(b6);
frm.add(b7);
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
w1=t10.getText();
w2=c1.getSelectedItem();

if(g1.getState()==true)
{
w3="ROAD ACCIDENT";
}
else 
{
w3="OTHER ACCIDENT";
}

if(g3.getState()==true)
{
w4="TWO WHEELER";
}
else 
{
w4="FOUR WHEELER";
}

if(g5.getState()==true)
{
w5="ONSPOT DEATH";
}
else 
{
w5="NORMAL INJURED";
}
else  
{
w5="SERIOUS INJURED";
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
pst=con.prepareStatement("update Infoabacci set nameofcaller='"+q2+"',locofcaller='"+q3+"',timeofacci='"+q4+"',vehnum1='"+q5+"',vehnum2='"+q6+"',ambunum='"+q7+"',policestanum='"+q8+"',firestanum='"+q9+"',conum='"+w1+"',acctype='"+w2+"',vehtype='"+w3+"',contype='"+w4+"',areaname='"+w5+"' where casenum='"+q1+"' ");
pst.executeUpdate();
}
catch(SQLException se)
{
System.out.println(se);
}
}


public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b4)
{
getFillValue();
conn();
updateData();
}


}
}












