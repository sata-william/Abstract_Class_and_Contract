package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities_enum.Color;

public class Program {
public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number os shapes: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Shape #" +(i+1) + "data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();				
				Shape shape = new Retangle(color, width, height);
				list.add(shape);
				} if (ch == 'c') {
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					Shape shape = new Circle(color, radius);
					list.add(shape);
					}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));		
		}
		
		sc.close();		
		
	}
}
