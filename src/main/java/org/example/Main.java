package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("Left");
        Wall wall2 = new Wall("Right");
        Wall wall3 = new Wall("Front");
        Wall wall4 = new Wall("Back");
        Ceiling ceiling = new Ceiling(10, PaintColor.RED);
        Bed bed = new Bed("Normal", 2, 20, 1, 1);
        Lamp lamp = new Lamp(LampType.LAVA, true, 21);
        Wardrobe wardrobe = new Wardrobe(15, 12, 8.5);
        Carpet carpet = new Carpet(18, 19, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom("Parents Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);
        System.out.println(bedroom);

        System.out.println("---------- METHOD ACCESS ----------");
        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getCarpet());
        System.out.println(bedroom.getLamp());
        System.out.println(bedroom.getCeiling());
        System.out.println(bedroom.getName());
        System.out.println(bedroom.getWall1());
        System.out.println(bedroom.getWall2());
        System.out.println(bedroom.getWall3());
        System.out.println(bedroom.getWall4());
        System.out.println(bedroom.getWardrobe());
    }
}