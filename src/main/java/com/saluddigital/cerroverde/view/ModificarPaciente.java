package com.saluddigital.cerroverde.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class ModificarPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarPaciente frame = new ModificarPaciente();
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
	public ModificarPaciente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(21, 21, 78, 14);
		contentPane.add(lblDocumento);
		
		textField = new JTextField();
		textField.setBounds(21, 43, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(137, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 43, 136, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellido");
		lblApellidos.setBounds(296, 21, 46, 14);
		contentPane.add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(296, 43, 136, 20);
		contentPane.add(textField_2);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(454, 21, 46, 14);
		contentPane.add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "Masculino", "Femenino"}));
		comboBox.setBounds(454, 43, 104, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Estado Civil");
		lblNewLabel_1.setBounds(577, 21, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "Soltero", "Casado", "Viudo", "DIvorciado"}));
		comboBox_1.setBounds(577, 43, 106, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblSeguroSocial = new JLabel("Seguro Social");
		lblSeguroSocial.setBounds(21, 79, 86, 14);
		contentPane.add(lblSeguroSocial);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(21, 101, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblGrupoSanguineo = new JLabel("Grupo Sanguineo");
		lblGrupoSanguineo.setBounds(137, 79, 86, 14);
		contentPane.add(lblGrupoSanguineo);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		comboBox_2.setBounds(137, 101, 104, 20);
		contentPane.add(comboBox_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(267, 101, 104, 20);
		contentPane.add(dateChooser);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(267, 79, 86, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setBounds(392, 79, 86, 14);
		contentPane.add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(392, 101, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electr\u00F3nico");
		lblCorreoElectronico.setBounds(501, 79, 124, 14);
		contentPane.add(lblCorreoElectronico);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(501, 101, 162, 20);
		contentPane.add(textField_5);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(21, 141, 124, 14);
		contentPane.add(lblDireccin);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(21, 163, 202, 20);
		contentPane.add(textField_6);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(250, 141, 86, 14);
		contentPane.add(lblDepartamento);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(250, 163, 104, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(380, 141, 86, 14);
		contentPane.add(lblProvincia);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(380, 163, 104, 20);
		contentPane.add(comboBox_4);
		
		JLabel lblDistrito = new JLabel("Distrito");
		lblDistrito.setBounds(509, 141, 86, 14);
		contentPane.add(lblDistrito);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(509, 163, 104, 20);
		contentPane.add(comboBox_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 209, 682, 232);
		contentPane.add(scrollPane);
		
		//table = new JTable();
		//model = new DefaultTableModel();
		//Object[] column = {
		//scrollPane.setViewportView(table);
		//table.setToolTipText("");
	}
}
