package poo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Implementa heran�a da classe JFrame
public class HelloSwing extends JFrame {
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Click!!! ");
			
		}
	};

	//Construtor da Classe
	public HelloSwing () {
		super ("Minha Janela ");


		//Definir dimensao
		setSize(300,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//Criac�o de ojbeto jlabel
		JLabel jLabel = new JLabel("Hello Java's Visual World!");
		JButton botaoNorte = new JButton("Norte");
		JButton botaoSul = new JButton("Sul");
		JButton botaoLeste = new JButton("Leste");
		JButton botaoOeste = new JButton("Oeste");
		JButton botaoCentro= new JButton("Centro");
		
		//Adicionar ao frame
		add(jLabel,BorderLayout.CENTER);
		add(botaoNorte, BorderLayout.NORTH);
		add(botaoSul, BorderLayout.SOUTH);
		add(botaoLeste, BorderLayout.EAST);
		add(botaoOeste, BorderLayout.WEST);
		add(botaoCentro, BorderLayout.CENTER);
		
		
//	botaoCentro.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//			//Mensagem q vai aparecer no bot�o
//			System.out.println("Click Bot�o Centro! ");
//						
//		}
//	});
		
		botaoCentro.addActionListener(listener);
		botaoNorte.addActionListener(listener);
		botaoSul.addActionListener(listener);
		botaoLeste.addActionListener(listener);
		botaoOeste.addActionListener(listener);
		


		//Habilitar visibilidade do frame apos inicializar componentes
		setVisible(true);

	}

	public static void main(String[] args ) {
		new HelloSwing();
	}

}
