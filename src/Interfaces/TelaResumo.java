package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaResumo extends JPanel implements ActionListener {

	
private JLabel lIncluirArtigo;
	
	private JLabel lTitulo;
	private JTextField tTitulo;
	
	private JLabel lSituacao;
	private JTextField tSituacao;
	
	private JLabel lAutor;
	private JTextField tAutor;
	
	private JLabel lInstituicao;
	private JTextField tInstituicao;
	
	private JLabel lPalavraChave;
	private JTextField tPalavraChave;
	
	private JButton bEnviar;
	private JButton bCancelar;
	private JButton bLimpar;

	private JPanel j;
	
	TelaResumo() {
		
		
		setBackground(Color.WHITE);
		setBounds(350, 0, 820, 768);
		setLayout(null);
		
		lIncluirArtigo = new JLabel("Incluir Resumos");
		lIncluirArtigo.setBounds(310, 150, 350, 60);
		lIncluirArtigo.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
		lIncluirArtigo.setForeground(new Color(70, 130, 180));
		add(lIncluirArtigo);
		
		lTitulo = new JLabel("Titulo");
		lTitulo.setBounds(20, 200, 350, 40);
		lTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
		lTitulo.setForeground(new Color(128, 128, 128));
		add(lTitulo);
		
		tTitulo = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tTitulo.setBounds(70, 200, 200, 40);
		tTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
		tTitulo.setForeground(new Color(92, 92, 92));
		add(tTitulo);
		
		lAutor = new JLabel("Autores");
		lAutor.setBounds(280, 200, 200, 40);
		lAutor.setFont(new Font("Arial", Font.PLAIN, 20));
		lAutor.setForeground(new Color(128, 128, 128));
		add(lAutor);
		
		tAutor = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tAutor.setBounds(350, 200, 200, 40);
		tAutor.setFont(new Font("Arial", Font.PLAIN, 20));
		tAutor.setForeground(new Color(92, 92, 92));
		add(tAutor);
		
		lSituacao = new JLabel("Situa��o");
		lSituacao.setBounds(555, 200, 350, 40);
		lSituacao.setFont(new Font("Arial", Font.PLAIN, 20));
		lSituacao.setForeground(new Color(128, 128, 128));
		add(lSituacao);
		
		tSituacao = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tSituacao.setBounds(635, 200, 150, 40);
		tSituacao.setFont(new Font("Arial", Font.PLAIN, 20));
		tSituacao.setForeground(new Color(92, 92, 92));
		add(tSituacao);
		
		lInstituicao = new JLabel("Institui��o");
		lInstituicao.setBounds(20, 250, 350, 40);
		lInstituicao.setFont(new Font("Arial", Font.PLAIN, 20));
		lInstituicao.setForeground(new Color(128, 128, 128));
		add(lInstituicao);
		
		tInstituicao = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tInstituicao.setBounds(110, 250, 200, 40);
		tInstituicao.setFont(new Font("Arial", Font.PLAIN, 20));
		tInstituicao.setForeground(new Color(92, 92, 92));
		add(tInstituicao);
		
		lPalavraChave = new JLabel("Palavra-Chave");
		lPalavraChave.setBounds(320, 250, 350, 40);
		lPalavraChave.setFont(new Font("Arial", Font.PLAIN, 20));
		lPalavraChave.setForeground(new Color(128, 128, 128));
		add(lPalavraChave);
		
		tPalavraChave = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tPalavraChave.setBounds(450, 250, 200, 40);
		tPalavraChave.setFont(new Font("Arial", Font.PLAIN, 20));
		tPalavraChave.setForeground(new Color(92, 92, 92));
		add(tPalavraChave);
		
		bEnviar = new JButton("Enviar");
		bEnviar.setBounds(530, 640, 160, 50);
		bEnviar.setFont(new Font("Arial", Font.PLAIN, 20));
		bEnviar.addActionListener(this);
		bEnviar.setForeground(new Color(0, 128, 128));
		add(bEnviar);

		bLimpar = new JButton("Limpar");
		bLimpar.setBounds(330, 640, 160, 50);
		bLimpar.setFont(new Font("Arial", Font.PLAIN, 20));
		bLimpar.setForeground(new Color(205, 92, 92));
		bLimpar.addActionListener(this);
		add(bLimpar);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(100, 640, 160, 50);
		bCancelar.setFont(new Font("Arial", Font.PLAIN, 20));
		bCancelar.setForeground(new Color(205, 92, 92));
		bCancelar.addActionListener(this);
		add(bCancelar);
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == bEnviar) {
			
			
		}
		
		if (ae.getSource() == bLimpar) {
			
			tTitulo.setText("");
			tSituacao.setText("");
			tPalavraChave.setText("");
			tInstituicao.setText("");
			tAutor.setText("");
			
			
		}
		
		if (ae.getSource() == bCancelar) {
			
			removeAll();
			Tela t = new Tela();
			setVisible(false);
			Tela.TelaInicio(j);
			j.setVisible(true);
		}	
		
		
		
	}
	
	
}

