package br.senai.sp.jandira.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroupPhyton = new ButtonGroup();
	private final ButtonGroup buttonGroupC = new ButtonGroup();
	private final ButtonGroup buttonGroupJs = new ButtonGroup();
	private final ButtonGroup buttonGroupFeminino = new ButtonGroup();
	private final ButtonGroup buttonGroupMasculino = new ButtonGroup();

	//construtor;
	public FrameCadastroCliente() { 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 470, 320);
		contentPane = new JPanel(); // criar painel
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane); // painel dentro de um painel 
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(240, 255, 240));
		btnNewButton.setBounds(273, 247, 171, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(24, 30, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 81, 195, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome\r\n");
		lblNewLabel.setBounds(24, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(24, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de nasc.");
		lblNewLabel_2.setBounds(24, 112, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(24, 137, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Fem.");
		buttonGroupFeminino.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(136, 136, 58, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masc.");
		buttonGroupMasculino.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(196, 136, 63, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setBounds(136, 112, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Java");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(312, 80, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Phyton");
		buttonGroupPhyton.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(312, 106, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("c");
		buttonGroupC.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(312, 133, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Js");
		buttonGroupJs.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(312, 159, 109, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_4 = new JLabel("Linguagens:");
		lblNewLabel_4.setBounds(312, 55, 109, 14);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 207, 171, 63);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jandira", "Itapevi", "S\u00E3o Paulo", "Osasco", "Carapicuiba"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("Cidades");
		lblNewLabel_5.setBounds(24, 188, 86, 14);
		contentPane.add(lblNewLabel_5);
		setVisible(true);
		
		
		
	}
}
