package jFrames;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class Test1 {
	public static void main(String[]args){
		JFrame myFrame = new JFrame("This is my frame");
		myFrame.setSize(1024,768);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}