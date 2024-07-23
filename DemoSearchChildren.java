package emr;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class DemoSearchChildren extends Frame implements ActionListener  
{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rec;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="";
Frame frm;
Font f1,f2,f3;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
Button b2,b3;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

public DemoSearchChildren() 
{
frm=new Frame("Frame Children");
l1=new Label("CHILDREN INFORMATION");
l2=new Label("CHILDREN INFORMATION OF CALLER");
l3=new Label("EMERGENCY ID");
l4=new Label("NAME");
l5=new Label("NAME");
l6=new Label("NAME");
l7=new Label("AGE");
l8=new Label("AGE");
l9=new Label("AGE");
l10=new Label("BLOOD GROUP");
l11=new Label("BLOOD GROUP");
l12=new Label("BLOOD GROUP");


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


b2=new Button("Close");
b3=new Button("Search");


f1=new Font("Arial",Font.BOLD,30);
f2=new Font("Arial",Font.BOLD,12);
f3=new Font("Arial",Font.BOLD,19);

}

public void setUpDemoSearchChildren()
{


frm.setLayout(null);

l1.setBounds(550,110,450,25);
l2.setBounds(150,150,550,25);
l3.setBounds(150,200,100,25);
l4.setBounds(150,250,100,25);
l5.setBounds(150,300,100,25);
l6.setBounds(150,350,100,25);
l7.setBounds(450,250,100,25);
l8.setBounds(450,300,100,25);
l9.setBounds(450,350,100,25);
l10.setBounds(750,250,100,25);
l11.setBounds(750,300,100,25);
l12.setBounds(750,350,100,25);


t1.setBounds(300,200,100,25);
t2.setBounds(300,250,100,25);
t3.setBounds(300,300,100,25);
t4.setBounds(300,350,100,25);
t5.setBounds(600,250,100,25);
t6.setBounds(600,300,100,25);
t7.setBounds(600,350,100,25);
t8.setBounds(900,250,100,25);
t9.setBounds(900,300,100,25);
t10.setBounds(900,350,100,25);


b2.setBounds(850,475,150,25);
b3.setBounds(550,475,150,25);

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
l11.setFont(f2);
l12.setFont(f2);
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

frm.add(b3);
frm.add(b2);
frm.setSize(600,700);
conn();
searchData();
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
a9=t9.getText();
a10=t10.getText();
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



public void searchData()
{
try
{
st=con.createStatement();
String str=t1.getText();
rec=st.executeQuery("Select*from ChilInfo where UserID='"+str+"'");
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
t10.setText(rec.getString(10));

}
}
catch(Exception ex)
{
System.out.println(ex);
}
}

public void setID(String ID)
{
t1.setText(ID);
}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b2)
{

frm.setVisible(false);
}




}
}