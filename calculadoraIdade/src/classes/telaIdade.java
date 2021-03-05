package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaIdade frame = new telaIdade();
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
	public telaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(10, 40, 105, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner txtAN = new JSpinner();
		txtAN.setBounds(125, 37, 94, 20);
		contentPane.add(txtAN);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = 2015 - an;
				lblIdade.set
			}
		});
		btnCalc.setBounds(26, 81, 89, 23);
		contentPane.add(btnCalc);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 142, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdade.setBounds(69, 142, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\mota\\Downloads\\calender-icon-12.jpg"));
		lblNewLabel_3.setBounds(308, 11, 116, 100);
		contentPane.add(lblNewLabel_3);
	}
}
