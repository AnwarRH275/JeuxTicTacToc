package tictacteo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.JTextPane;

public class tictacteo {

	private JFrame frame;
	private String startGame = "X";
	private int xCount = 0 ;
	private int yCount = 0 ;

	private JTextField textField;
	private JTextField textField_1;
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JTextField txtTextSaisi;
	private JTextField txtRep;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictacteo window = new tictacteo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tictacteo() {
		initialize();
		gameScore();
	}

	public void gameScore() {
		
		textField.setText(Integer.toString(xCount));
		textField_1.setText(String.valueOf(yCount)); 
		  	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	  
	  
	  private void choosePlayer() {
		  
		  if (startGame.equalsIgnoreCase("X")) {
			startGame = "O";
			
		}else {
			startGame = "X";
		}
	  
	  }
	  
	  private void winningGame() {
		  String b1 = btnNewButton.getText();
		  String b2 = btnNewButton_1.getText();
		  String b3 = btnNewButton_2.getText();
		  String b4 = btnNewButton_3.getText();
		  String b5 = btnNewButton_4.getText();
		  String b6 = btnNewButton_5.getText();
		  String b7 = btnNewButton_6.getText();
		  String b8 = btnNewButton_7.getText();
		  String b9 = btnNewButton_8.getText();
		  
		  if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
			JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
			yCount += 1;
			gameScore();
		}
		  
		  if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
				JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				yCount += 1;
				gameScore();
			}
		  if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
				JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				yCount += 1;
				gameScore();
			}
		  if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
				JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				yCount += 1;
				gameScore();
			}
		  if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
				JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				yCount += 1;
				gameScore();
			}
		  if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
				JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				yCount += 1;
				gameScore();
			}
		  if (b5 == ("O") && b2 == ("O") && b8 == ("O")) {
				JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				yCount += 1;
				gameScore();
			}
		  if (b6 == ("O") && b9 == ("O") && b3 == ("O")) {
				JOptionPane.showMessageDialog(frame, "Player O is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				yCount += 1;
				gameScore();
			}
		  
		  
		  ////////////////////////////////////////////////
		  if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
				JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
				xCount += 1;
				gameScore();
			}
			  
			  if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
					JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
					xCount += 1;
					gameScore();
				}
			  if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
					JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
					xCount += 1;
					gameScore();
				}
			  if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
					JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
					xCount += 1;
					gameScore();
				}
			  if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
					JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
					xCount += 1;
					gameScore();
				}
			  if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
					JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
					xCount += 1;
					gameScore();
				}
			  if (b5 == ("X") && b2 == ("X") && b8 == ("X")) {
					JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
					xCount += 1;
					gameScore();
				}
			  if (b6 == ("X") && b9 == ("X") && b3 == ("X")) {
					JOptionPane.showMessageDialog(frame, "Player X is wins ","Tic Tac Toc ",JOptionPane.INFORMATION_MESSAGE);
					xCount += 1;
					gameScore();
				}
		  
		  
	}
	 
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		
		btnNewButton = new JButton("");
		btnNewButton.setBounds(6, 7, 225, 177);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton.setForeground(Color.RED);
				}
				else {
					btnNewButton.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(6, 7, 225, 177);
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_1.setForeground(Color.RED);
				}
				else {
					btnNewButton_1.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_2.setLayout(null);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_2.setForeground(Color.RED);
				}
				else {
					btnNewButton_2.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
				
			}
		});
		btnNewButton_2.setBounds(6, 7, 225, 177);
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player X : ");
		lblPlayer.setBounds(12, 65, 165, 34);
		lblPlayer.setFont(new Font("Monaco", Font.PLAIN, 25));
		panel_4.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("Player O : ");
		lblPlayer_1.setBounds(6, 106, 174, 69);
		panel_4.add(lblPlayer_1);
		lblPlayer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_1.setFont(new Font("Monaco", Font.BOLD, 25));
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 116, 62, 40);
		panel_4.add(textField_1);
		textField_1.setBackground(UIManager.getColor("Button.background"));
		textField_1.setText("0");
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(166, 61, 65, 40);
		panel_4.add(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		textField.setText("0");
		textField.setColumns(10);
		
		JLabel lblJoueur = new JLabel("Joueur");
		lblJoueur.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoueur.setBackground(Color.BLUE);
		lblJoueur.setFont(new Font("Monaco", Font.PLAIN, 31));
		lblJoueur.setBounds(37, 17, 165, 34);
		panel_4.add(lblJoueur);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblHistoriqueDuMouvement = new JLabel("Historique du mouvement ");
		lblHistoriqueDuMouvement.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistoriqueDuMouvement.setBackground(Color.LIGHT_GRAY);
		lblHistoriqueDuMouvement.setFont(new Font("Lao MN", Font.BOLD, 20));
		lblHistoriqueDuMouvement.setBounds(6, -16, 225, 101);
		panel_5.add(lblHistoriqueDuMouvement);
		
		JTextPane txtpnVersLeHaut = new JTextPane();
		txtpnVersLeHaut.setText("  vers le haut");
		txtpnVersLeHaut.setBounds(16, 65, 203, 101);
		panel_5.add(txtpnVersLeHaut);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(6, 7, 225, 177);
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_3.setForeground(Color.RED);
				}
				else {
					btnNewButton_3.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_6.setLayout(null);
		panel_6.add(btnNewButton_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(7, 5, 225, 177);
		btnNewButton_4.setFont(new Font("Lucida Sans", Font.PLAIN, 99));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_4.setForeground(Color.RED);
				}
				else {
					btnNewButton_4.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_7.setLayout(null);
		panel_7.add(btnNewButton_4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_5.setForeground(Color.RED);
				}
				else {
					btnNewButton_5.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		btnNewButton_5.setBounds(6, 7, 225, 177);
		panel_8.add(btnNewButton_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblPlayer_2 = new JLabel("Player X : ");
		lblPlayer_2.setFont(new Font("Monaco", Font.PLAIN, 25));
		lblPlayer_2.setBounds(34, 6, 165, 34);
		panel_9.add(lblPlayer_2);
		
		txtTextSaisi = new JTextField();
		txtTextSaisi.setText("Text saisi");
		txtTextSaisi.setBounds(6, 45, 225, 98);
		panel_9.add(txtTextSaisi);
		txtTextSaisi.setColumns(10);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.setBounds(114, 155, 117, 29);
		panel_9.add(btnEnvoyer);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblPlayer_1_1 = new JLabel("Discution ");
		lblPlayer_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_1_1.setFont(new Font("Monaco", Font.BOLD, 25));
		lblPlayer_1_1.setBounds(38, 6, 174, 50);
		panel_10.add(lblPlayer_1_1);
		
		txtRep = new JTextField();
		txtRep.setHorizontalAlignment(SwingConstants.LEFT);
		txtRep.setText("Rep");
		txtRep.setEnabled(false);
		txtRep.setBounds(6, 54, 225, 130);
		panel_10.add(txtRep);
		txtRep.setColumns(10);
		
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		btnNewButton_6.setBounds(6, 7, 225, 177);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_6.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_6.setForeground(Color.RED);
				}
				else {
					btnNewButton_6.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_11.setLayout(null);
		panel_11.add(btnNewButton_6);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		btnNewButton_7.setBounds(6, 7, 225, 177);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_7.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_7.setForeground(Color.RED);
				}
				else {
					btnNewButton_7.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_12.setLayout(null);
		panel_12.add(btnNewButton_7);
		
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		btnNewButton_8.setBounds(6, 7, 225, 177);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btnNewButton_8.setForeground(Color.RED);
				}
				else {
					btnNewButton_8.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_13.setLayout(null);
		panel_13.add(btnNewButton_8);
		
		JPanel panel_14 = new JPanel();
		panel.add(panel_14);
		
		btnNewButton_9 = new JButton(" REST ");
		btnNewButton_9.setBounds(6, 92, 225, 92);
		btnNewButton_9.setBackground(new Color(238, 238, 238));
		btnNewButton_9.setFont(new Font("KufiStandardGK", Font.PLAIN, 70));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton.setText(null);
				btnNewButton_1.setText(null);
				btnNewButton_2.setText(null);
				btnNewButton_3.setText(null);
				btnNewButton_4.setText(null);
				btnNewButton_5.setText(null);
				btnNewButton_6.setText(null);
				btnNewButton_7.setText(null);
				btnNewButton_8.setText(null);
				
			
				
			}
		});
		panel_14.setLayout(null);
		panel_14.add(btnNewButton_9);
		
		JPanel panel_15 = new JPanel();
		panel.add(panel_15);
		
		JButton btnNewButton_10 = new JButton(" Exit ");
		btnNewButton_10.setBounds(6, 91, 225, 93);
		btnNewButton_10.setFont(new Font("KufiStandardGK", Font.PLAIN, 70));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,"Vous souhaite sortir du programme ","Tic Tac Toc ",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		panel_15.setLayout(null);
		panel_15.add(btnNewButton_10);
	}
}
