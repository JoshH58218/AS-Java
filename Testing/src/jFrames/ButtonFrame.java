package jFrames;
import java.awt.*;
import javax.swing.*;

public class ButtonFrame extends JFrame {
	JButton bChange;
	
	ButtonFrame(String title){
		super( title );                     // invoke the JFrame constructor
	    setLayout( new FlowLayout() );      // set the layout manager

	    bChange = new JButton("Pointless button, warning pointless."); // construct a JButton
	    add( bChange );                     // add the button to the JFrame
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
	  }
	}


