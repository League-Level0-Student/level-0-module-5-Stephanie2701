import javax.swing.JOptionPane;

public class primeornot {

	public static void main(String[] args) {

		String p = JOptionPane.showInputDialog("Choose a number");
int j;
		int num = Integer.parseInt(p);
		for (int i = 1; i < 100; i++) {

		if (num / num == 0 || num / i == 0) {
			System.out.println("it's a prime");

		}
		

		else if (num / i ==j ) {
				System.out.println("composite number");
			}

		}

	}

}
