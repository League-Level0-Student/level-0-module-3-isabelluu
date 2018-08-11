package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
		}
		if (answer.equals("no")) {
			String yes = JOptionPane.showInputDialog("Do you want to be happy?");
			if (yes.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Then do something about it!");
			}
			if (yes.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
			}

		}
	}
}
