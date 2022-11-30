import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Page extends JFrame implements ActionListener{
    Container Page;
    JLabel ownerName;
    JLabel scNo;
    JLabel units;
    JLabel title;
    JTextField tOwner, tNo,tUnits;
    JButton submit;
    JTextArea details;
    Page(){
        setTitle("ELectricity Bill");
        setBounds(200, 100, 600, 500);
        setResizable(true);

        Page = getContentPane();
        Page.setLayout(null);

        title = new JLabel("Electricity Bill");
        title.setLocation(170, 30);
        title.setSize(600,30);
        Page.add(title);

        ownerName = new JLabel("Owner Name");
        ownerName.setLocation(100,100);
        ownerName.setSize(100,20);
        Page.add(ownerName);

        scNo = new JLabel("SC Number");
        scNo.setLocation(100,150);
        scNo.setSize(100,20);
        Page.add(scNo);

        units = new JLabel("Units");
        units.setLocation(100,200);
        units.setSize(100,20);
        Page.add(units);

        tOwner= new JTextField();
        tOwner.setLocation(200,100);
        tOwner.setSize(100,20);
        Page.add(tOwner);

        tNo= new JTextField();
        tNo.setLocation(200,150);
        tNo.setSize(100,20);
        Page.add(tNo);

        tUnits= new JTextField();
        tUnits.setLocation(200,200);
        tUnits.setSize(100,20);
        Page.add(tUnits);

        submit = new JButton("Submit");
        submit.setLocation(100,250);
        submit.setSize(100,20);
        Page.add(submit);
        submit.addActionListener(this);

        details= new JTextArea("");
        details.setLocation(330,100);
        details.setEditable(false);
        details.setSize(200, 200);
        Page.add(details);

        setVisible(true);



    }

    public void actionPerformed(ActionEvent e){
        String name = tOwner.getText();
        String scNo = tNo.getText();
        String unit = tUnits.getText();

        int u = Integer.parseInt(unit);
       
        double billpay=0;

        if(u<100){
            billpay = 0;
        }else if(u >100 && u < 200){
            billpay = u*1.5;
        }else if(u > 200){
            billpay = 100*1.5 + (u-100)*2;        
        }


        if(e.getSource() == submit){
            String detail = "Name: "+name+"\n"+"SC Number: "+scNo+"\n"+"Units Consumed: "+unit+"\nAmount to be paid: Rs "+billpay;
            // String detail = "Dinesh";
            
            details.setText(detail);
        }

        

    }

}

class Main{
    public static void main(String[] args){
        Page pg = new Page();
    }
}