package View;

import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Interfaces.*;

/**
 * Tela de �nicio
 */
public class Tela implements ActionListener {

    public JFrame frame;
    public JPanel panel;
    private JLabel lTitulo;
    
    private JButton bArtigo;
    private JButton bResumo;
    private JButton bPalestra;
    private JButton bMiniCurso;
    private JButton bMonografia;
    private JButton bRelatorioTecnico;

    
    	public TelaArtigo panelArtigo = new TelaArtigo();
    	public TelaMonografia panelMonografia = new TelaMonografia();
    	public TelaResumo panelResumo = new TelaResumo();
       	public TelaPalestra panelPalestra = new TelaPalestra();
    	public TelaMinicurso panelMinicursos = new TelaMinicurso();
    	public TelaRelatorioTecnico panelRelatorioTecnico = new TelaRelatorioTecnico();
    

    public Tela() {

        frame = new JFrame("Submissoes");
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setSize(1366, 768);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lTitulo = new JLabel("Submissoes de Trabalhos");
        lTitulo.setBounds(20, 30, 400, 60);
        lTitulo.setFont(new Font("Helvetica", Font.PLAIN, 25));
        lTitulo.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(lTitulo);
        
        bArtigo = new JButton("  Artigo");
        bArtigo.setBounds(30, 150, 250, 60);
        bArtigo.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bArtigo.setForeground(new Color(0, 0, 0));
        bArtigo.addActionListener(this);
        bArtigo.setFocusPainted(false);
        bArtigo.setBorderPainted(false);
        frame.getContentPane().add(bArtigo);

        bResumo = new JButton("  Resumo");
        bResumo.setBounds(30, 220, 250, 60);
        bResumo.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bResumo.setForeground(new Color(0, 0, 0));
        bResumo.addActionListener(this);
        bResumo.setFocusPainted(false);
        bResumo.setBorderPainted(false);
        frame.getContentPane().add(bResumo);

        bPalestra = new JButton("  Palestra");
        bPalestra.setBounds(30, 290, 250, 60);
        bPalestra.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bPalestra.setForeground(new Color(0, 0, 0));
        bPalestra.addActionListener(this);
        bPalestra.setFocusPainted(false);
        bPalestra.setBorderPainted(false);
        frame.getContentPane().add(bPalestra);

        bMiniCurso = new JButton("  Minicurso");
        bMiniCurso.setBounds(30, 360, 250, 60);
        bMiniCurso.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bMiniCurso.setForeground(new Color(0, 0, 0));
        bMiniCurso.addActionListener(this);
        bMiniCurso.setFocusPainted(false);
        bMiniCurso.setBorderPainted(false);
        frame.getContentPane().add(bMiniCurso);

        bMonografia = new JButton("  Monografia");
        bMonografia.setBounds(30, 430, 250, 60);
        bMonografia.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bMonografia.setForeground(new Color(0, 0, 0));
        bMonografia.addActionListener(this);
        bMonografia.setFocusPainted(false);
        bMonografia.setBorderPainted(false);
        frame.getContentPane().add(bMonografia);

        bRelatorioTecnico = new JButton("  Relat�rio T�cnico");
        bRelatorioTecnico.setBounds(30, 500, 250, 60);
        bRelatorioTecnico.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bRelatorioTecnico.setForeground(new Color(0, 0, 0));
        bRelatorioTecnico.addActionListener(this);
        bRelatorioTecnico.setFocusPainted(false);
        bRelatorioTecnico.setBorderPainted(false);
        frame.getContentPane().add(bRelatorioTecnico);
        
        panel = new JPanel();
		panel.setBounds(350, 150, 850, 770);
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        frame.getContentPane().add(panel);
        
        frame.setVisible(true);
    }



	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == bArtigo) {

			panel.setVisible(false);
            TelaArtigo ta = new TelaArtigo();

            frame.getContentPane().add(ta);
            ta.setVisible(true);
			
		}

		if (ae.getSource() == bRelatorioTecnico) {

			panel.setVisible(false);
            TelaRelatorioTecnico trt = new TelaRelatorioTecnico();

            frame.getContentPane().add(trt);
            trt.setVisible(true);

		}

		if (ae.getSource() == bResumo) {

			panel.setVisible(false);
            TelaResumo trm = new TelaResumo();

            frame.getContentPane().add(trm);
            trm.setVisible(true);
			
		}

		if (ae.getSource() == bMiniCurso) {

			panel.setVisible(false);
            TelaMinicurso tmc = new TelaMinicurso();

            frame.getContentPane().add(tmc);
            tmc.setVisible(true);
			
		}

		if (ae.getSource() == bMonografia) {

			panel.setVisible(false);
            TelaMonografia tmn = new TelaMonografia();

            frame.getContentPane().add(tmn);
            tmn.setVisible(true);
		}

		if (ae.getSource() == bPalestra) {

			panel.setVisible(false);
            TelaPalestra tp = new TelaPalestra();

            frame.getContentPane().add(tp);
            tp.setVisible(true);
		}

	}
	
	public static void TelaInicio(JPanel j) {
		JFrame frame1 = null;
        frame1.add(j);
        j.setVisible(true);
    }
	
}
