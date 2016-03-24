import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class ParkinglotGui extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public JFrame frame1;
	public JFrame frame2;
	static long amount;
	static long idn;
	static String direct;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkinglotGui frame = new ParkinglotGui();
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
	public ParkinglotGui() {
		
	
		frame1 = new JFrame();
		frame1.setResizable(false);
		frame1.setBounds(100, 100, 619, 393);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame2 = new JFrame();
		frame2.setResizable(false);
		frame2.setBounds(100, 100, 619, 393);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame2.setVisible(false);
		frame1.setVisible(true);
	

		GridBagLayout gbl_contentPane1 = new GridBagLayout();
		gbl_contentPane1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame1.getContentPane().setLayout(gbl_contentPane1);
		
		
		
		
		JLabel lblVehicleId = new JLabel("Vehicle ID");
		GridBagConstraints gbc_lblVehicleId = new GridBagConstraints();
		gbc_lblVehicleId.insets = new Insets(0, 0, 5, 5);
		gbc_lblVehicleId.gridx = 1;
		gbc_lblVehicleId.gridy = 1;
		frame1.getContentPane().add(lblVehicleId, gbc_lblVehicleId);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		frame1.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblOwnerName = new JLabel("Owner Name");
		GridBagConstraints gbc_lblOwnerName = new GridBagConstraints();
		gbc_lblOwnerName.insets = new Insets(0, 0, 5, 5);
		gbc_lblOwnerName.gridx = 1;
		gbc_lblOwnerName.gridy = 2;
		frame1.getContentPane().add(lblOwnerName, gbc_lblOwnerName);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		frame1.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblOwnerContact = new JLabel("Owner Contact");
		GridBagConstraints gbc_lblOwnerContact = new GridBagConstraints();
		gbc_lblOwnerContact.insets = new Insets(0, 0, 5, 5);
		gbc_lblOwnerContact.gridx = 1;
		gbc_lblOwnerContact.gridy = 3;
		frame1.getContentPane().add(lblOwnerContact, gbc_lblOwnerContact);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		frame1.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		final JLabel lblNewLabel_1 = new JLabel(Long.toString(idn));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 5;
		frame1.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		final JLabel lblNewLabel = new JLabel(direct);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 6;
		frame1.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 4;
		frame1.getContentPane().add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				idn = Gate.CheckIn(textField_1.getText(), textField.getText(), textField_2.getText());
				if(idn == 0) {lblNewLabel_1.setText("Incorrect Details"); 
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				lblNewLabel.setText(null);}
				else{
				lblNewLabel_1.setText(Long.toString(idn));
				System.out.println("idn " + idn);
				direct = Gate.send_to_floor(idn) + Gate.send_to_row_column(idn);
				lblNewLabel.setText(direct);}
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				
			}
		});
		
		JLabel lblIdNo = new JLabel("ID No");
		GridBagConstraints gbc_lblIdNo = new GridBagConstraints();
		gbc_lblIdNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdNo.gridx = 1;
		gbc_lblIdNo.gridy = 5;
		frame1.getContentPane().add(lblIdNo, gbc_lblIdNo);
		
		JLabel lblDirections = new JLabel("Directions");
		GridBagConstraints gbc_lblDirections = new GridBagConstraints();
		gbc_lblDirections.insets = new Insets(0, 0, 5, 5);
		gbc_lblDirections.gridx = 1;
		gbc_lblDirections.gridy = 6;
		frame1.getContentPane().add(lblDirections, gbc_lblDirections);
		
		
		
		JButton btnEnterDetailsFor = new JButton("Vehicle Checkout");
		GridBagConstraints gbc_btnEnterDetailsFor = new GridBagConstraints();
		gbc_btnEnterDetailsFor.insets = new Insets(0, 0, 5, 0);
		gbc_btnEnterDetailsFor.gridx = 3;
		gbc_btnEnterDetailsFor.gridy = 8;
		frame1.getContentPane().add(btnEnterDetailsFor, gbc_btnEnterDetailsFor);
		
		
		
		btnEnterDetailsFor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				frame1.setVisible(false);
				frame2.setVisible(true);
			}
		});
		GridBagLayout gbl_contentPane2 = new GridBagLayout();
		gbl_contentPane2.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame2.getContentPane().setLayout(gbl_contentPane2);
		
		JLabel lblIdForCheckout = new JLabel("ID for Checkout");
		GridBagConstraints gbc_lblIdForCheckout = new GridBagConstraints();
		gbc_lblIdForCheckout.insets = new Insets(10, 20, 5, 5);
		gbc_lblIdForCheckout.gridx = 2;
		gbc_lblIdForCheckout.gridy = 1;
		frame2.getContentPane().add(lblIdForCheckout, gbc_lblIdForCheckout);
		
		textField_3= new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(20, 20, 25, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 1;
		frame2.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		final JLabel lblAmount = new JLabel("Amount to be paid :");
		GridBagConstraints gbc_lblAmount = new GridBagConstraints();
		gbc_lblAmount.insets = new Insets(0, 0, 5, 5);
		gbc_lblAmount.gridx = 2;
		gbc_lblAmount.gridy = 4;
		frame2.getContentPane().add(lblAmount, gbc_lblAmount);
		
		final JLabel lblAmount1 = new JLabel("");
		GridBagConstraints gbc_lblAmount1 = new GridBagConstraints();
		gbc_lblAmount1.insets = new Insets(20,0 ,5 , 5);
		gbc_lblAmount1.gridx = 3;
		gbc_lblAmount1.gridy = 4;
		frame2.getContentPane().add(lblAmount1, gbc_lblAmount1);
		
		final JLabel lblLostid = new JLabel("LostID Enter vehicle Number");
		GridBagConstraints gbc_lblLostid = new GridBagConstraints();
		gbc_lblLostid.insets = new Insets(20,0 ,5 , 5);
		gbc_lblLostid.gridx = 2;
		gbc_lblLostid.gridy = 3;
		frame2.getContentPane().add(lblLostid, gbc_lblLostid);
		
		textField_4= new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(20, 20, 25, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 3;
		frame2.getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 0);
		gbc_btnSubmit.gridx = 3;
		gbc_btnSubmit.gridy = 5;
		frame2.getContentPane().add(btnSubmit, gbc_btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s  = textField_3.getText();String j  = textField_4.getText();
				if(s.compareTo("")!=0){
				long t = Long.valueOf(s).longValue();
				amount = Gate.Checkout(t);}
					
					else if(j.compareTo("")!=0){
					long td = ParkingLotData.getIDbyVehicleNumber(j);
					amount  = Gate.Checkout(td);}
					else amount = -1;	
				if(amount == -1)
				{
					lblAmount1.setText("fake Id");
				}
			
				else lblAmount1.setText("Rs. " + Long.toString(amount));
				textField_3.setText(null);
				textField_4.setText(null);
				
			}
		});
		
		
		JButton btnAmountPaid = new JButton("Check In Vehicle");
		GridBagConstraints gbc_btnAmountPaid = new GridBagConstraints();
		gbc_btnAmountPaid.gridx = 3;
		gbc_btnAmountPaid.gridy = 7;
		frame2.getContentPane().add(btnAmountPaid, gbc_btnAmountPaid);
		
		btnAmountPaid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame2.setVisible(false);
				frame1.setVisible(true);
				
			}
		});
		
		
	}

}
