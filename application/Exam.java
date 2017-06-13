package application;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class Exam extends Point {

	private int health;
	private boolean jumpedOn;
	private Image exam;
	
	public Exam() {
		this.setLocation(new Point(Constants.EXAM_START_X, Constants.EXAM_START_Y));
		this.health = Constants.EXAM_HEALTH_MAX;
		initExam();
	}

	private void initExam() {
        
        ImageIcon ii = new ImageIcon(getClass().getResource("APMonster.png"));
        exam = ii.getImage();
        
       
        
             
    }
	
	
	public Image getImage()
	{
		
		return exam;
		
	}
	
	
	public void moveLeft() {
		this.setLocation(this.getX() - Constants.EXAM_X_VELOCITY, this.getY());
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isJumpedOn() {
		return jumpedOn;
	}

	public void setJumpedOn(boolean jumpedOn) {
		this.jumpedOn = jumpedOn;
	}
	
	
}




