package game;
/*
 * Midterm Project 1 Part 1
 * Chris Hall, Binny Verma, Camille Zapatos, Yooju Choi
 * 
 */
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main extends JFrame {
	public static void main(String[] args){

JDialog.setDefaultLookAndFeelDecorated(true);
int loop=0;
while (loop!=1){
int response = JOptionPane.showConfirmDialog(null, "Would you want to play the Guessing Game?", "Confirm",

    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

if (response == JOptionPane.NO_OPTION||response == JOptionPane.CLOSED_OPTION) {
 // System.out.println("No button clicked or exit button hit");
System.exit(0);
} else if (response == JOptionPane.YES_OPTION) {

 // System.out.println("Yes button clicked");
	Guess g= new Guess();	
	g.game();
	g.random();

}
}
}
}