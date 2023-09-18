package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Balon;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_2 extends JFrame implements ActionListener {
	
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
					Propuesto_3_2 frame = new Propuesto_3_2();
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
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
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
		Balon a = new Balon("Nike", 1.7, 5.4 , 22.5, 109.5);
		listado(a);
		
		Balon b = new Balon("Umbro", 1.6, 5.1);
		listado(b);
		
		Balon c = new Balon();
		listado(c);
		
		imprimir("--------------------------------------------------");
		imprimir("Valor de PI\t\t: " + Balon.PI);
		imprimir("Factor de descuento\t: " + Balon.factorDescuento);
		imprimir("N� de objetos creados\t: " + Balon.getCantidad());
		imprimir("Importe a pagar acumulado: " + Balon.getImporteTotal());
	}
	
	//  M�todos tipo void (sin par�metros)
	void listado(Balon x) {
		imprimir("Marca\t\t: " + x.getMarca());
		imprimir("Peso\t\t: " + x.getPeso());
		imprimir("Presi�n\t\t: " + x.getPresion());
		imprimir("Di�metro\t: " + x.getDiametro());
		imprimir("Precio\t\t: " + x.getPrecio());
		imprimir("Importe a pagar\t: " + x.importePagar());
		imprimir();
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}