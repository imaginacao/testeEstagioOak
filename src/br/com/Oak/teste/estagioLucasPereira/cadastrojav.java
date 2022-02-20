package br.com.Oak.teste.estagioLucasPereira;
//Falta a integração com banco de dados.

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastrojav extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField prod;
	private JTextField despro;
	private JTextField valor;
	private JTextField disponivel;

	//Aplicando as exceções
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrojav frame = new cadastrojav();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Iniciando a tabela
	public cadastrojav() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro: Produto");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 47, 151, 30);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 524, 196);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"produto", "descriçãoProduto", "valor", "disponivel"
			}
		));
		scrollPane.setViewportView(table_1);
		
		//Campos da tabela
		table = new JTable();
		table.setBounds(60, 76, 1, 1);
		contentPane.add(table);
		
		lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setBounds(10, 291, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Descri\u00E7\u00E3oProduto");
		lblNewLabel_2.setBounds(125, 291, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Valor");
		lblNewLabel_3.setBounds(284, 291, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Dispon\u00EDvel");
		lblNewLabel_4.setBounds(416, 291, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		prod = new JTextField();
		prod.setBounds(10, 316, 86, 20);
		contentPane.add(prod);
		prod.setColumns(10);
		
		despro = new JTextField();
		despro.setBounds(125, 316, 86, 20);
		contentPane.add(despro);
		despro.setColumns(10);
		
		valor = new JTextField();
		valor.setBounds(284, 316, 86, 20);
		contentPane.add(valor);
		valor.setColumns(10);
		
		disponivel = new JTextField();
		disponivel.setBounds(418, 316, 86, 20);
		contentPane.add(disponivel);
		disponivel.setColumns(10);
		
		//capturando os campos de inicialização
		JButton btnCadastra = new JButton("Cadastra");
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String prod1 = prod.getText().trim();
				String despro1 = despro.getText().trim();
				String valor1 = valor.getText().trim();
				String disponivel1 = disponivel.getText().trim();
				
				boolean disponivell = ( Boolean.parseBoolean(disponivel1) || Boolean.parseBoolean(despro1) ||
						Boolean.parseBoolean(valor1) || Boolean.parseBoolean(prod1)
						);
				DefaultTableModel cadas = (DefaultTableModel) table.getModel();
				cadas.addRow(new JTextField[] {prod, despro, valor, disponivel});
				
				prod.setText(" ");
				despro.setText(" ");
				valor.setText(" ");
				disponivel.setText(" ");
				
				prod.requestFocus();
			}
		});
		btnCadastra.setBounds(122, 365, 89, 23);
		contentPane.add(btnCadastra);
		
		//Excluindo produtos
		JButton btnExcluir = new JButton("Excluir produto");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());;
			}
		});
		btnExcluir.setBounds(256, 365, 139, 23);
		contentPane.add(btnExcluir);
	}

	public int compareTo(String jtextfield2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
