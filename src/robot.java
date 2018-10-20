import org.jointheleague.graphical.robot.Robot;

public class robot {
	public static void main(String[] args) {
		
		Robot p =new Robot();
		
		p.penDown();
		for (int i = 0; i < 360; i++) {
			p.move(5);
			p.turn(360/360);
		}
	}

}
