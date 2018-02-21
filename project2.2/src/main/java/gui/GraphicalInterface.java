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
	 * Launch the application.
	 */

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
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(10, 11, 164, 33);
		panel.add(btnStart);
		
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
		
		JButton load_button = new JButton("Load");
		load_button.setBounds(10, 55, 79, 23);
		panel.add(load_button);
		load_button.addActionListener(new LoadButton());
		
		JButton save_button = new JButton("Save");
		save_button.setBounds(95, 55, 79, 23);
		panel.add(save_button);
		
		JButton reset_button = new JButton("Reset");
		reset_button.setBounds(49, 94, 89, 23);
		panel.add(reset_button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 22, 830, 491);
		contentPane.add(panel_1);
	}
	
	private class LoadButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
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
			//do something
			
		}
		
	}
	private class ResetButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//do something
			
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