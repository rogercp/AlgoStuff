// Name:Rogelio Caballero 
// SID#:0480110
// Date: 13 July 2020
// Description: program that uses giu interface to calculate users monthly payment and TPC for a borrowed amount

import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HowMuch extends JFrame implements ActionListener
{


  Container content = this.getContentPane();

  JTextField borrowedAmount = new JTextField();

  JTextField interestRate = new JTextField();

  JTextField numYears = new JTextField();

  JLabel monthlyPayment = new JLabel("",JLabel.CENTER);

  JLabel totalCost = new JLabel("",JLabel.CENTER);

  JButton calculate;

  String input1;
  String input2;
  String input3;

 

   public HowMuch()
   {
      JLabel borrowedAmountText = new JLabel("Amount Of Purchase",JLabel.RIGHT);
      JLabel interestRateText = new JLabel("Interest Rate [like 7.5]",JLabel.RIGHT);
      JLabel numYearsText = new JLabel("Years To Pay",JLabel.RIGHT);
      JLabel monthlyPaymentText = new JLabel("Monthly Payment:",JLabel.RIGHT);
      JLabel totalCostText = new JLabel("Total Purchase Cost:",JLabel.RIGHT);


      content.setLayout(new GridLayout(0,2,5,5));

      content.add(borrowedAmountText);
      content.add(borrowedAmount);
      borrowedAmount.setHorizontalAlignment(JTextField.LEFT);

      content.add(interestRateText);
      content.add(interestRate);

      content.add(numYearsText);
      content.add(numYears);

      content.add(monthlyPaymentText);
      content.add(monthlyPayment);

      content.add(totalCostText);
      content.add(totalCost);
      
      calculate = new JButton("Calculate");
      content.add(calculate);
      calculate.addActionListener(this);
      calculate.setBackground(Color.BLUE);
      calculate.setOpaque(true);


    
      this.setVisible(true);
      this.setSize(350,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("First GUI App");
   }


 public void actionPerformed(ActionEvent event) {

  input1 = borrowedAmount.getText();
  input2 = interestRate.getText();
  input3 = numYears.getText();
   

  Double amountDbl1 = Double.parseDouble(input1);
  Double amountDbl2 = Double.parseDouble(input2);
  Double amountDbl3 = Double.parseDouble(input3);

  this.findPrice(amountDbl1,amountDbl2,amountDbl3);

  }

  public void findPrice(Double amt, Double intRate,Double term) {

    Double payment;

    Double power = term *12;

    Double intRateReCalculated = (intRate/100);
    intRateReCalculated /= 12;

    payment = (amt * intRateReCalculated)/(1 - (Math.pow(1/(1+intRateReCalculated), term * 12)));

    Double total = (payment*(term*12));

    monthlyPayment.setText(String.format("$%.2f", payment));

    totalCost.setText(String.format("$%.2f", total));

  }


     public static void main(String[] args)
     {


        HowMuch gui = new HowMuch();


     }


}

