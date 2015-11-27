package Graphics;

import javax.swing.JFrame;

public class Jframe_test {
	
	private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;
    @Override
    public void paint(Graphics g) {
    	Scanner scan=new Scanner(System.in);
        super.paint(g);
        for(double x = 0; x < WIDTH; x++) {
           for(double y = 0; y < HEIGHT; y++) {
        	   double rand=Math.random();
        	   if(rand>0.2){
        		   g.setColor(new Color(255,255,255));
        	   }
        	   else if(rand>0.2){
        		   
        	   }
        	   
        	   int a=(int) x;
               int b=(int) y;
        	   
        	   g.drawLine(a, b, a, b);
            }
        }
    }
	

	
	public static void main(String[]args){
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		//4. Size the frame.
		frame.pack();

		//5. Show it.
		frame.setVisible(true);
	}
	

}
