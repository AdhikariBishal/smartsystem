package emr;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoProgresBar extends Frame implements ActionListener, Runnable
{
int s=0;
Thread th;
Frame frm;
JButton b1;
JProgressBar jprogressbar;

public DemoProgresBar()
{
frm= new Frame("Progress Bar");
b1=new JButton("Button B1");
jprogressbar=new JProgressBar();

th= new Thread(this);
th.start();
}

public void run()
{
try
{
for(s=0;s<=100;s=s+1)
{
if(s<100)
{
jprogressbar.setValue(jprogressbar.getValue() +1);
}

else 
{
DemoLoginForm obj=new DemoLoginForm();
obj.setUpDemoLoginForm();
frm.setVisible(false);
}
Thread.sleep(10);
}

}
catch(Exception ex)
{
}
}


public void setUpDemoProgresBar()
{
frm.setLayout(new FlowLayout());
frm.add(jprogressbar);
frm.add(b1);
jprogressbar.setStringPainted(true);



b1.addActionListener(this);


frm.setSize(1600,1200);
frm.setVisible(true);
}


public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{

}





}


}
