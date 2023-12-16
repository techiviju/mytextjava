import java.applet.Applet;
import java.awt.*;
import java.applet.*;
public class LoginApplet extends Applet
{
public LoginApplet()
{
Panel p=new Panel();
Label l1=new Label("User_Name");
Label l2=new Label("Password");
TextField t1=new TextField(10);
TextField t2=new TextField(10);
Button b1=new Button("Log In");
Button b2=new Button("Cancel");
add(p);
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(b1);
p.add(b2);
}
public void init()
{
new LoginApplet();
} }