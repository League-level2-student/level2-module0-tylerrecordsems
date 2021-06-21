/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] button = new JButton[5];
	//2 create an int variable called hiddenButton
	int hiddenButton = 0;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//3.  Ask the user to enter a positive number and convert it to an int
		String num = JOptionPane.showInputDialog("Enter a positive number!");
		int num2 = Integer.parseInt(num);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
	
	 button = new JButton[num2];
		//5. Make a for loop to iterate through the JButton array
	for (int i = 0; i < button.length; i++) {
		
			//6. initialize each JButton in the array
button[i]=new JButton();
			//7. add the ActionListener to each JButton
button[i].addActionListener(this);
			//8. add each JButton to the panel
		panel.add(button[i]);
		button[i].setText("YOU");
	}
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Find the Button!");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		
		Random ran = new Random();
		hiddenButton=ran.nextInt(3);
		
		//14. Set the text of the JButton located at hiddenButton to  "ME"
button[hiddenButton].setText("ME");

		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
try {
	Thread.sleep(400);
} catch (Exception e) {
	// TODO: handle exception
}


		//16. Set the text of the JButton located at hiddenButton to be blank.
		button[hiddenButton].setText("YOU");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(button[hiddenButton] == e.getSource()) {
			JOptionPane.showMessageDialog(null, "You Win!");
		}else {
			JOptionPane.showMessageDialog(null, "Try Again!");
		}
		window.pack();
		//18. else tell them to try again
	}
}
