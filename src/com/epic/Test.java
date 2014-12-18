package com.epic;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
//		System.out.println('b');
//		printWellOrdered(0, 0, 3);
//		print(0, 0, 4, 1, false, true);
		printWellOrderedString("", 0, 4);
		// TODO Auto-generated method stub
		
//		double b = 999999;
//		System.out.println(b + "");
//		
//		double insideCount2 = 29;
//		double insideCount = 98;
//
//		double divInside = (insideCount2 - insideCount)/ insideCount;
//		System.out.println(divInside);
//		System.out.println(divInside * 100);
//		double prcnt = ((insideCount2 - insideCount) * 100)/insideCount;
//		System.out.println(prcnt);
		
//		JDialog dialog = new JDialog(new JFrame(), "Status");
//		dialog.setSize(100, 100);
////		dialog.
//		dialog.show();
		
		
//		JFrame frame = new JFrame();
//		JLabel label = new JLabel();
//		frame.setSize(200, 200);
//		frame.setLocation(200, 200);
//		frame.setVisible(true);
//		label.setText("Hi");
//		frame.add(label);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		label.setBorder(new EmptyBorder(20, 20, 20, 20));
//		
//		Thread.sleep(1000);
//		label.setText("Hi111111");
//		frame.setUndecorated(true);
		
		
		
		
//		JDialog dialog = new JDialog(new JFrame(), "Status");
//        JLabel label = new JLabel("blah blah");
//        JPanel panel = new JPanel();
//        panel.setPreferredSize(new Dimension(500, 100));
//        panel.add(label);
//        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
//        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
//        dialog.add(panel);
//        dialog.pack();
//        dialog.setVisible(true);
//        dialog.setLocation(400, 300);
	}
	
	
	private static void printWellOrdered(int number, int prev, int n) {

		if(n==0){
		System.out.println(number);
		return;
		}

		for(int i=(prev+1); i<(11-n); i++){
		printWellOrdered(number*10 + i, i, n-1) ;
		}

		}

	
	private static void print(int number, int prev, int n, int start, boolean starts4, boolean firstTime) {

		if(n==0){
		System.out.println(number);
		return;
		}
		for(int i=start; i<=9; i++){
			if (i != 2 && i != 7 && i !=9) {
				if (firstTime && i == 4) {
					print(number*10 + i, i, n-1, 0, true, false);
				} else {
					if ((n - 1) == 0 && starts4) {
						if (prev != i && i == 4)
							print(number*10 + i, i, n-1, 0, starts4, false);
					} else if (prev != i)
					print(number*10 + i, i, n-1, 0, starts4, false);
				}
			}
			
		}

	}
	
	
	private static void printWellOrderedString(String number, int prev, int n) {

		if(n==0){
		System.out.println(number);
		return;
		}

		for(int i=prev; i<(27-n); i++){
			char value = (char)('a' + i);
			printWellOrderedString(number + value, i+1, n-1) ;
			
			char value1 = (char)('A' + i);
			printWellOrderedString(number + value1, i+1, n-1) ;
		}

		}


}
