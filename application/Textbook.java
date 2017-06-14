package application;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
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
		
		
public boolean checkHit(int x, int y, Rectangle rect) {
	
	return (x >= rect.x && x <= rect.x+rect.width) &&
	        (y >= rect.y && y <= rect.y+rect.height);
}

public boolean checkCollision(Rectangle rect1, Rectangle rect2)
{
	return checkHit(rect1.x, rect1.y, rect2) ||
	        checkHit(rect1.x+rect1.width, rect1.y, rect2) ||
	        checkHit(rect1.x, rect1.y+rect1.height, rect2) ||
	        checkHit(rect1.x+rect1.width,
	                 rect1.y+rect1.height, rect2);	
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
