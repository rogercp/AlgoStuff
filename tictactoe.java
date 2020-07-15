// Name:Rogelio Caballero 
// SID#:0480110
// Date: 14 July 2020
// Description: program that uses Jframe,ActionListener and MouseListener to make tictactoe game

import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TicTacToe extends JFrame implements MouseListener,ActionListener
{

  Container content = this.getContentPane();

  JLabel[][] grid = new JLabel[3][3];

  char[][] game = new char[3][3];

  JButton restart;

  JPanel p = new JPanel();

  JLabel status = new JLabel("Welcome to TIC TAC TOE");

  int numClicks;

  boolean isDone = false;

  boolean isXTurn = true;

  
   public TicTacToe()
   {
    
      this.setVisible(true);
      this.setSize(300,400);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Using JPanels App");

      content.add(status,BorderLayout.NORTH);
      status.setHorizontalAlignment(JLabel.CENTER);
      status.setOpaque(true);
      status.setBackground(Color.YELLOW);
      status.setForeground(Color.BLUE);
      status.setFont(new Font("Helvetica",Font.BOLD,12));

      p.setLayout(new GridLayout(3,3,3,3));
      p.setBackground(Color.BLACK);
      content.add(p,BorderLayout.CENTER);


        for (int row= 0 ; row < 3;row++)
       {

        for(int col = 0; col< 3;col++)
        {

            JLabel block = new JLabel(" ");

            block.setHorizontalAlignment(JLabel.CENTER);

            grid[row][col] = block;

            block.addMouseListener(this);

            block.setOpaque(true);

            block.setBackground(Color.WHITE);

            block.setFont(new Font("Helvetica",Font.BOLD,32));

            p.add(block);

            game[row][col] = ' ';
            
        }

       }

       restart = new JButton("Restart");

       restart.addActionListener(this);

       content.add(restart,BorderLayout.SOUTH);




   }

   public void gameOver()
   {

    char winner = ' ';


    if(isDone == false)
    {
      for (int row= 0 ; row < 3;row++)
       {

        for(int col = 0; col< 3;col++)
        {

          if(game[0][0] == game[1][1] && game[0][0] == game[2][2] && game[1][1] == game[2][2] )
          {
            winner = game[0][0];

            isDone = true;

          }
          if(game[2][0] == game[1][1] && game[2][0] == game[0][2] && game[1][1] == game[0][2] )
          {

            winner = game[2][0];

            isDone = true;

          }

        }

      }
    
    for (int row = 0; row<3;row++)
        {

          if(game[row][0] != ' ' && game[row][0] == game[row][1] && game[row][1] == game[row][2] && game[row][2] == game[row][0])
          {
            winner = game[row][0];
            isDone = true;
          }

           if(game[0][row] != ' ' && game[0][row] == game[1][row] && game[0][row] == game[2][row] && game[2][row] == game[0][row])
          {
            winner = game[0][row];
            isDone = true;
          }


        }

  }
      
     
    
    if( numClicks > 8 && winner == ' ' )
        {
          status.setText("Tie Game");

        }

    if(isDone == true && winner != ' '  )
        {
          status.setText("Game Over:" + winner + " Won!!!");

        }


   if(winner == ' ' && numClicks < 9)
   {
      if( isXTurn == true  )
      {
        status.setText("X's Turn");
        isDone = false;

      }
      if (isXTurn == false  )
      {
        
        status.setText("O's Turn");
        isDone = false;
      }
    
    }



    
   }


   public void resetGame()
   {

    for (int row= 0 ; row < 3;row++)
       {

        for(int col = 0; col< 3;col++)
        {


         grid[row][col].setText(" ");

         game[row][col]= (' ');


        }
      }

      numClicks = 0;

      isXTurn = true;


   }

    public void actionPerformed(ActionEvent event)
     {

        isDone = true;

        status.setText("Welcome to TIC TAC TOE");

        this.resetGame();



     }

   public void mouseClicked(MouseEvent e)
    {
      if (this.isDone) 
          this.resetGame();
      
      JLabel clicked = (JLabel) e.getSource();
      
      next:
          for (int row = 0; row < 3; row++)
          {
            for (int col = 0; col < 3; col++)
            {
              if (clicked == grid[row][col])
              {              
                if(clicked.getText()  != " ")
                {
                    status.setText("Invalid Move");
                    break next;
                }             
                else if(clicked.getText()  == " "  && isXTurn == true)
                {
                  clicked.setText("X");
                  clicked.setForeground(Color.RED);
                  this.game[row][col] = 'X';

                }             
                else
                {
                  clicked.setText("O");
                  clicked.setForeground(Color.BLUE);
                  this.game[row][col] = 'O';
                }
                // d. Toggle isXTurn, incrment numClicks
                this.isXTurn = !this.isXTurn;
                this.numClicks++;
                // Check to see if game is over after each click
                this.gameOver();
              }
            }
          }
    }

    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {}  


     public static void main(String[] args)
     {


        TicTacToe gui = new TicTacToe();


     }


}

