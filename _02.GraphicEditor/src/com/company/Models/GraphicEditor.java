package com.company.Models;

import com.company.Interfaces.IShape;

public class GraphicEditor {
    public void DrawShape (IShape shape){
        System.out.println(shape.draw());
    }
}
