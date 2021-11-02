package zadanie;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

import javax.swing.*;

public class GraphicsClass extends JPanel implements ActionListener{
	
//	MyFrame frame = new MyFrame();
	
	int x;
	int y;
	
	JButton drawButton = new JButton("Click Me!");
	
	JLabel newLabel1 = new JLabel();
	JLabel newLabel2 = new JLabel();
	JLabel newLabel3 = new JLabel();
	JLabel newLabel4 = new JLabel();
	JLabel newLabel5 = new JLabel();
	JLabel newLabel6 = new JLabel();
	JLabel newLabel7 = new JLabel();
	
	JLabel newLabell1 = new JLabel();
	JLabel newLabell2 = new JLabel();
	JLabel newLabell3 = new JLabel();
	JLabel newLabell4 = new JLabel();
	JLabel newLabell5 = new JLabel();
	JLabel newLabell6 = new JLabel();
	JLabel newLabell7 = new JLabel();
	
	JLabel labelObwod = new JLabel();
	JLabel labelPole = new JLabel();
	
	JTextField drawTextField1 = new JTextField(20);
	JTextField drawTextField2 = new JTextField(20);
	JTextField drawTextField3 = new JTextField(20);
	JTextField drawTextField4 = new JTextField(20);
	JTextField drawTextField5 = new JTextField(20);
	JTextField drawTextField6 = new JTextField(20);
	JTextField drawTextField7 = new JTextField(20);
	JTextField drawTextField8 = new JTextField(20);
	
	JPanel panel1 = new JPanel();

	int polygon1Point1, polygon1Point2;
	int polygon2Point1, polygon2Point2;
	int polygon3Point1, polygon3Point2;
	int polygon4Point1, polygon4Point2;
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		String sx1 = drawTextField1.getText();
		String sx2 = drawTextField2.getText();
		
		String sy1 = drawTextField3.getText();
		String sy2 = drawTextField4.getText();
		
		String sx3 = drawTextField5.getText();
		String sx4 = drawTextField6.getText();
		
		String sy3 = drawTextField7.getText();
		String sy4 = drawTextField8.getText();
		

	    int polygon1Point1 = Integer.parseInt(sx1);
	    int polygon1Point2 = Integer.parseInt(sx2);
	    
	    int polygon2Point1 = Integer.parseInt(sy1);
	    int polygon2Point2 = Integer.parseInt(sy2);
	    
	    int polygon3Point1 = Integer.parseInt(sx3);
	    int polygon3Point2 = Integer.parseInt(sx4);
	    
	    int polygon4Point1 = Integer.parseInt(sy3);
	    int polygon4Point2 = Integer.parseInt(sy4);

//	    System.out.println(polygon1Point2+" przed zmianie");
//	    System.out.println(polygon2Point2+" przed zmianie");
//	    System.out.println(polygon3Point2+" przed zmianie");
//	    System.out.println(polygon4Point2+" przed zmianie");
	    
	    int helper1 = 0, helper2 = 0, helper3 = 0, helper4 = 0;
	    
	    if(polygon1Point2 == 1) {helper1 = 7;}
	    if(polygon2Point2 == 1) {helper2 = 7;}
	    if(polygon3Point2 == 1) {helper3 = 7;}
	    if(polygon4Point2 == 1) {helper4 = 7;}
	    
	    if(polygon1Point2 == 2) {helper1 = 6;}
	    if(polygon2Point2 == 2) {helper2 = 6;}
	    if(polygon3Point2 == 2) {helper3 = 6;}
	    if(polygon4Point2 == 2) {helper4 = 6;}
	    
	    if(polygon1Point2 == 3) {helper1 = 5;}
	    if(polygon2Point2 == 3) {helper2 = 5;}
	    if(polygon3Point2 == 3) {helper3 = 5;}
	    if(polygon4Point2 == 3) {helper4 = 5;}
	    
	    if(polygon1Point2 == 4) {helper1 = 4;}
	    if(polygon2Point2 == 4) {helper2 = 4;}
	    if(polygon3Point2 == 4) {helper3 = 4;}
	    if(polygon4Point2 == 4) {helper4 = 4;}
	    
	    if(polygon1Point2 == 5) {helper1 = 3;}
	    if(polygon2Point2 == 5) {helper2 = 3;}
	    if(polygon3Point2 == 5) {helper3 = 3;}
	    if(polygon4Point2 == 5) {helper4 = 3;}
	    
	    if(polygon1Point2 == 6) {helper1 = 2;}
	    if(polygon2Point2 == 6) {helper2 = 2;}
	    if(polygon3Point2 == 6) {helper3 = 2;}
	    if(polygon4Point2 == 6) {helper4 = 2;}
	    
	    if(polygon1Point2 == 7) {helper1 = 1;}
	    if(polygon2Point2 == 7) {helper2 = 1;}
	    if(polygon3Point2 == 7) {helper3 = 1;}
	    if(polygon4Point2 == 7) {helper4 = 1;}
	    
//	    System.out.println(polygon1Point2+" po zmianie");
//	    System.out.println(polygon2Point2+" po zmianie");
//	    System.out.println(polygon3Point2+" po zmianie");
//	    System.out.println(polygon4Point2+" po zmianie");
	    
	    double obwod = 0;
	    
	    double podstawa = 0;
	    double sufit = 0;
	    double wysokosc = 0;
	    double pole = 0;
	    double ramie1 = 0;
	    double ramie2 = 0;
	    
	    setLine(getGraphics(), 
	    		polygon1Point1*x/8+20, helper1*y/8-20,
	    		polygon2Point1*x/8+20, helper2*y/8-20,
	    		polygon3Point1*x/8+20, helper3*y/8-20,
	    		polygon4Point1*x/8+20, helper4*y/8-20
	    		);
	   
	    sufit = polygon3Point1 - polygon2Point1;
	    podstawa = polygon4Point1 - polygon1Point1;
	    wysokosc = helper1 - helper2;
	    
	    
	    pole = (podstawa + sufit)*wysokosc/2; 
	    
	    ramie1 = (wysokosc*wysokosc) + ((polygon2Point1-polygon1Point1)*(polygon2Point1-polygon1Point1));
	    ramie1 = Math.pow(ramie1, 1.0/2.0);
	    String ramie1S = String.valueOf(ramie1);
	    ramie1S = new DecimalFormat("##.##").format(ramie1);
	    ramie1 = Double.parseDouble(ramie1S);
	    
	    ramie2 = (wysokosc*wysokosc) + ((polygon4Point1-polygon3Point1)*(polygon4Point1-polygon3Point1));
	    ramie2 = Math.pow(ramie2, 1.0/2.0);
	    String ramie2S = String.valueOf(ramie2);
	    ramie2S = new DecimalFormat("##.##").format(ramie2);
	    ramie2 = Double.parseDouble(ramie2S);
	    
	    
	    
	    obwod = podstawa + sufit + ramie1 + ramie2;
	    
	    labelObwod.setText("Obwód = "+obwod);
	    labelPole.setText("Pole = "+pole);
	    //koniec przycisku
//	    repaint();
	}

	public void paintComponent(Graphics g) {
		
		x = getSize().width-1;
		y = getSize().height-1;
		
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(Color.BLACK);
		
		
		panel1 = new JPanel();
		panel1.setBackground(Color.GRAY);
//		drawButton = new JButton();
		drawButton.setBounds(0,150,100,40);
		
//		g2D.drawLine(xStart, yStart, xEnd, yEnd);


//		  System.out.print(x/8+" ");
//		  System.out.print(y/8);
		  
		  // X labels
		  newLabel1.setBounds(x/8+143, -19, 50, 50);
		  newLabel1.setText("1");
		  newLabel1.setForeground(Color.RED);
		  
		  newLabel2.setBounds(x*375/1000+143, -19, 50, 50);
		  newLabel2.setText("3");
		  newLabel2.setForeground(Color.RED);
		  
		  newLabel3.setBounds(x/4+143, -19, 50, 50);
		  newLabel3.setText("2");
		  newLabel3.setForeground(Color.RED);
		  
		  newLabel4.setBounds(x/2+143, -19, 50, 50);
		  newLabel4.setText("4");
		  newLabel4.setForeground(Color.RED);
		  
		  newLabel5.setBounds(x*625/1000+143, -19, 50, 50);
		  newLabel5.setText("5");
		  newLabel5.setForeground(Color.RED);
		  
		  newLabel6.setBounds(x*750/1000+143, -19, 50, 50);
		  newLabel6.setText("6");
		  newLabel6.setForeground(Color.RED);
		  
		  newLabel7.setBounds(x*875/1000+143, -19, 50, 50);
		  newLabel7.setText("7");
		  newLabel7.setForeground(Color.RED);
		  
		  //Y labels
		  newLabell1.setBounds(133, y*750/1000-45, 50, 50);
		  newLabell1.setText("2");
		  newLabell1.setForeground(Color.RED);
		  
		  newLabell2.setBounds(133, y*375/1000-45, 50, 50);
		  newLabell2.setText("5");
		  newLabell2.setForeground(Color.RED);
		  
		  newLabell3.setBounds(133, y*125/1000-45, 50, 50);
		  newLabell3.setText("7");
		  newLabell3.setForeground(Color.RED);
		  
		  newLabell4.setBounds(133, y/2-45, 50, 50);
		  newLabell4.setText("4");
		  newLabell4.setForeground(Color.RED);
		  
		  newLabell5.setBounds(133, y*625/1000-45, 50, 50);
		  newLabell5.setText("3");
		  newLabell5.setForeground(Color.RED);
		  
		  newLabell6.setBounds(133, y/4-45, 50, 50);
		  newLabell6.setText("6");
		  newLabell6.setForeground(Color.RED);
		  
		  newLabell7.setBounds(133, y*875/1000-45, 50, 50);
		  newLabell7.setText("1");
		  newLabell7.setForeground(Color.RED);
		  //x and y lines
		  g2D.drawLine(20, 0, 20, y-20);
		  g2D.drawLine(20, y-20, x, y-20);
		  //all of x lines
		  g2D.drawLine(20, y/8-20, x-20, y/8-20);
		  g2D.drawLine(20, y/4-20, x-20, y/4-20);  
		  g2D.drawLine(20, y*375/1000-20, x-20, y*375/1000-20);
		  g2D.drawLine(20, y/2-20, x-20, y/2-20);
		  g2D.drawLine(20, y*625/1000-20, x-20, y*625/1000-20);
		  g2D.drawLine(20, y*75/100-20, x-20, y*75/100-20);
		  g2D.drawLine(20, y*875/1000-20, x-20, y*875/1000-20);
		  //all of y lines
		  g2D.drawLine(x/8+20, 20, x/8+20, y-20); // 1
		  g2D.drawLine(x/4+20, 20, x/4+20, y-20);  // 2
		  g2D.drawLine(x*375/1000+20, 20, x*375/1000+20, y-20); // 3
		  g2D.drawLine(x/2+20, 20, x/2+20, y-20); // 4
		  g2D.drawLine(x*625/1000+20, 20, x*625/1000+20, y-20); // 5
		  g2D.drawLine(x*75/100+20, 20, x*75/100+20, y-20); // 6
		  g2D.drawLine(x*875/1000+20, 20, x*875/1000+20, y-20); // 7
		  
		  
		  
//		  Polygon polygon = new Polygon();
//		  
//		  System.out.println(x);
//		  System.out.println(y);
//		  
//		  polygon.addPoint(x/8+20, y*75/100-20);
//		  polygon.addPoint(x/4+20, y/2-20);
//		  polygon.addPoint(x/2+20, y/2-20);
//		  polygon.addPoint(x*625/1000+20, y*75/100-20);
//		  
//		  g2D.setStroke(new BasicStroke(2));
//		  g2D.setColor(Color.BLUE);
//		  g2D.drawPolygon(polygon);
		  // Add more points...
		 
		  // to draw a filled round rectangle use : g2d.fillPolygon(polygon) instead
//		 
		  
		  drawButton.addActionListener(this);
//		  drawTextField4.addActionListener(this);
//		  drawTextField3.addActionListener(this);
//		  drawTextField2.addActionListener(this);
//		  drawTextField1.addActionListener(this);

//			Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
//			if(sx1.equals("") && sx2.equals("") && sy1.equals("") && sy2.equals("")) {
//				System.out.println("Please enter values");}
//			else {
//				if(pattern.matcher(sx1).matches() && pattern.matcher(sx2).matches() && pattern.matcher(sy1).matches() && pattern.matcher(sy2).matches()) 
//				{
//					x1 = Integer.parseInt(sx1);
//					x2 = Integer.parseInt(sx2);
//					y1 = Integer.parseInt(sy1);
//					y2 = Integer.parseInt(sy2);
//					setLine(getGraphics(), x1, y1, x2, y2);
////					  drawTextField1.setText("");
////					  drawTextField2.setText("");
////					  drawTextField3.setText("");
////					  drawTextField4.setText("");
//				  }
//			}
	}
	
	
//	void getInts(String sx1, String sx2, String sy1, String sy2) {
//		
//		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
//		int x = getSize().width-1;
//		int y = getSize().height-1;
//		System.out.println(x/2+" x");
//		System.out.println(y/2+" y");
//		if(sx1 != null && sx2 != null && sy1 != null && sy2 != null) {
//			if(sx1.equals("") && sx2.equals("") && sy1.equals("") && sy2.equals("")) {
//				System.out.println("Please enter values");}
//			else {
//				if(pattern.matcher(sx1).matches() && pattern.matcher(sx2).matches() && pattern.matcher(sy1).matches() && pattern.matcher(sy2).matches()) {
//					int x1 = Integer.parseInt(sx1);
//					int x2 = Integer.parseInt(sx2);
//					int y1 = Integer.parseInt(sy1);
//					int y2 = Integer.parseInt(sy2);
//					System.out.println(x1*(x/8)+" x");
//					System.out.println(y-y1*(y/8)+" y");
//					System.out.println(x2*(x/8)+" x");
//					System.out.println(y-y2*(y/8)+" y");
//					setLine(getGraphics(), x1, y1, x2, y2);
					
	//				  drawTextField1.setText("");
	//				  drawTextField2.setText("");
	//				  drawTextField3.setText("");
	//				  drawTextField4.setText("");
//				  }
//	
//			  }
//		}
//	}
//	
	public void setLine(Graphics g, int px1, int px2, int py1, int py2, int pz1, int pz2, int pv1, int pv2 ) {
		
		
		g.setColor(Color.RED);
		((Graphics2D) g).setStroke(new BasicStroke(2));
		Polygon polygon = new Polygon();
		polygon.addPoint(px1, px2);
		polygon.addPoint(py1, py2);
		polygon.addPoint(pz1, pz2);
		polygon.addPoint(pv1, pv2);
		g.drawPolygon(polygon);
//		repaint();
				  
//		polygon.addPoint(x/6, x/3); 
//		polygon.addPoint(x/2, y/6); 
//		polygon.addPoint(x/15*2, y/55*7); 
//		polygon.addPoint(x/45*6, y/35*2);
//		g.drawPolygon(polygon);
		  // Add more points...
		  // to draw a filled round rectangle use : g2d.fillPolygon(polygon) instead

	}
}
