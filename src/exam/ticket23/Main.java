package exam.ticket23;

import java.awt.*;
import java.lang.Object;

public class Main {
    public static void main(String[] args) {
        IFigureFactory figureFactory = new ConcreteFigureFactory();

        IGeometricFigure circle = figureFactory.createCircle();
        System.out.println(circle.square());
//        Circle circle = figureFactory.createCircle();
//        Rectangle rectangle = figureFactory.createRectangle();
//        circle.setColor(Color.cyan);
//        circle.setRadius(30);
//        System.out.println("Circle: ");
//        System.out.println("Color: " + circle.getColor());
//        System.out.println("Radius: " + circle.getRadius());
//        System.out.println("Perimeter: " + circle.perimeter());
//        System.out.println("Square: " + circle.square());
//        System.out.println("Rectangle: ");
//        System.out.println("Perimeter: " + rectangle.perimeter());
//        System.out.println("Square: " + rectangle.square());
        
    }
}
