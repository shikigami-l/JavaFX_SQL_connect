package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.St_controller;
import modal.St_DAO;
import modal.St_modal;

public class St_view {
	
	St_view()
	{
		JLabel l1 = new JLabel("ID");
		JTextField tf1 = new JTextField(30);
		JLabel l2 = new JLabel("Name");
		JTextField tf2 = new JTextField(30);
		JLabel l3 = new JLabel("Mark");
		JTextField tf3 = new JTextField(30);
		JLabel l4 = new JLabel("Grade");
		JTextField tf4 = new JTextField(30);
		
		JButton b1 = new JButton("Submit");
		JPanel jp = new JPanel();
		jp.add(l1);
		jp.add(tf1);
		jp.add(l2);
		jp.add(tf2);
		jp.add(l3);
		jp.add(tf3);
		jp.add(l4);
		jp.add(tf4);
		jp.add(b1);
		JFrame f = new JFrame();
		f.add(jp);
		f.setVisible(true);
		f.setSize(400,500);
		//f.setLocationRelativeTo(null);
		
		b1.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
					St_modal sm = new St_modal();
					sm.setID(Integer.parseInt(tf1.getText()));
					sm.setName(tf2.getText());
					sm.setMarks(Integer.parseInt(tf3.getText()));
					
					St_controller ctrl = new St_controller();
					tf4.setText(ctrl.cal_grade(sm.getMarks()));
					sm.setGrade(tf4.getText());
					
					St_DAO db = new St_DAO();
					try 
					{
						db.insert_data(sm);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();					
					}
					
				}
				}
		);
		
	}
	
	public static void main(String[] args)
	{
		St_view v = new St_view();
	}
	
}
