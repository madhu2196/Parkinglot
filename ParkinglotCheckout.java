import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ParkinglotCheckout extends JFrame {

	private JPanel contentPane;
	static long amount;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkinglotCheckout frame = new ParkinglotCheckout();
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
	public ParkinglotCheckout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblIdForCheckout = new JLabel("ID for Checkout");
		GridBagConstraints gbc_lblIdForCheckout = new GridBagConstraints();
		gbc_lblIdForCheckout.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdForCheckout.gridx = 2;
		gbc_lblIdForCheckout.gridy = 1;
		contentPane.add(lblIdForCheckout, gbc_lblIdForCheckout);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		final JLabel lblAmount = new JLabel("Amount :");
		GridBagConstraints gbc_lblAmount = new GridBagConstraints();
		gbc_lblAmount.insets = new Insets(0, 0, 5, 5);
		gbc_lblAmount.gridx = 2;
		gbc_lblAmount.gridy = 4;
		contentPane.add(lblAmount, gbc_lblAmount);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 0);
		gbc_btnSubmit.gridx = 5;
		gbc_btnSubmit.gridy = 2;
		contentPane.add(btnSubmit, gbc_btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s  = textField.getText();
				long t = Long.valueOf(s).longValue();
				System.out.println(t);
				System.out.println("amount " + Gate.Checkout(t));
				
				lblAmount.setText(Long.toString(amount));
				
			}
		});
		
		
		
		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 4;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnAmountPaid = new JButton("Amount Paid");
		GridBagConstraints gbc_btnAmountPaid = new GridBagConstraints();
		gbc_btnAmountPaid.gridx = 5;
		gbc_btnAmountPaid.gridy = 5;
		contentPane.add(btnAmountPaid, gbc_btnAmountPaid);
	}

}
