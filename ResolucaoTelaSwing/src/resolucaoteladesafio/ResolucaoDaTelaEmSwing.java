package resolucaoteladesafio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResolucaoDaTelaEmSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResolucaoDaTelaEmSwing frame = new ResolucaoDaTelaEmSwing();
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
	public ResolucaoDaTelaEmSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mota\\Downloads\\monitor.png"));
		lblNewLabel.setBounds(130, 11, 430, 341);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resolu\u00E7\u00E3o da Tela");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(256, 363, 174, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResolucao = new JLabel("Clique no Bot\u00E3o");
		lblResolucao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResolucao.setBounds(277, 399, 140, 25);
		contentPane.add(lblResolucao);
		
		JButton btnResolucao = new JButton("Clique Aqui");
		btnResolucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
				double largura = resolucao.getWidth();
				String larguraTexto = Double.toString(largura);
				double altura = resolucao.getHeight();
				String alturaTexto = Double.toString(altura);
				lblResolucao.setText(larguraTexto +" x " + alturaTexto);
				//lblResolucaoAltura.setText(alturaTexto);
			}
		});
		btnResolucao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnResolucao.setBackground(Color.LIGHT_GRAY);
		btnResolucao.setBounds(286, 435, 110, 49);
		contentPane.add(btnResolucao);
	}
}
