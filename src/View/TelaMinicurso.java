package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaMinicurso extends JPanel implements ActionListener {
	
	private JLabel lIncluirArtigo;
	
	private JLabel lTitulo;
	private JTextField tTitulo;
	
	private JLabel lSituacao;
	private JTextField tSituacao;
	
	private JLabel lAutor;
	private JTextField tAutor;
	
	private JLabel lResumo;
	private JTextField tResumo;
	
	private JLabel lAbstrato;
	private JTextField tAbstrato;
	
	private JLabel lRecursos;
	private JTextField tRecursos;
	
	private JLabel lDuracaco;
	private JTextField tDuracao;
	
	private JLabel lMetodologia;
	private JTextField tMetodologia;
	
	private JButton bEnviar;
	private JButton bCancelar;
	private JButton bLimpar;

	private JPanel j;
	
		TelaMinicurso() {
		
		
		setBackground(Color.WHITE);
		setBounds(350, 0, 820, 768);
		setLayout(null);
		
		lIncluirArtigo = new JLabel("Incluir Minicurso");
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
		
		lRecursos = new JLabel("Recursos");
		lRecursos.setBounds(20, 250, 350, 40);
		lRecursos.setFont(new Font("Arial", Font.PLAIN, 20));
		lRecursos.setForeground(new Color(128, 128, 128));
		add(lRecursos);
		
		tRecursos = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tRecursos.setBounds(110, 250, 200, 40);
		tRecursos.setFont(new Font("Arial", Font.PLAIN, 20));
		tRecursos.setForeground(new Color(92, 92, 92));
		add(tRecursos);
		
		lMetodologia = new JLabel("Metodologia");
		lMetodologia.setBounds(320, 250, 350, 40);
		lMetodologia.setFont(new Font("Arial", Font.PLAIN, 20));
		lMetodologia.setForeground(new Color(128, 128, 128));
		add(lMetodologia);
		
		tMetodologia = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tMetodologia.setBounds(435, 250, 200, 40);
		tMetodologia.setFont(new Font("Arial", Font.PLAIN, 20));
		tMetodologia.setForeground(new Color(92, 92, 92));
		add(tMetodologia);
		
		lDuracaco = new JLabel("Dura��o");
		lDuracaco.setBounds(20, 350, 350, 40);
		lDuracaco.setFont(new Font("Arial", Font.PLAIN, 20));
		lDuracaco.setForeground(new Color(128, 128, 128));
		add(lDuracaco);
		
		tDuracao = new JTextField("");
		//tTitulo.setDocument(new Tratamento());
		tDuracao.setBounds(110, 350, 200, 40);
		tDuracao.setFont(new Font("Arial", Font.PLAIN, 20));
		tDuracao.setForeground(new Color(92, 92, 92));
		add(tDuracao);
		
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
			tMetodologia.setText("");
			tDuracao.setText("");
			tRecursos.setText("");
			tAutor.setText("");
			tAbstrato.setText("");
			
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
