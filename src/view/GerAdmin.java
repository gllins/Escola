package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerAlunos frame = new GerAlunos();
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
	public GerAdmin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Desktop\\img\\logo-removebg-preview.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gerenciamento de administrativo");
		lblNewLabel.setForeground(new Color(206, 196, 66));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 0, 318, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 AddAdmin add = new AddAdmin();
			        
				 
				    add.setVisible(true);
			        GerAdmin.this.dispose();

				
			}
		});
		btnAdd.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\add.png"));
		btnAdd.setBounds(23, 180, 72, 70);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\del.png"));
		btnDelete.setBounds(129, 180, 72, 70);
		contentPane.add(btnDelete);
		
		JButton btnList = new JButton("");
		btnList.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\del (1).png"));
		btnList.setBounds(232, 180, 72, 70);
		contentPane.add(btnList);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\del (2).png"));
		btnUpdate.setBounds(334, 180, 72, 70);
		contentPane.add(btnUpdate);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\banner (1).png"));
		lblNewLabel_1.setBounds(10, 41, 414, 128);
		contentPane.add(lblNewLabel_1);
	}

}
