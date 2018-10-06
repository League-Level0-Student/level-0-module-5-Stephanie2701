import javax.swing.JOptionPane;

public class primeornot {

	public static void main(String[] args) {

		String p = JOptionPane.showInputDialog("Choose a number");
		int num = Integer.parseInt(p);
		for (int i = 2; i < num; i++) {

		if ( num % i == 0) {
			System.out.println("composite number");
			System.exit(0);
		}
		
		}
		
		
				System.out.println("it's a prime ");
			

		
		

	}

}
