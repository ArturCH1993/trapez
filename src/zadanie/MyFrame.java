package zadanie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame {
	
	GraphicsClass graph = new GraphicsClass();
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JTextField textField4;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;

	
	
	

	
	public MyFrame() {
		

		
		//setting up user interface
		label1 = new JLabel();
		label1.setBounds(5, 18, 300, 20);
		label1.setText("Linia 1:");
		graph.drawTextField1 = new JTextField(20);
		
		label2 = new JLabel();
		label2.setBounds(5, 48, 300, 20);
		label2.setText("Linia 2:");
		graph.drawTextField2 = new JTextField(20);
		
		label3 = new JLabel();
		label3.setBounds(5, 78, 300, 20);
		label3.setText("Linia 3:");
		graph.drawTextField3 = new JTextField(20);
		
		label4 = new JLabel();
		label4.setBounds(5, 108, 300, 20);
		label4.setText("Linia 4:");
		
		graph.labelObwod.setBounds(15, 250, 300, 20);
		graph.labelObwod.setText("Obwód = ");
		
		graph.labelPole.setBounds(15, 230, 300, 20);
		graph.labelPole.setText("Pole = ");
		
		graph.drawTextField4 = new JTextField(20);
		graph.drawTextField8 = new JTextField(20);
		graph.drawTextField5 = new JTextField(20);
		graph.drawTextField6 = new JTextField(20);
		graph.drawTextField7 = new JTextField(20);
		
		
		label5 = new JLabel();
		label5.setBounds(60, 0, 30, 20);
		label5.setText("X");
		
		label6 = new JLabel();
		label6.setBounds(95, 0, 30, 20);
		label6.setText("Y");
		
		graph.drawTextField1.setBounds(50,20,30,20);
		graph.drawTextField2.setBounds(85,20,30,20);
		
		graph.drawTextField3.setBounds(50,50,30,20);
		graph.drawTextField4.setBounds(85,50,30,20);
		
		graph.drawTextField5.setBounds(50,80,30,20);
		graph.drawTextField6.setBounds(85,80,30,20);
		
		graph.drawTextField7.setBounds(50,110,30,20);
		graph.drawTextField8.setBounds(85,110,30,20);

		
		this.setSize(717, 640);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		this.add(label6);

		this.add(graph.drawTextField1);
		this.add(graph.drawTextField2);
		this.add(graph.drawTextField3);
		this.add(graph.drawTextField4);
		this.add(graph.drawTextField5);
		this.add(graph.drawTextField6);
		this.add(graph.drawTextField7);
		this.add(graph.drawTextField8);
		this.add(graph.drawButton);

		this.add(graph.labelObwod);
		this.add(graph.labelPole);
		
		this.add(graph.newLabel1);
		this.add(graph.newLabel2);
		this.add(graph.newLabel3);
		this.add(graph.newLabel4);
		this.add(graph.newLabel5);
		this.add(graph.newLabel6);
		this.add(graph.newLabel7);

		this.add(graph.newLabell1);
		this.add(graph.newLabell2);
		this.add(graph.newLabell3);
		this.add(graph.newLabell4);
		this.add(graph.newLabell5);
		this.add(graph.newLabell6);
		this.add(graph.newLabell7);
		
		this.add(graph);
		this.add(graph.panel1, BorderLayout.WEST);
		graph.panel1.setPreferredSize(new Dimension(125,100));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
//		int x = getSize().width-1;
//		int y = getSize().height-1;
//		System.out.println(x/2);
		  
		  
//		label5.setBounds(x/2, y/2, 50, 50);
//		label5.setForeground(Color.WHITE);
//		this.add(label5);
		  
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//		String sx1 = graph.drawTextField1.getText();
//		String sx2 = graph.drawTextField2.getText();
//		String sy1 = graph.drawTextField3.getText();
//		String sy2 = graph.drawTextField4.getText();
//		graph.getInts(sx1, sx2, sy1, sy2);
//
//		
//		String xome = graph.drawTextField1.getText();
//		System.out.println("My Frame " + xome);
//		
//		
//		
//		graph.drawTextField1.setText("");
//		graph.drawTextField2.setText("");
//		graph.drawTextField3.setText("");
//		graph.drawTextField4.setText("");
////	    int x1 = Integer.parseInt(sx1);
////	    int x2 = Integer.parseInt(sx2);
////	    int y1 = Integer.parseInt(sy1);
////	    int y2 = Integer.parseInt(sy2);
////		graph.setLine(getGraphics(), x1, y1, x2, y2);
//		
//	}
}
