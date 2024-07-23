package emr;
import java.awt.*;
import java.awt.event.*;
public class DemoFrame extends Frame implements ActionListener
{
Frame frm;
Label l1,l2;
TextField t1,t2;
Button b1;

public DemoFrame()
{
frm=new Frame("Test Form");
l1=new Label("Enter The Num");
l2=new Label("Result");
t1=new TextField();
t2=new TextField();
b1=new Button("ok");
}


public void setUpDemoFrame()
{
frm.setLayout(null);
l1.setBounds(100,100,150,25);
l2.setBounds(100,130,150,25);
t1.setBounds(270,100,100,25);
t2.setBounds(270,130,100,25);
b1.setBounds(200,180,100,25);
b1.addActionListener(this);
frm.add(l1);
frm.add(l2);
frm.add(t1);
frm.add(t2);
frm.add(b1);
frm.setSize(600,700);
frm.setVisible(true);
}


public void actionPerformed(ActionEvent ae)
{






}
}
