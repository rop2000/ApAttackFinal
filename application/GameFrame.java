package application;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
 
public class GameFrame extends JFrame {
 
	private JPanel contentPane;

	/** 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public GameFrame() {
	initUI();
	}
 
	private void initUI()
	{
	        getContentPane().setLayout(null);
	        	        	        
	        JLayeredPane layeredPane = new JLayeredPane();
	        layeredPane.setBackground(Color.BLACK);
	        layeredPane.setBounds(0, 0, 1500, 1100);
	        getContentPane().add(layeredPane);
	        
	        
	        
	        JPanel panel = new JPanel();
	        panel.setBounds(0, 0, 1500, 1100);
	        getContentPane().add(panel);
	        panel.setBackground(new Color(46, 139, 87));
	        panel.setLayout(null);
	        

	        
	   
	        
	        JLabel lblNewLabel_2 = new JLabel("Credits");
	        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 60));
	        lblNewLabel_2.setBounds(578, 37, 336, 49);
	        panel.add(lblNewLabel_2);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(70, 130, 180));
	        panel_1.setBounds(0, 0, 1500, 1100);
	        getContentPane().add(panel_1);
	        panel_1.setLayout(null);
	        	        	        	        
	        
	        JTextArea txtrMrbarronAp = new JTextArea();
	        txtrMrbarronAp.setEditable(false);
	        txtrMrbarronAp.setFont(new Font("Tahoma", Font.BOLD, 30));
	        txtrMrbarronAp.setBackground(new Color(46, 139, 87));
	        txtrMrbarronAp.setText("Mr.Barron - AP Comp Sci Teacher - Thanks for an AWESOME year of Computer Science!!!!!!\r\n\r\nStackOverflow - Information about game looping, collisions and image displaying. \r\n\r\nBrainyCode - Examples of custom KeyListening.");
	        txtrMrbarronAp.setRows(10);
	        txtrMrbarronAp.setBounds(12, 148, 1458, 428);
	        panel.add(txtrMrbarronAp);
	        
	        JButton btnNewButton_4 = new JButton("Back");
	        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 55));
	        btnNewButton_4.setBackground(new Color(32, 178, 170));
	        btnNewButton_4.setForeground(new Color(0, 0, 128));
	        btnNewButton_4.setBounds(12, 969, 371, 56);
	        panel.add(btnNewButton_4);
	        btnNewButton_4.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	layeredPane.setVisible(true);
	        	panel_1.setVisible(false);

	        	}
	        	});
	   
	        
	        JPanel panel_2 = new JPanel();
	        panel_2.setBounds(0, 0, 10, 10);
	        getContentPane().add(panel_2);
	        
	           Game game = new Game();
	           game.setBounds(-12, 13, 1500, 1100);
	           game.setLayout(null);
	       
	        
	        
	        JButton btnNewButton_3 = new JButton("Back");
	        btnNewButton_3.setForeground(new Color(0, 0, 128));
	        btnNewButton_3.setBackground(new Color(165, 42, 42));
	        btnNewButton_3.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 60));
	        btnNewButton_3.setBounds(12, 953, 351, 65);
	        panel_1.add(btnNewButton_3);
	        btnNewButton_3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	layeredPane.setVisible(true);
	        	panel_1.setVisible(false);

	        	}
	        	});
	        
	        
	        
	        JTextArea txtrWelcomeToAp = new JTextArea();
	        txtrWelcomeToAp.setEditable(false);
	        txtrWelcomeToAp.setForeground(new Color(0, 0, 128));
	        txtrWelcomeToAp.setFont(new Font("Tahoma", Font.BOLD, 40));
	        txtrWelcomeToAp.setText("Welcome to AP Attack! You are an AP student who is trapped in the worst \r\nnightmare imaginable, where AP Exams are raining from the sky! \r\nAvoid the exams and run up to textbooks to score points! \r\nThe longer you stay alive, the more points you will be able to score. \r\n                                             Good luck!\r\n\r\nControls & Info:  \r\nLeft Arrow Key - Move Left\r\nRight Arrow Key - Move Right\r\n\r\nPoint System:\r\n   20 Points per textbook. \r\n  -20 Points & -20% Health per Textbook");
	        txtrWelcomeToAp.setRows(10);
	        txtrWelcomeToAp.setBackground(new Color(70, 130, 180));
	        txtrWelcomeToAp.setBounds(12, 49, 1465, 824);
	        panel_1.add(txtrWelcomeToAp);
	      
	        
	       
	        	        	        	    

	        	        	        	         
	        	        	        	         JLabel lblNewLabel = new JLabel("");
	        	        	        	         lblNewLabel.setIcon(new ImageIcon(GameFrame.class.getResource("/application/testing.jpg")));
	        	        	        	         lblNewLabel.setBounds(0, 0, 1482, 1037);
	        	        	        	         layeredPane.add(lblNewLabel);
	        	        	        	         
	        	        	        	         JLabel lblNewLabel_1 = new JLabel("AP Attack");
	        	        	        	         layeredPane.setLayer(lblNewLabel_1, 1);
	        	        	        	         lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	        	        	        	         lblNewLabel_1.setForeground(new Color(255, 0, 0));
	        	        	        	         lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD, 99));
	        	        	        	         lblNewLabel_1.setBounds(415, 30, 668, 95);
	        	        	        	         layeredPane.add(lblNewLabel_1);
	        	        	        	         
	        
	        JButton btnNewButton_1 = new JButton("Instructions");
	        btnNewButton_1.setBackground(new Color(30, 144, 255));
	        btnNewButton_1.setForeground(new Color(0, 0, 128));
	        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 60));
	        layeredPane.setLayer(btnNewButton_1, 2);
	        btnNewButton_1.setBounds(455, 349, 587, 81);
	        layeredPane.add(btnNewButton_1);
	        btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		layeredPane.setVisible(false);
		panel_1.setVisible(true);
	}
});
	        
	        
	        JButton btnNewButton_2 = new JButton("Credits");
	        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 60));
	        btnNewButton_2.setForeground(new Color(25, 25, 112));
	        btnNewButton_2.setBackground(new Color(240, 128, 128));
	        layeredPane.setLayer(btnNewButton_2, 2);
	        btnNewButton_2.setBounds(455, 497, 587, 81);
	        layeredPane.add(btnNewButton_2);
	        btnNewButton_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		layeredPane.setVisible(false);
	        		panel_2.setVisible(true);
	        	}
	        });
	        
	        
	        JButton btnNewButton = new JButton("Play");
	        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 60));
	        btnNewButton.setForeground(new Color(0, 0, 128));
	        btnNewButton.setBackground(new Color(0, 128, 0));
	        layeredPane.setLayer(btnNewButton, 2);
	        btnNewButton.setBounds(455, 193, 587, 81);
	        layeredPane.add(btnNewButton);
	        btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			layeredPane.setVisible(false);
			getContentPane().add(game);
			game.setVisible(true);
	                game.setFocusable(true);
	                game.requestFocus();
	            
		}
	});
	        	        	        
	        	        	        
	        	        	       
	        	        
	        	    
	        
		           
	           
	           
	        
	       
	       
	        setSize(1500,1100);
	        setResizable(true);
	        setTitle("AP-Attack");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	  
	
	}
}
