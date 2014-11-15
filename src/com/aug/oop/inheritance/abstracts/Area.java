package com.aug.oop.inheritance.abstracts;

/**
 * Created by amanurat on 11/14/14 AD.
 */
public class Area {


    public Area() {

        calculate();

    }

    public static void main(String[] args) {

        new Area();

//        com.aug.oop.inheritance.abstracts.Area area = new com.aug.oop.inheritance.abstracts.Area();
//        area.calculate();

    }

    private void calculate() {

        Rectangle rectangle = new Rectangle(2,2);
        double areaResult = rectangle.area();

        System.out.println("com.aug.oop.inheritance.abstracts.Rectangle area is : "+ areaResult);
    }

}
