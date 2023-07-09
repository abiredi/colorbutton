
import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;

public class ColorButton extends JFrame implements ActionListener{

    JFrame frame;//frame parameter
    JButton red, blue, green, gray;//buttons
    JPanel panel;

    ColorButton(){//constructor
        frame = new JFrame("Colored");// adding buttons to frame
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");
        gray = new JButton("Gray");

        frame.setSize(150,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,600,500,550);
        frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        ;
        red.setBounds(20,20 , 100, 100);
        blue.setBounds(140, 20, 100, 100);
        gray.setBounds(260, 20, 100, 100);
        green.setBounds(380, 20, 100, 100);
        //Adding buttons to frame
        frame.add(red);
        frame.add(blue);
        frame.add(green);
        frame.add(gray);
        frame.setVisible(true);//visible

        //register the similar action
        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        gray.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){//setting color background when we click on button
        if(e.getSource() == red){
            frame.getContentPane().setBackground(Color.RED);
        }
        else if (e.getSource() == blue ){
            frame.getContentPane().setBackground(Color.BLUE);
        }
        else if (e.getSource() == gray){
            frame.getContentPane().setBackground(Color.GRAY);
        }
        else if (e.getSource() == green){
            frame.getContentPane().setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {//main method
        // TODO code application logic here
        ColorButton color = new ColorButton();//calling function
    }
}