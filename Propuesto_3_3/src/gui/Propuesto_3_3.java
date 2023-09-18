package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Consultor;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_3 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_3_3 frame = new Propuesto_3_3();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_3_3() {
		setTitle("Propuesto_3_3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Consultor a = new Consultor(555, 40, "Alberto", 120.0);
		listado(a);
		
		Consultor b = new Consultor(444, 36, "Enrique");
		listado(b);
		
		Consultor c = new Consultor();
		listado(c);
		
		imprimir("--------------------------------------------------");
		imprimir("Factor de descuento AFP\t: " + Consultor.AFP);
		imprimir("Factor de descuento EPS\t: " + Consultor.EPS);
		imprimir("N° de objetos creados\t: " + Consultor.getCantidad());
		imprimir("Importe a pagar acumulado: " + Consultor.getSuma());
	}
	
	//  Métodos tipo void (sin parámetros)
	void listado(Consultor x) {
		imprimir("Código\t\t: " + x.getCodigo());
		imprimir("Horas trabajadas: " + x.getHorasTrabajadas());
		imprimir("Nombre\t\t: " + x.getNombre());
		imprimir("Tarifa\t\t: " + x.getTarifa());
		imprimir("Sueldo bruto\t: " + x.sueldoBruto());
		imprimir("DescuentoAFP\t: " + x.descuentoAFP());
		imprimir("DescuentoEPS\t: " + x.descuentoEPS());
		imprimir("Sueldo neto\t: " + x.sueldoNeto());
		imprimir();
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}