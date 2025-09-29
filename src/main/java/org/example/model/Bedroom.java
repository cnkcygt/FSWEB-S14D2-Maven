package org.example.model;

public class Bedroom extends Room {
    private Room room;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4, ceiling);
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Bedroom{\n name: " + getName() + ", " +
                "\n wall1: " + getWall1().getDirection() + ", " +
                "\n wall2: " + getWall2().getDirection() + ", " +
                "\n wall3: " + getWall3().getDirection() + ", " +
                "\n wall4: " + getWall4().getDirection() + ", " +
                "\n ceiling: " + getCeiling() + ", " +
                "\n bed: " + bed + ", " +
                "\n lamp: " + lamp + ", " +
                "\n wardrobe: " + wardrobe + ", " +
                "\n carpet: " + carpet +
                "}";
    }
}
