package application; 
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
	private Textbook textbook;
	private Textbook textbook1; 
	private int examXLocation; 
	private int examWidth;
	private int examHeight;
	private boolean numberCreated3;
	private int randNumb3;
	private Exam exam; 
	private final int DELAY = 10;
	private boolean numberCreated;
	private HealthBar healthbar;
	private int health;
	private int dx;
	private int dy;
	private int x;
	private int y;
	
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
        if(key == KeyEvent.VK_LEFT) dx -= 5;
        if(key == KeyEvent.VK_RIGHT) dx += 5;
        if(key == KeyEvent.VK_UP) dy -= 5;
        if(key == KeyEvent.VK_DOWN) dy += 5;
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
        player = new Player();	
        timer = new Timer(DELAY, this);
        timer.start();        
        
        randNumb = 0;
        textbookWidth = textbook.getImage().getWidth(null);
        textbookHeight = textbook.getImage().getHeight(null);
        textbookYLocation = -textbookHeight;
      //  examWidth = exam.getImage().getWidth(null);
      //  examHeight = exam.getImage().getHeight(null);
      //  examXLocation = -textbookWidth;
        x = 100;
        y = 755;
    }
	
@Override
public void actionPerformed(ActionEvent e) {
    
    player.move();
    repaint();  
    if (!numberCreated) {
        generateRandomNumber();
    }
    if(!numberCreated2)
    {
    	generateRandomNumber2();
    }
  //  if(!numberCreated3)
  //  {
 //   	generateRandomNumber3(); 
    	
  //  }
    
   
    //moves the squares y coordinate towards the bottom of the screen and stops once it hits the bottom
    if (textbookYLocation <= 1100) {
        textbookYLocation++;
 
        //resets the x and y location to a new position
    } else {
        numberCreated = false;
        textbookYLocation = -textbookHeight;
    }
    
   // if(examXLocation <= 1500)
   // {
    	
  //  	examXLocation++;
    	
   // }
  //  else {
  //  	numberCreated3 = false;
  //  	examXLocation = -examWidth;
    	
// }
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
    g2d.drawImage(textbook.getImage(),randNumb2, textbookYLocation, this);
  //  g2d.drawImage(exam.getImage(), examXLocation, randNumb3, this);
    g2d.setColor(Color.GREEN);   
    g2d.fillRect(170, 20, 100, 20);
    g2d.setFont(new Font("Monospaced", Font.BOLD, Constants.HEALTHBAR_FONT_SIZE));
    g2d.setColor(Color.RED);
    g2d.drawString("Health:" + " 100" + "%", 30, 40);
    
    g2d.setFont(new Font("Monospaced", Font.BOLD, Constants.HEALTHBAR_FONT_SIZE));
    g2d.setColor(Color.RED);
    g2d.drawString("Score:" + health, 300, 40);
    
}
 
public void spawnTextbook()
{
	
	
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








 
public void generateRandomNumber() {
    Random rand = new Random();
    randNumb = rand.nextInt(1500 - textbookWidth);
    numberCreated = true;
}
 
public void generateRandomNumber2() {
    Random rand = new Random();
    randNumb2 = rand.nextInt(1500 - textbookWidth);
    numberCreated2 = true;
}
 
public void generateRandomNumber3() {
    Random rand = new Random();
    randNumb3 = rand.nextInt(1100 - textbookHeight);
    numberCreated3 = true;
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
