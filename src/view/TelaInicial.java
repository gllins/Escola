package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo-removebg-preview.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAluno = new JButton("");
		btnAluno.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\aluno (1).png"));
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 GerAlunos gerenciamento = new  GerAlunos();
			        
				 
				    gerenciamento.setVisible(true);
			        TelaInicial.this.dispose();
				
			}
		});
		btnAluno.setBounds(29, 11, 75, 68);
		contentPane.add(btnAluno);
		
		JButton btnAdmin = new JButton("");
		btnAdmin.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\professor (1).png"));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdmin.setBounds(29, 90, 75, 68);
		contentPane.add(btnAdmin);
		
		JButton btnProf = new JButton("");
		btnProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 GerProf gerenciamento = new  GerProf();
			        
				 
				    gerenciamento.setVisible(true);
			        TelaInicial.this.dispose();
				
				
			}
		});
		btnProf.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\professor.png"));
		btnProf.setBounds(29, 169, 75, 68);
		contentPane.add(btnProf);
		
		JLabel lblNewLabel = new JLabel("Academia Saberes Reais\r\n");
		lblNewLabel.setForeground(new Color(206, 196, 66));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 21));
		lblNewLabel.setBounds(140, 11, 255, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (13).png"));
		lblNewLabel_1.setBounds(140, 38, 262, 212);
		contentPane.add(lblNewLabel_1);
	}
}