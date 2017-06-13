package application;

import java.awt.Color;
import java.awt.Point;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

public class Player extends Point{

String name; 
private boolean moveRight;
private boolean moveLeft;
private boolean moveUp;
private int velY;
private int velX;	
private Image player;
private ImageIcon ii;

	public Player()	
	{
	this.setLocation(new Point(0, Constants.PLAYER_START_Y));
	this.moveRight = false;
	this.moveLeft = false;
	this.moveUp = false;
    initPlayer();
	}

	  private void initPlayer() {
	        
	        ImageIcon ii = new ImageIcon(getClass().getResource("player.png"));
	        player = ii.getImage();
	             
	    }
	  
	 public Image getImage() {
	        return player;
	    }
	  
	public boolean isMoveRight() {
		return moveRight;
	}

	public void setMoveRight(boolean moveRight) {
		this.moveRight = moveRight;
	}

	public boolean isMoveLeft() {
		return moveLeft;
	}

	public void setMoveLeft(boolean moveLeft) {
		this.moveLeft = moveLeft;
	}

	public boolean isMoveUp() {
		return moveUp;
	}

	public void setMoveUp(boolean moveUp) {
		this.moveUp = moveUp;
	}

	public void moveLeft() {
		this.setLocation(this.getX() - velX, this.getY());
	}
	
	public void moveRight() {
		this.setLocation(this.getX() + velX, this.getY());;
	}
	
	public void moveUp() {
		if (this.velY >= -Constants.PLAYER_Y_VELOCITY) {
			this.setLocation(this.getX(), this.getY() - velY);
			this.velY -= Constants.PLAYER_GRAVITY;
		} else {
			this.moveUp = false;
			this.velY = Constants.PLAYER_Y_VELOCITY;
		}
	}

	public int getVelY() {
		return velY;
	}
	
	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            velX = -50;
        	moveLeft();
        }

        if (key == KeyEvent.VK_RIGHT) {
            velX = 50; 
        	moveRight();
        }

        if (key == KeyEvent.VK_UP) {
            velY = 25;
        	moveUp();
        }

    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            velX = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            velX = 0;
        }

        if (key == KeyEvent.VK_UP) {
            velY = 0;
        }
        
    }
    
    public void move() {
        x += velX;
        y += velY;
    }
    
	public static void main(String[] args)
	{
	

	}

	
	
	
	
	
	
	
	
}
