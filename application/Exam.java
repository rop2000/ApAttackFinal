package application;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


public class Exam {

	private int health;
	private boolean jumpedOn;
	private Image exam;
	
	public Exam() {
		initExam();
		
	}

	private void initExam() {
        
        ImageIcon i = new ImageIcon(getClass().getResource("APMonster.png"));
        exam = i.getImage();
             
    }
	
	
	public Image getImage()
	{
		
		return exam;
		
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
	
	

	
}




