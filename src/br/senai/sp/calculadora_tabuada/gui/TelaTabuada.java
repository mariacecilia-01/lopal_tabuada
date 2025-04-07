package br.senai.sp.calculadora_tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.senai.sp.calculadora_tabuada.model.Tabuada;

public class TelaTabuada {

	private JLabel lblMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel lblMinMultiplicador;
	private JTextField txtMinMultiplicador;
	private JLabel lblMaxMultiplicador;
	private JTextField txtMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private String resultado[];

	public void criaTela() {

		JFrame tela = new JFrame();
		tela.setSize(265, 550);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);

		// criar um label para inserir no JFrame
		// Multiplicando
		lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 150, 30);

		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 30);

		// Mínimo multiplicador
		lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Mín. multiplicador:");
		lblMinMultiplicador.setBounds(20, 50, 150, 30);

		txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(180, 50, 50, 30);

		// Máximo multiplicador
		lblMaxMultiplicador = new JLabel();
		lblMaxMultiplicador.setText("Máx. multiplicador:");
		lblMaxMultiplicador.setBounds(20, 90, 150, 30);

		txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(180, 90, 50, 30);

		// BOTÃO CALCULAR
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);

		// lista para exibir a tabuada
		listTabuada = new JList();
		listTabuada.setBounds(20, 190, 210, 300);

		// Botão limpar
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);

		// Adicionar componentes ao painel de conteudo
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(lblMaxMultiplicador);
		tela.getContentPane().add(txtMaxMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(listTabuada);

		// configurar os listeners dos botões
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String multiplicando = txtMultiplicando.getText();
				String MinMultiplicador = txtMinMultiplicador.getText();
				String MaxMultiplicador = txtMaxMultiplicador.getText();

				// Casting -> conversão de um tipo para outro.
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minMultiplicadorDouble = Double.parseDouble(MinMultiplicador);
				double maxMultiplicadorDouble = Double.parseDouble(MaxMultiplicador);

				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				resultado = tabuada.calcularTabuada();

			}
		});

		tela.getContentPane().add(buttonCalcular);
		tela.setVisible(true);
	}

}
