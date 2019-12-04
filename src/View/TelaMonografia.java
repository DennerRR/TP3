package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaMonografia extends JPanel implements ActionListener {

	
private JLabel lIncluirArtigo;
	
	private JLabel lTitulo;
	private JTextField tTitulo;
	
	private JLabel lSituacao;
	private JTextField tSituacao;
	
	private JLabel lTipo;
	private JTextField tTipo;
	
	private JLabel lAutor;
	private JTextField tAutor;
	
	private JLabel lInstituicao;
	private JTextField tInstituicao;
	
	private JLabel lOrientador;
	private JTextField tOrientador;
	
	private JLabel lCurso;
	private JTextField tCurso;
	
	private JLabel lPalavraChave;
	private JTextField tPalavraChave;
	
	private JLabel lResumo;
	private JTextField tResumo;
	
	private JLabel lAbstrato;
	private JTextField tAbstrato;
	
	private JLabel lAno;
	private JTextField tAno;
	
	private JLabel lNdePaginas;
	private JTextField tNdePaginas;
	
	private JButton bEnviar;
	private JButton bCancelar;
	private JButton bLimpar;

	private JPanel j;
	
	TelaMonografia() {
				
		setBackground(Color.WHITE);
		setBounds(350, 0, 820, 768);
		setLayout(null);
		
		lIncluirArtigo = new JLabel("Incluir Monografia");
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
		
		lTipo = new JLabel("Tipo");
		lTipo.setBounds(20, 450, 350, 40);
		lTipo.setFont(new Font("Arial", Font.PLAIN, 20));
		lTipo.setForeground(new Color(128, 128, 128));
		add(lTipo);
		
		tTipo = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tTipo.setBounds(70, 450, 200, 40);
		tTipo.setFont(new Font("Arial", Font.PLAIN, 20));
		tTipo.setForeground(new Color(92, 92, 92));
		add(tTipo);		
		
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
		
		lResumo = new JLabel("Resumo");
		lResumo.setBounds(20, 300, 350, 40);
		lResumo.setFont(new Font("Arial", Font.PLAIN, 20));
		lResumo.setForeground(new Color(128, 128, 128));
		add(lResumo);
		
		tResumo = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tResumo.setBounds(100, 300, 200, 40);
		tResumo.setFont(new Font("Arial", Font.PLAIN, 20));
		tResumo.setForeground(new Color(92, 92, 92));
		add(tResumo);
		
		lAbstrato = new JLabel("Abstract");
		lAbstrato.setBounds(320, 300, 350, 40);
		lAbstrato.setFont(new Font("Arial", Font.PLAIN, 20));
		lAbstrato.setForeground(new Color(128, 128, 128));
		add(lAbstrato);
		
		tAbstrato = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tAbstrato.setBounds(400, 300, 200, 40);
		tAbstrato.setFont(new Font("Arial", Font.PLAIN, 20));
		tAbstrato.setForeground(new Color(92, 92, 92));
		add(tAbstrato);
		
		lAno = new JLabel("Ano");
		lAno.setBounds(20, 350, 350, 40);
		lAno.setFont(new Font("Arial", Font.PLAIN, 20));
		lAno.setForeground(new Color(128, 128, 128));
		add(lAno);
		
		tAno = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tAno.setBounds(60, 350, 200, 40);
		tAno.setFont(new Font("Arial", Font.PLAIN, 20));
		tAno.setForeground(new Color(92, 92, 92));
		add(tAno);
		
		lNdePaginas = new JLabel("N�mero de p�ginas");
		lNdePaginas.setBounds(270, 350, 350, 40);
		lNdePaginas.setFont(new Font("Arial", Font.PLAIN, 20));
		lNdePaginas.setForeground(new Color(128, 128, 128));
		add(lNdePaginas);
		
		tNdePaginas = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tNdePaginas.setBounds(450, 350, 200, 40);
		tNdePaginas.setFont(new Font("Arial", Font.PLAIN, 20));
		tNdePaginas.setForeground(new Color(92, 92, 92));
		add(tNdePaginas);
		
		lOrientador = new JLabel("Orientador");
		lOrientador.setBounds(20, 400, 350, 40);
		lOrientador.setFont(new Font("Arial", Font.PLAIN, 20));
		lOrientador.setForeground(new Color(128, 128, 128));
		add(lOrientador);
		
		tOrientador = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tOrientador.setBounds(120, 400, 200, 40);
		tOrientador.setFont(new Font("Arial", Font.PLAIN, 20));
		tOrientador.setForeground(new Color(92, 92, 92));
		add(tOrientador);
		
		lCurso = new JLabel("Curso");
		lCurso.setBounds(330, 400, 350, 40);
		lCurso.setFont(new Font("Arial", Font.PLAIN, 20));
		lCurso.setForeground(new Color(128, 128, 128));
		add(lCurso);
		
		tCurso = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tCurso.setBounds(390, 400, 280, 40);
		tCurso.setFont(new Font("Arial", Font.PLAIN, 20));
		tCurso.setForeground(new Color(92, 92, 92));
		add(tCurso);
		
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
			tResumo.setText("");
			tPalavraChave.setText("");
			tInstituicao.setText("");
			tAutor.setText("");
			tAbstrato.setText("");
			tNdePaginas.setText("");
			tAno.setText("");
			tOrientador.setText("");
			tCurso.setText("");
			tTipo.setText("");
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
