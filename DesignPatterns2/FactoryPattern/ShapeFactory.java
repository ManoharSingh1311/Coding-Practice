package DesignPatterns2.FactoryPattern;

public class ShapeFactory 
{
    Shape getShape(String str){
        switch(str)
        {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
