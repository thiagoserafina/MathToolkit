package graphic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ProblemasMatematicosWindow extends JFrame {

	private JLabel lblOperacao;

	private JLabel lblAplicaDesconto;
	private JTextField txfA;
	private JTextField txfB;
	private JTextField txfResult;
	private JLabel lblIncrementar;
	private JLabel lblAmostragem;
	private JLabel lblAmostragem2;
	private JLabel lblPorcentagemDesconto;
	private JLabel lblDelta;
	private JLabel lblValorOriginal;
	private JLabel lblRegraDeTres;

	private JLabel lblGeradorSenha;
	private JCheckBox chkUppercase;
	private JCheckBox chkLowercase;
	private JCheckBox chkNumbers;
	private JCheckBox chkSymbols;
	private JSpinner spnTamanho;
	private JButton btnGerar;
	private JButton btnCalcular;
	private JTextField txfSenha;

	public ProblemasMatematicosWindow() {
		setTitle("Math Toolkit");
		setSize(1000, 500);
		setLayout(null);
		setResizable(false);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				fecharJanela();
			}
		});
		componentesCriar();
		setVisible(true);
	}

	private void componentesCriar() {
	    lblOperacao = new JLabel("Aplicar desconto % num valor");
	    lblOperacao.setBounds(10, 10, 200, 25);
	    getContentPane().add(lblOperacao);
	    
	    lblOperacao = new JLabel("Valor inicial R$ (a)");
	    lblOperacao.setBounds(30, 40, 110, 25);
	    lblOperacao.setForeground(Color.red);
	    getContentPane().add(lblOperacao);
	    
	    txfA = new JTextField();
	    txfA.setBounds(140, 40, 150, 25);
	    getContentPane().add(txfA);
	    
	    lblOperacao = new JLabel("% desconto (b)");
	    lblOperacao.setBounds(50, 70, 110, 25);
	    lblOperacao.setForeground(Color.blue);
	    getContentPane().add(lblOperacao);
	    
	    txfB = new JTextField();
	    txfB.setBounds(140, 70, 150, 25);
	    getContentPane().add(txfB);
	    
	    lblOperacao = new JLabel("Resutado");
	    lblOperacao.setBounds(60, 100, 110, 25);
	    getContentPane().add(lblOperacao);
	    
	    txfResult = new JTextField();
	    txfResult.setBounds(140, 100, 150, 25);
	    txfResult.setEditable(false);
	    getContentPane().add(txfResult);
	    
	    
	    
	    
	    
	    btnCalcular = new JButton(new AbstractAction("Calcular") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (txfA.getText().isEmpty() || txfB.getText().isEmpty()) {
					JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
					return;
				}
				
				try {
					txfResult.add(NAME, rootPane);
				}
				catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
					
				}
			}
		});
	}

	private void fecharJanela() {
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair do sistema",
				JOptionPane.YES_NO_OPTION);
		if (opcao == JOptionPane.YES_OPTION) {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			System.exit(0);
		} else {
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		}
	}

	public static void main(String[] args) {
		new ProblemasMatematicosWindow();
	}
}