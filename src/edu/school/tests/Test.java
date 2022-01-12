package edu.school.tests;

import java.awt.Desktop;
import java.awt.Color;
import java.io.*;

import edu.school.models.SVGLine;
import edu.school.models.SVGPicture;
import edu.school.models.SVGCircle;
import edu.school.models.SvgRectangle;
import edu.school.models.SvgEllipse;
import edu.school.models.SvgPolygon;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SVGPicture pic = new SVGPicture();
		pic.add(new SVGLine(Color.magenta, 8, 10, 10, 180, 250));
		pic.add(new SVGLine(Color.red, 1, 280, 10, 0, 368));
		pic.add(new SVGCircle(Color.blue, 2, Color.red, 300, 150, 60));
		pic.add(new SvgRectangle(Color.green, 5, Color.red, 150, 300, 70, 90));
		pic.add(new SvgEllipse(Color.yellow, 3, Color.black, 390, 300, 140, 20));
		pic.add(new SvgPolygon(Color.red, 3, Color.yellow, 100, 10, 40, 198, 190, 78, 10, 78, 160, 198));
		
		pic.saveToFile("D:\\test2.svg");

		//Тук си играх и направих файлът да се отваря автоматично, само трябва да му се зададе default браузър 
		//с който да отвори снимката. Ако нещо не работи може да го махнете и би трябвало всичко да е ОК
		File file = new File("D:\\test2.svg");   
		Desktop desktop = Desktop.getDesktop();   
		try {
			if(!Desktop.isDesktopSupported()){  
				System.out.println("Platform not supported");  
				return;  
			}  

			if(file.exists()){  
				desktop.open(file); 
			}
		} catch (Exception e) {
			e.printStackTrace();  
		}
	}

}
