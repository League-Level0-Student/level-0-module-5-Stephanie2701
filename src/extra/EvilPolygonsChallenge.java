package extra;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	static Robot o=new Robot();
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		
		
	
		//2. Set the speed to 100
		
		o.setSpeed(100);

		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice== 0) {
			
		o.setPenColor(Color.BLUE);	
		}
		else if(colorChoice==1) {
			o.setPenColor(Color.GRAY);
		}
		else if (colorChoice==2) {
			o.setPenColor(Color.BLACK);
		}
		//4. Ask the use how many polygons they want to be drawn.
		
	String A=	JOptionPane.showInputDialog("how many polygons do you want drawn ?");
		//5. Use the robot to draw the number of polygons the user requested.
		
	int num =Integer.parseInt(A);
		
		for (int i = 1; i <=num; i++) {
			polygon();
			
		}
		//6. Make it so your shapes do not overlap
			
		//7. Challenge: add more colors to the Option Dialog.
	}
	private static void  polygon() {
		for (int i = 0; i<3; i++) {
			
		o.penDown();
		o.move(100);
		o.turn(360/3);
		
		}
		o.penUp();
		o.move(100); 
		
		}
	
}


