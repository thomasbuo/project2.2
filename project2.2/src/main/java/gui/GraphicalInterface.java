package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
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
		
		JButton btnNewButton = new JButton("Load");
		btnNewButton.setBounds(10, 55, 79, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(95, 55, 79, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setBounds(49, 94, 89, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 22, 830, 491);
		contentPane.add(panel_1);
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