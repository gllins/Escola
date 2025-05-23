package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.AlunoDAO;
import model.Aluno;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddAluno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField idade;
	private JTextField turma;
	private JTextField turno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAluno frame = new AddAluno();
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
	public AddAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nome = new JTextField();
		nome.setBounds(25, 81, 251, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		idade = new JTextField();
		idade.setBounds(309, 81, 29, 20);
		contentPane.add(idade);
		idade.setColumns(10);
		
		turma = new JTextField();
		turma.setBounds(25, 143, 170, 20);
		contentPane.add(turma);
		turma.setColumns(10);
		
		turno = new JTextField();
		turno.setBounds(235, 143, 103, 20);
		contentPane.add(turno);
		turno.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel.setBounds(23, 55, 50, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblIdade.setBounds(303, 54, 50, 15);
		contentPane.add(lblIdade);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblTurma.setBounds(20, 112, 86, 20);
		contentPane.add(lblTurma);
		
		JLabel lblNewLabel_1 = new JLabel("Turno: ");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(235, 111, 103, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    Aluno a = new Aluno();

	            a.setNome(nome.getText());
	            a.setIdade(Integer.parseInt(idade.getText()));
	            a.setTurma(turma.getText());
	            a.setTurno(turno.getText());

	          
	            AlunoDAO ad = new AlunoDAO();
	            ad.save(a);
	     
		        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
		        
	            
	            
			}
		});
		btnCadastrar.setBounds(307, 194, 117, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastro Aluno");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(135, 11, 213, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     JTextField[] textFields = {nome, idade, turma, turno };
			        for (JTextField textField : textFields) {
			            textField.setText("");
			        }
			}
		});
		btnLimpar.setBounds(208, 194, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 GerAlunos gerenciamento = new  GerAlunos();
			        
				 
				    gerenciamento.setVisible(true);
			        AddAluno.this.dispose();
			}
		});
		btnVoltar.setBounds(106, 194, 89, 23);
		contentPane.add(btnVoltar);
	}
}
