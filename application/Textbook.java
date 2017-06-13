package application;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Textbook {
	
	private boolean eaten;
	private float a;
	private Image textbook;
	private int randNumb; 
	private int textbookHeight;
	private int textbookWidth; 
	private int textbookYLocation;
	private boolean numberCreated; 
	public int randYLocation;
	
		public Textbook() {
			initTextbook();
		this.a = 1.0f;
		int startY = Constants.TEXTBOOK_START_Y;
		if (new Random().nextInt(3) + 1 == 3) {
			startY = Constants.TEXTBOOK_START_Y_2;
		}
	//	this.setLocation(new Point(Constants.TEXTBOOK_START_X, startY));
	}
		
private void initTextbook() {
	        
	        ImageIcon ii = new ImageIcon(getClass().getResource("textbook.jpg"));
	        textbook = ii.getImage();
	        
	        randNumb = 0;
	        textbookWidth = this.getImage().getWidth(null);
	        textbookHeight = this.getImage().getHeight(null);
	        textbookYLocation = -textbookHeight;
	        
	             
	    }
		
		
		
		
		
		public void moveLeft() {
	//		this.setLocation(this.getX() - Constants.TEXTBOOK_X_VELOCITY, this.getY());
		}

		public boolean isEaten() {
			return eaten;
		}
		public void setEaten(boolean eaten) {
			this.eaten = eaten;
		}

		public float getAlpha() {
			return a;
		}
		
		public void setAlpha(float alpha) {
			this.a = alpha;
		}
	
		public Image getImage()
		{
			return textbook;
			
		}
	
		public void setRandYLocation(int r)
		{
			randYLocation = r;
			
		}

}
