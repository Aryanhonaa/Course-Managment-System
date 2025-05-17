package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Report extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JTextField course;
	private JTextField percentage;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 752);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 102));
		contentPane.setForeground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		id = new JTextField();
		id.setBounds(186, 142, 224, 39);
		contentPane.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(186, 211, 224, 39);
		contentPane.add(name);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBounds(186, 288, 224, 39);
		contentPane.add(course);
		
		percentage = new JTextField();
		percentage.setColumns(10);
		percentage.setBounds(186, 369, 224, 39);
		contentPane.add(percentage);
		
		grade = 	new JTextField();
		grade.setColumns(10);
		grade.setBounds(186, 445, 224, 39);
		contentPane.add(grade);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
		        	try {
		        		int Id = Integer.parseInt(id.getText());
			            String userText = name.getText().toUpperCase();
			            String courseText=course.getText().toUpperCase();
			            String percentText=percentage.getText().toUpperCase();
			            String gradeText=grade.getText().toUpperCase();

			            if(userText.isEmpty()||courseText.isEmpty()||percentText.isEmpty()||percentText.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Invalid input","Error", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			               
			                updateTutors co = new updateTutors();
			                co.reportStatus(Id,userText,courseText,percentText,gradeText);
			            }
			        } catch (NumberFormatException ex) {
			            // Handle the case where the input string is not a valid integer
			            JOptionPane.showMessageDialog(null, "Invalid Input ", "404 Error", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnNewButton.setBounds(150, 534, 129, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(44, 148, 129, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserName.setBounds(47, 211, 129, 26);
		contentPane.add(lblUserName);
		
		JLabel lblCourse = new JLabel("Module Name\r\n");
		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCourse.setBounds(47, 289, 129, 26);
		contentPane.add(lblCourse);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPercentage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPercentage.setBounds(44, 372, 129, 26);
		contentPane.add(lblPercentage);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGrade.setBounds(44, 445, 129, 26);
		contentPane.add(lblGrade);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutors uu=new Tutors();
				uu.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBounds(320, 534, 129, 39);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Report\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_1.setBounds(114, 33, 332, 39);
		contentPane.add(lblNewLabel_1);
	}
}
