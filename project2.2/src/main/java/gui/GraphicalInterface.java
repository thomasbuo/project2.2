package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTabbedPane;

public class GraphicalInterface extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	

	/**
	 * Create the frame.
	 */
	public GraphicalInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1059, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(850, 22, 184, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton start_button = new JButton("Start");
		start_button.setBounds(10, 11, 164, 33);
		panel.add(start_button);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 128, 164, 352);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Car", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Road", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Intersection", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Signs", null, panel_5, null);
		
		SaveButton sb = new SaveButton();
		//LoadButton lb = new LoadButton();
		
		JButton save_button = new JButton("Save");
		save_button.setBounds(95, 55, 79, 23);
		panel.add(save_button);
		save_button.addActionListener(sb);
		
		JButton load_button = new JButton("Load");
		load_button.setBounds(10, 55, 79, 23);
		panel.add(load_button);
		//load_button.addActionListener(lb);
		
		
		
		JButton reset_button = new JButton("Reset");
		reset_button.setBounds(49, 94, 89, 23);
		panel.add(reset_button);
		//reset_button.addActionListener(lb);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 22, 830, 491);
		contentPane.add(panel_1);
	}
	
	private class LoadButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Loading");
		JFrame frame2 = new JFrame("loading");
		frame2.setVisible(true);
		frame2.setSize(200, 200);
		JLabel label = new JLabel("loading");
		JPanel panel = new JPanel();
		frame2.add(panel);
		panel.add(label);
			
		}
		
	}
	private class SaveButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("saving");
		JFrame frame3 = new JFrame("saving");
		frame3.setVisible(true);
		frame3.setSize(200, 200);
		JLabel label1 = new JLabel("saving");
		JPanel panel1 = new JPanel();
		frame3.add(panel1);
		panel1.add(label1);
			
		}
		
	}
	private class ResetButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("resettin");
			JFrame frame4 = new JFrame("resetting");
		frame4.setVisible(true);
		frame4.setSize(200, 200);
		JLabel label2 = new JLabel("resetting");
		JPanel panel2 = new JPanel();
		frame4.add(panel2);
		panel2.add(label2);
			
		}
		
	}
	

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}