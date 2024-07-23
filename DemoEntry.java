package emr;
import java.awt.*;
import java.awt.event.*;
public class DemoEntry extends Frame implements ActionListener
{
Frame frm;
Label l1,l2,l3,l4,l5;
TextField t1,t2;
Button b1;
Checkbox c1,c2,c3,c4;
CheckboxGroup cb1,cb2;


public DemoEntry()
{
frm=new Frame("Entry Form");
cb1=new CheckboxGroup();
cb2=new CheckboxGroup();

c1=new Checkbox("male",cb1,true);
c2=new Checkbox("Female",cb1,false);
c3=new Checkbox("IND",true,cb2);
c4=new Checkbox("Other",false,cb2);

l1=new Label("Enter The Name");
l2=new Label("Enter The Age");
l3=new Label("Select Nationality");
l4=new Label("select Gender");
l5=new Label("Outcomes");

b1=new Button("Check");

t1=new TextField("");
t2=new TextField("");
}

public void setUpDemoEntry()
{
frm.setLayout(null);

b1.addActionListener(this);

l1.setBounds(100,150,100,25);
l2.setBounds(100,200,100,25);
l4.setBounds(100,250,100,25);
l3.setBounds(100,400,100,25);
l5.setBounds(200,550,400,25);

t1.setBounds(250,150,200,25);
t2.setBounds(250,200,100,25);

c1.setBounds(250,250,100,25);
c2.setBounds(250,300,100,25);
c3.setBounds(250,400,100,25);
c4.setBounds(250,450,100,25);

b1.setBounds(150,600,250,25);



frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(t1);
frm.add(t2);
frm.add(c1);
frm.add(c2);
frm.add(c3);
frm.add(c4);
frm.add(b1);
frm.setSize(600,700);
frm.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{

int age=0;
String name="",na="";

age=Integer.parseInt(t2.getText());
name=t1.getText();

if(c3.getState())
{
na="Ind";
}
else
{
na="Oth";
}


if(na.equals("Ind") && age>=18)
{
l5.setText(name + "you are now" + age + "you can vote");
}
else
{
l5.setText("you can't vote");
}






}
}


