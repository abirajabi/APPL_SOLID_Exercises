package com.company;

import com.company.Models.Circle;
import com.company.Models.GraphicEditor;
import com.company.Models.Rectangle;
import com.company.Models.Square;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Square square = new Square();

        GraphicEditor editor = new GraphicEditor();
        editor.DrawShape(circle);
        editor.DrawShape(rect);
        editor.DrawShape(square);
    }
}
