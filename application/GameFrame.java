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
	        panel.setBounds(0, 0, 10, 10);
	        getContentPane().add(panel);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBounds(0, 0, 10, 10);
	        getContentPane().add(panel_1);
	        
	        JPanel panel_2 = new JPanel();
	        panel_2.setBounds(0, 0, 10, 10);
	        getContentPane().add(panel_2);
	        
	        
	        
	        
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
	        
	        JButton btnNewButton_2 = new JButton("Credits");
	        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 60));
	        btnNewButton_2.setForeground(new Color(25, 25, 112));
	        btnNewButton_2.setBackground(new Color(240, 128, 128));
	        layeredPane.setLayer(btnNewButton_2, 2);
	        btnNewButton_2.setBounds(455, 497, 587, 81);
	        layeredPane.add(btnNewButton_2);
	        
	           Game game = new Game();
	           game.setBounds(-12, 13, 1500, 1100);
	           game.setLayout(null);
	           
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
