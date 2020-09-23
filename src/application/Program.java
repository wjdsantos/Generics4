package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(3.0));
		myCircles.add(new Circle(4.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area: " + totalArea(myCircles));
		
	}
	
	//Foi necess�ria uma altera��o nos parametros do List na fun��o totalArea, pois n�o funciona se for do tipo Shape para a lista myCircle
	//N�o poderia ser somente "?" porque ainda ocorre um erro de conver��o
	//Ent�o � necess�rio fazer como abaixo, onde funciona tanto para myShapes como para myCircle
	//Por�m n�o � poss�vel adicionar qualquer item na lista
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
