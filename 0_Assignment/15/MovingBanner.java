/*
APPLET PROGRAM FOR MOVING BANNER FROM LEFT TO
RIGHT */
/*<applet code="MovingBanner.class" height=400 width=600> </applet> */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MovingBanner extends Applet implements Runnable
{
int x = 599, x1 = 1;
Thread t1;String s1 = "WELCOME TO JAVA PROGRAMMING";
boolean stopflag;
public void init()
{
setBackground(Color.PINK);
t1 = new Thread(this);
stopflag=false;
t1.start();
}
public void run()
{
while(true)
{
try
{
repaint();
Thread.sleep(10);
if(stopflag)
break;
}
catch(InterruptedException e) { }
}
}
public void paint(Graphics g)
{
g.setFont(new Font("Times New Roman", Font.BOLD, 30));
g.setColor(Color.RED);g.drawString(s1, x1, 200);
if (x1 >=x)
{
x1 = 1;
}
x1=x1+1;
}
public void stop()
{
stopflag=true;
t1=null;
}
}
