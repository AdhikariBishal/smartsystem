package emr;
import java.awt.*;
import java.awt.event.*;
public class DemoForgetPswForm extends Frame implements ActionListener
{
Font f1;
Label l1,l2,l3,l4;
TextField t1,t2;
Button b1,b2,b3;
Frame frm;

public DemoForgetPswForm()
{
frm=new Frame("ForgetPsw Form");
l1=new Label("Enter ID");
l2=new Label("Your Security Question is:-");
l3=new Label("Give Answer");
l4=new Label("Your Password is:");

t1=new TextField();
t2=new TextField();

b1=new Button("Ok");
b2=new Button("Retrive");
b3=new Button("Exit");

f1=new Font("Arial",Font.BOLD,15);

}

public void setUpDemoForgetPswForm()
{
frm.setLayout(null);
l1.setBounds(350,250,200,25);
l2.setBounds(350,300,200,25);
l3.setBounds(350,350,200,25);
l4.setBounds(350,400,200,25);

t1.setBounds(560,250,150,25);
t2.setBounds(560,350,150,25);

b1.setBounds(750,250,150,25);
b2.setBounds(750,350,150,25);
b3.setBounds(750,450,150,25);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

l1.setFont(f1);
l2.setFont(f1);
l3.setFont(f1);
l4.setFont(f1);
b3.setFont(f1);
b1.setFont(f1);
b2.setFont(f1);

frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(t1);
frm.add(t2);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.setSize(600,700);
frm.setVisible(true);
}



public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b3)
{
frm.setVisible(false);
}

}

}










