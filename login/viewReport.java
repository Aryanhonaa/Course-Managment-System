package login;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class viewReport extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;

	private JTable table_2;
	private JTable model1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewReport frame = new viewReport();
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
	public viewReport() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 830);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		 setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(129, 180, 120, 60);
		contentPane.add(lblNewLabel);
		
		id = new JTextField();
		id.setBounds(253, 200, 300, 25);
		contentPane.add(id);
		id.setColumns(10);
		DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STUDENT_ID", "USERNAME", "MODULE", "PERCENTAGE", "GRADE"
			}
		);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 320, 600, 310);
		contentPane.add(scrollPane);

		model1 = new JTable();
		scrollPane.setViewportView(model1);
		model1.setModel(model);

		
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(398, 250, 95, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				  int Id = Integer.parseInt(id.getText());
				updateStudents rr=new updateStudents();
				rr.showReport(Id,model);
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("REPORT\r\n");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 33));
		lblNewLabel_1.setBounds(288, 57, 224, 43);
		contentPane.add(lblNewLabel_1);
		
		
		
		
	}
}
