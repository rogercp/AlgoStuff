
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuesserApp extends JFrame implements ActionListener,KeyListener
{


    // top
    JTextField theGuess = new JTextField(10);
    JLabel bankRoll = new JLabel("100.00 Zipoids");

    // bottom
    JButton newPlayer = new JButton("New Player");
    JButton newNumber = new JButton("New Number");
    JTextField thePlayer = new JTextField(20);

    // center
    JTextArea theOutput = new JTextArea();


    // non-visible attributes
    String playerName = "";
    int theNumber = 20;
    int numTries = 0;
    int numGames = 0;
    double amtRemaining = 100.00;
    Random randomizer = new Random();

    Container content = this.getContentPane();



    public GuesserApp()
    {
        this.setVisible(true);
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Guess O'Matic");

        // top Panel
        JPanel p1 = new JPanel();
        JLabel guessText = new JLabel("Make your guess :");
        p1.add(guessText);
        p1.add(theGuess);
        p1.add(bankRoll);
        content.add(p1,BorderLayout.NORTH);

        // bottom panel
        JPanel p2 = new JPanel();
        p2.add(newPlayer);
        p2.add(thePlayer);
        p2.add(newNumber);
        content.add(p2,BorderLayout.SOUTH);

        // extra spacing
        JLabel dummy1 = new JLabel("  ");
        JLabel dummy2 = new JLabel("  ");
        content.add(dummy1,BorderLayout.EAST);
        content.add(dummy2,BorderLayout.WEST);

        // scroll area
        JScrollPane scrollArea = new JScrollPane(theOutput);
        content.add(scrollArea,BorderLayout.CENTER);

        // button listeners
        newPlayer.addActionListener(this);
        newNumber.addActionListener(this);

        // key listeners
        thePlayer.addKeyListener(this);
        theGuess.addKeyListener(this);


        this.newPlayer();


    }


    public void newPlayer()
    {

        theOutput.setText("");
        theOutput.setEnabled(false);
        theGuess.setEnabled(false);
        newPlayer.setEnabled(false);
        newNumber.setEnabled(false);

        theGuess.setBackground(Color.WHITE);


        thePlayer.setEnabled(true);
        thePlayer.setText("");
        thePlayer.requestFocus();
        thePlayer.setBackground(Color.YELLOW);


        theOutput.append("Enter your name and press Enter to begin\n");


    }

    public void addPlayer()
    {

         playerName = thePlayer.getText();

        if(playerName.equals(""))
        {
            theOutput.append("You need to enter a name to play.\n");
        }else
        {
            amtRemaining = 100;
            numGames = 0;

            thePlayer.setEnabled(false);
            thePlayer.setBackground(Color.WHITE);

            newPlayer.setEnabled(true);
            newNumber.setEnabled(true);
            theGuess.setEnabled(true);

            theGuess.requestFocus();
            theGuess.setBackground(Color.YELLOW);

            this.newGame();

        }

    }

    private void newGame()
    {

        numGames++;

        theNumber = randomizer.nextInt(100) + 1;

        numTries = 0;

        this.displayInstructions();

        amtRemaining -= 1;

        this.updateScore();



    }

    public void displayInstructions()
    {

        theOutput.append("I'm Thinking of a number between 1 and 100\n");
        theOutput.append("if you guess the number in fewer than 9 tries, you'll earn\n");
        theOutput.append("1 try     2.00 Zipoids\n");
        theOutput.append("2 tries   1.75 Zipoids\n");
        theOutput.append("3 tries   1.50 Zipoids\n");
        theOutput.append("4 tries   1.25 Zipoids\n");
        theOutput.append("5 tries   1.00 Zipoids\n");
        theOutput.append("6 tries   0.75 Zipoids\n");
        theOutput.append("7 tries   0.50 Zipoids\n");
        theOutput.append("8 tries   0.25 Zipoids\n");
        theOutput.append("\n");

    }

    public void updateScore()
    {


        thePlayer.setText("");
        thePlayer.setText("name: "+playerName+ "  |  game number: "+numGames+" ");

        bankRoll.setText(amtRemaining+" Zipoids");
    }

    public void newGuess()
    {


        String curStr = theGuess.getText();

        int curGuess = Integer.parseInt(curStr);

        numTries++;

        theOutput.append("Number Of Guesses: "+ numTries+"\n"+"Current Guess: "+ curGuess+"\n");

        if(curGuess == theNumber)
        {
            this.gameWon();

        }else
        {

            if( curGuess > theNumber)
            {

                theOutput.append("Guess Lower\n");

            }else
            {
                theOutput.append("Guess Higher\n");

            }

            theGuess.requestFocus();
            theGuess.setBackground(Color.YELLOW);

  
            theGuess.selectAll();

        }


    }

    public void gameWon()
    {

        theOutput.append("******* WINNER ********\n");
        theOutput.append("Amount Wagered: 1 Zipoid \nNumber of Tries: "+numTries+"\n");

        double curWinnings;

        switch(numTries)
        {

            case 1:

                curWinnings = 2;
                break;

            case 2:

                curWinnings = 1.75 ;
                break;

            case 3:

                curWinnings = 1.50;
                break;

            case 4:

                curWinnings = 1.25;
                break;

            case 5:

                curWinnings = 1.00;
                break;
            case 6:

                curWinnings = .75;
                break;

            case 7:

                curWinnings = .50;
                break;
            case 8:

                curWinnings = .25;
                break;

            default:

                curWinnings = 0;



        }

        theOutput.append("Amount Won: "+curWinnings+"\n");
        amtRemaining += curWinnings;

        theOutput.append(playerName +" you have "+ amtRemaining +" Zipoids remaining\n");
        theOutput.append("Press the New Number button to continue\n");

        this.updateScore();

        theGuess.setText("");
        theGuess.setBackground(Color.WHITE);
        theGuess.setEnabled(false);

        newNumber.requestFocus();

    }





    public void actionPerformed(ActionEvent event)
    {

        JButton btn = (JButton) event.getSource();


        if(btn == newPlayer)
        {

            this.newPlayer();

        }
        else{

            this.newGame();
            theGuess.requestFocus();
            theGuess.setEnabled(true);
            theGuess.setBackground(Color.YELLOW);


        }

    }


    public void keyReleased(KeyEvent ke)
    {

        JTextField tf = (JTextField) ke.getSource();

        int key = ke.getKeyCode();

        if(key == KeyEvent.VK_ENTER)
        {
            if(tf == thePlayer)
            {
                this.addPlayer();

            }else
            {
                this.newGuess();

            }

        }


    }


    public void keyTyped(KeyEvent ke){}
    public void keyPressed(KeyEvent ke){}


    public static void main(String[] args) {


        GuesserApp gui = new GuesserApp();



    }
}
