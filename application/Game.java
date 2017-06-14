package application; 
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Random;
 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;
 
public class Game extends JPanel implements ActionListener{
	private BufferedImage bg1, bg2; 
	private BufferedImage playerImage;
	private BufferedImage textbookImage;
	private BufferedImage enemyImage;
	private BufferedImage background;
	private JPanel panel;
	private Timer timer; 
	private Player player;
	private Image p2;
	private int randNumb; 
	private int randNumb2;
	private boolean numberCreated2; 
	private int textbookHeight;
	private int textbookWidth; 
	private int textbookYLocation;
	private int textbookYLocation2;
	private Textbook textbook;
	private Textbook textbook2; 
	private int examYLocation;
	private int examYLocation2;
	private int examWidth;
	private int examHeight;
	private boolean numberCreated3;
	private boolean numberCreated4;
	private boolean numberCreated5;
	private int randNumb5;
	private int examYLocation3;
	private int randNumb3;
	private int randNumb4;
	private Exam exam; 
	private Exam exam2;
	private Exam exam3;
	private final int DELAY = 10;
	private boolean numberCreated;
	private HealthBar healthbar;
	private int health;
	private int dx;
	private int dy;
	private int x;
	private int y;
	private int score;
	private Rectangle rect;
	private Rectangle rect1;
	private Rectangle rect2;
	private Rectangle rect3;
	private Rectangle rect4;
	private Rectangle rect5;
	public Game() {
//		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	//	this.setTitle("AP Attack - Endless Runner");
	//	this.setResizable(true);
	//	this.getContentPane().setPreferredSize(new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT));
	//	this.pack();
	//	this.setLocationRelativeTo(null);
	//	this.setFocusable(true);
      //  this.setVisible(true);
	//	this.bg1 = null;
	//	this.bg2 = null;
	//	this.playerImage = null;
	//	this.textbookImage = null;
	//	this.enemyImage = null;
				initGame(); 
		try {
		   this.bg1 = ImageIO.read(new File("images/Background.png"));
		    this.bg2 = ImageIO.read(new File("images/Background.png"));
		   this.playerImage = ImageIO.read(new File("images/Chicken.png"));
		  this.textbookImage = ImageIO.read(new File("images/Apple.png"));
		    this.enemyImage = ImageIO.read(new File("images/Enemy.png")); 
		} catch (IOException e) {
 
		}
 
		
	}
 
private void initGame() {
	addKeyListener(new KeyAdapter(){
        public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT) dx -= 9;
        if(key == KeyEvent.VK_RIGHT) dx += 9;
     //   if(key == KeyEvent.VK_UP) dy -= 10;
     //   if(key == KeyEvent.VK_DOWN) dy += 10;
        repaint();
     }
    });

        
        setFocusable(true);
        requestFocus();
        requestFocusInWindow(); 
        try {
        	background = ImageIO.read(getClass().getResource("Background.png"));
   		} catch (IOException e) {
 
   		}
        
      
        textbook = new Textbook();		
        textbook2 = new Textbook();
        exam = new Exam();
        exam2 = new Exam();
        exam3 = new Exam();
        player = new Player();	
        timer = new Timer(DELAY, this);
        timer.start();        
        
        health = 100;
        randNumb = 0;
        textbookWidth = textbook.getImage().getWidth(null);
        textbookHeight = textbook.getImage().getHeight(null);
        textbookYLocation = -textbookHeight;
        textbookYLocation2 = -textbookHeight;
        examWidth = exam.getImage().getWidth(null);
        examHeight = exam.getImage().getHeight(null);
        examYLocation = -examHeight;
        examYLocation2 = -examHeight;     
        x = 100;
        y = 755;
    }
	
@Override
public void actionPerformed(ActionEvent e) {
	rect = new Rectangle(randNumb,textbookYLocation,125,175);
	rect1 = new Rectangle(randNumb2,textbookYLocation2,125,175);
	rect2 = new Rectangle(dx + x,dy + y,75,150);
	rect3 = new Rectangle(randNumb3,examYLocation,100,100);
	rect4 = new Rectangle(randNumb4,examYLocation2,100,100);
	rect5 = new Rectangle(randNumb5,examYLocation3,100,100);
	onTextbookCollision();
	onTextbookCollision2();
	onExamCollision();
	onExamCollision2();
	onExamCollision3();
	player.move();
    repaint();  
    if (!numberCreated) {
        generateRandomNumberTextbook();
    }
    if(!numberCreated2)
    {
    	generateRandomNumberTextbook2();
    }
   if(!numberCreated3)
   {
   	generateRandomNumberExam(); 
    	
    }
    if(!numberCreated4)
    {
    	generateRandomNumberExam2();
    }
    if(!numberCreated5)
    {
    	generateRandomNumberExam3();
    }
    //moves the textbook y coordinate towards the bottom of the screen and stops once it hits the bottom
    if (textbookYLocation <= 1100) {
        textbookYLocation++;
 
        //resets the x and y location to a new position
    } else {
        numberCreated = false;
        textbookYLocation = -textbookHeight;
    }
    
    if (textbookYLocation2 <= 1100) {
        textbookYLocation2++;
 
        //resets the x and y location to a new position
    } else {
        numberCreated2 = false;
        textbookYLocation2 = -textbookHeight;
    }
    
    if(examYLocation <= 1500)
    {
    	
   	examYLocation = examYLocation + 3;
    	
     }
    else {
     	numberCreated3 = false;
    	examYLocation = -examWidth;
    	
  }
    
    if(examYLocation2 <= 1500)
    {
    	
   	examYLocation2 = examYLocation2 + 3;
    	
     }
    else {
     	numberCreated4 = false;
    	examYLocation2 = -examWidth;
    	
  }
    
    if(examYLocation3 <= 1500)
    {
    	
   	examYLocation3 = examYLocation3 + 3;
    	
     }
    else {
     	numberCreated5 = false;
    	examYLocation3 = -examWidth;
    	
  }
}
 

	
@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(background,0,0,this);
    doDrawing(g);
    Toolkit.getDefaultToolkit().sync();
}
 
private void doDrawing(Graphics g) {
    

    Graphics2D g2d = (Graphics2D) g;
    g2d.drawImage(player.getImage(), dx + x, dy + y, this);       
    g2d.drawImage(textbook.getImage(),randNumb, textbookYLocation, this);
    g2d.drawImage(textbook2.getImage(),randNumb2, textbookYLocation2, this);
    g2d.drawImage(exam.getImage(), randNumb3, examYLocation, this);
    g2d.drawImage(exam2.getImage(), randNumb4, examYLocation2, this);
    g2d.drawImage(exam3.getImage(), randNumb5, examYLocation3, this);
    
    g2d.setColor(Color.RED);   
    g2d.fillRect(170, 20, 100, 20);
    g2d.setColor(Color.GREEN);   
    g2d.fillRect(170, 20,health, 20);
    g2d.setFont(new Font("Monospaced", Font.BOLD, Constants.HEALTHBAR_FONT_SIZE));
    g2d.setColor(Color.RED);
    g2d.drawString("Health:" + health + "%", 30, 40);
    
    g2d.setFont(new Font("Monospaced", Font.BOLD, Constants.HEALTHBAR_FONT_SIZE));
    g2d.setColor(Color.RED);
    g2d.drawString("Score:" + score, 300, 40); 
  
}
 



private void onTextbookCollision()
{
	boolean b = textbook.checkCollision(rect,rect2);
  if(b == true)	
  {
	generateRandomNumberTextbook();
	
	textbookYLocation = 0;
	score = score + 20;
  }
	
}

private void onTextbookCollision2()
{
	
	boolean c = textbook2.checkCollision(rect1,rect2);
	  if(c == true)
	  {
		  generateRandomNumberTextbook2();
		 
		  textbookYLocation2 = 0;
		  score = score + 20;
	  }
}

private void onExamCollision()
{
	boolean d = exam.checkCollision(rect3,rect2);
	  if(d == true)
	  {
		  generateRandomNumberExam();
		
		  examYLocation = 0;
		  score = score - 20;
		  if(health > 20)
		  {
		  health = health - 20;
		  }
		  else if(health <= 20)
		  {
			  score = 0; 
			  health = 100;
		  }
	  }
}	  
	  private void onExamCollision2()
	  {
	  	boolean e = exam2.checkCollision(rect4,rect2);
	  	  if(e == true)
	  	  {
	  		  generateRandomNumberExam2();
	  		
	  		  examYLocation2 = 0;
	  		  score = score - 20;
	  		  if(health > 20)
	  		  {
	  		  health = health - 20;
	  		  }
	  		  else if(health <= 20)
	  		  {
	  			  score = 0; 
	  			  health = 100;
	  		  }
	  	  }
	  	  
}

	  
	  private void onExamCollision3()
	  {
	  	boolean e = exam3.checkCollision(rect5,rect2);
	  	  if(e == true)
	  	  {
	  		  generateRandomNumberExam2();
	  		
	  		  examYLocation2 = 0;
	  		  score = score - 20;
	  		  if(health > 20)
	  		  {
	  		  health = health - 20;
	  		  }
	  		  else if(health <= 20)
	  		  {
	  			  score = 0; 
	  			  health = 100;
	  		  }
	  	  }
	  	  
}
	  


private void drawHealthBar(Graphics g) {
	//Draw Red health bar
	g.setColor(Constants.RED_COLOR);
	g.fillRect(Constants.HEALTHBAR_X, Constants.HEALTHBAR_Y, Constants.HEALTHBAR_WIDTH, Constants.HEALTHBAR_HEIGHT);
	
	//Draw Green health bar over top
	g.setColor(Constants.GREEN_COLOR);
	g.fillRect(this.getHealthBar().getX(), Constants.HEALTHBAR_Y, (int) (this.getHealthBar().getHealthPercentage() * Constants.HEALTHBAR_WIDTH), Constants.HEALTHBAR_HEIGHT);
	g.setFont(new Font("Monospaced", Font.BOLD, Constants.HEALTHBAR_FONT_SIZE));
	
	int healthPercentage = (int)(this.getHealthBar().getHealthPercentage() * 100);
	if (healthPercentage < 50) {
		g.setColor(Constants.RED_COLOR);
	}
	
	String str = healthPercentage + "%";
	int strLength = g.getFontMetrics().stringWidth(str);
	g.drawString(str, Constants.HEALTHBAR_PERCENT_X - strLength, Constants.HEALTHBAR_PERCENT_Y);
}


public HealthBar getHealthBar()
{
	return healthbar;
	
}








 
public void generateRandomNumberTextbook() {
    Random rand = new Random();
    randNumb = rand.nextInt(1500 - textbookWidth);
    numberCreated = true;
}
 
public void generateRandomNumberExam() {
    Random rand = new Random();
    randNumb3 = rand.nextInt(1500 - examWidth);
    numberCreated3 = true;
}

public void generateRandomNumberTextbook2()
{
	Random rand = new Random();
	randNumb2 = rand.nextInt(1500 - textbookWidth);
	numberCreated2 = true; 
}

public void generateRandomNumberExam2() {
    Random rand = new Random();
    randNumb4 = rand.nextInt(1500 - examWidth);
    numberCreated4 = true;
}

public void generateRandomNumberExam3() {
    Random rand = new Random();
    randNumb5 = rand.nextInt(1500 - examWidth);
    numberCreated5 = true;
}


	public Image getBg1() {
		return this.bg1;
	}
	
	public Image getBg2() {
		return this.bg2;
	}
	
	public Image getPlayerImage() {
		return this.playerImage;
	}
	
	public Image getTextbookImage() {
		return this.textbookImage;
	}
	
 
	public Image getEnemyImage() {
		return this.enemyImage;
	}
	
	
	public void addPanel(JPanel p) {
		this.add(p);
	}
	
	public static void main(String args[]) {
	 
		
		
	}
}
