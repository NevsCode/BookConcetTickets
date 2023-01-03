
package bookconcettickets;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Ticket implements ActionListener{
    JFrame frame ;
    JLabel labelName,labelTicket,labelTickname,labelTickSeatType;
    JTextField TextFieldName,TextFieldTicket;
    JComboBox tickecttype,tickectSeatType,tickectSeatTypePrices;
    JButton showbutton,calculateButton,savebutton,clearbutton,exitbutton;
    JTextArea texts;
    Ticket()
    {
        labelName = new JLabel();
        labelName.setText("Enter your name: ");
        labelName.setBounds(10,0, 100, 100);
       
        TextFieldName = new JTextField();
        TextFieldName.setBounds(270, 35,200, 30);
        
        labelTicket = new JLabel();
        labelTicket.setText("Enter the Tickect number: ");
        labelTicket.setBounds(10, 0, 200, 200);
        
        TextFieldTicket = new JTextField();
        TextFieldTicket.setBounds(270, 80, 200, 30);
       
        labelTickname = new JLabel();
        labelTickname.setText("Select the type of tickect: ");
        labelTickname.setBounds(10,30, 250,200 );
        
        String[] ticketType = {"Open", "Reserved"};
        tickecttype = new JComboBox(ticketType);
        tickecttype.setBounds(270, 110, 100, 30);
        tickecttype.setFocusable(false);
        
        labelTickSeatType = new  JLabel();
        labelTickSeatType.setText("Select the type of Seat: ");
        labelTickSeatType.setBounds(10, 55, 250, 200);
        
        String[] ticketSeat = {" General Admission ", "Festival","Platinum","Gold","Silver","Bronze"};
      
        tickectSeatType = new JComboBox(ticketSeat);
        tickectSeatType.setBounds(270, 140, 150, 30);
        tickectSeatType.setFocusable(false);
        
        showbutton = new JButton();
        showbutton.setText("Show ticket sales ");
        showbutton.setBounds(15, 170, 150, 30);
        showbutton.addActionListener(this);
        showbutton.setFocusable(false);
        
        calculateButton = new JButton();
        calculateButton.setText("calculate Ticket Cost ");
        calculateButton.setBounds(300, 170, 170, 30);
        calculateButton.addActionListener(this);
        calculateButton.setFocusable(false);
        
        texts = new JTextArea();
        
        texts.setBounds(20, 200,450,300);
        
        savebutton = new JButton();
        savebutton.setText("Save");
        savebutton.setBounds(130 , 500, 70, 40);
        savebutton.addActionListener(this);
        savebutton.setFocusable(false);
        
        clearbutton = new JButton();
        clearbutton.setText("Clear");
        clearbutton.setBounds(180 , 500, 70, 40);
        clearbutton.addActionListener(this);
        clearbutton.setFocusable(false);
        
        exitbutton = new JButton();
        exitbutton.setText("Eixt");
        exitbutton.setBounds(230 , 500, 70, 40);
        exitbutton.addActionListener(this);
        exitbutton.setFocusable(false);
        
        frame = new JFrame(); 
        frame.setTitle("Book Concert Ticket");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.add(TextFieldName);
        frame.add(labelName);
        frame.add(labelTicket);
        frame.add(TextFieldTicket);
        frame.add(labelTickname);
        frame.add(tickecttype);
        frame.add(labelTickSeatType);
        frame.add(tickectSeatType);
        frame.add(showbutton);
        frame.add(calculateButton);
        frame.add(savebutton);
        frame.add(clearbutton);
        frame.add(exitbutton);
        frame.add(texts);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
           if(e.getSource() == showbutton)
           {
                String name = TextFieldName.getText();
                int ticket = Integer.parseInt(TextFieldTicket.getText());
                String type = tickecttype.getSelectedItem().toString();
                String seattype = tickectSeatType.getSelectedItem().toString();
                texts.setText(name + " ," + ticket + " ," + type + ","  + seattype);
            }
        
            if(e.getSource() == savebutton)
            {
                String name = TextFieldName.getText();
                int ticket = Integer.parseInt(TextFieldTicket.getText());
                String type = tickecttype.getSelectedItem().toString();
                String seattype = tickectSeatType.getSelectedItem().toString();
                texts.setText(name + " ," + ticket + " ," + type + ","  + seattype);
            }
        
            if(e.getSource() ==  clearbutton)
            {
                texts.setText("");
            }
        
            if(e.getSource() == savebutton)
            {
                String name = TextFieldName.getText();
                int ticket = Integer.parseInt(TextFieldTicket.getText());
                String type = tickecttype.getSelectedItem().toString();
                String seattype = tickectSeatType.getSelectedItem().toString();
                texts.setText(name + " ," + ticket + " ," + type + ","  + seattype);
            }
        
            if(e.getSource() == exitbutton)
            {
                System.exit(0);
            }
            
            if(e.getSource() == calculateButton)
            {
                String[] ticketSeat = {" General Admission ", "Festival","Platinum","Gold","Silver","Bronze"};
                String seattype = tickectSeatType.getSelectedItem().toString();
                double[] ticketSeatPrices = {500,800,1550,1350,1250,1150};
               
                int ticket = Integer.parseInt(TextFieldTicket.getText());
                
                boolean flag = false;
                
                for(int i = 0; i < ticketSeatPrices.length;i++)
                {
                    if(ticketSeat[i] .equals(ticketSeat[1]) )
                    {
                        flag = true;
                        System.out.println(ticketSeatPrices[i]);
                        double totalprice = ticketSeatPrices[i] * ticket; 
                        JOptionPane.showMessageDialog(null,"The Total tickect Cost = R " + totalprice,"Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
        catch(HeadlessException | NumberFormatException mistake)
        {
            System.out.println("you have to fill in all ");        
        }
        
    }
}
