package com.lambda;


public class Lamda {
	
	public void calculateArea(Area area, int sides) {
        area.calculateArea(sides);
    }

    public static void main(String[] args) {
        Lamda obj = new Lamda();
        obj.calculateArea((sides) -> {System.out.println(sides * sides);}, 5);
    }

}
