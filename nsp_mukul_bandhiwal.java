import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class car extends Applet implements ActionListener {
    int x=0,y=0;
    Button u = new Button("Enlarge");
   
    Button l = new Button("Small");
   
    
    public void init() {
        add(u);
        u.addActionListener(this);
       
        add(l);
        l.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == l) {
           y=y+1;
        }
        
        else if (e.getSource() == u) {
            x=x+1;
        }
        
        repaint();
    }

    public void paint(Graphics g){
        if(x>=0||y>=0){
          //car
    g.setColor (Color.blue);
    g.fillArc (75,415,140+x+x-y-y,60+x+x-y-y,0,180);
    g.fillArc (105,400,80+x+x-y-y,60+x+x-y-y,0,180);

   

    g.setColor (Color.black);
    g.fillArc (100+x-y,430+x-y,20+x-y,20+x-y,0,360);
    g.fillArc (160+x-y,430+x-y,20+x-y,20+x-y,0,360);
    g.setColor (Color.white);
    g.fillArc (104+x-y,434+x-y,12+x-y,12+x-y,0,360);
    g.fillArc (164+x-y,434+x-y,12+x-y,12+x-y,0,360);              



        }
    }
}  
/* 
<applet code="car.class" width="1000" height="1000"> 
</applet> 
*/