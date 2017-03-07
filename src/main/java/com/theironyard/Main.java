package com.theironyard;

/**
 * For this exercise you will create a class named Volume that contains methods
 * to calculate the volume of 3D shapes. Start by following the instructions in
 * the Volume class.
 *
 * In this Main class write a main method that invokes each of Volume class'
 * methods.
 */
public class Main {

    // todo: create a main() method that invokes each of the methods in the Volume class
    public static void main(String[] args) {
        Volume volume = new Volume();

        double cube = Volume.cube(4.5);
        double cone = Volume.cone(5.2,1.0);
        double sphere = Volume.sphere(5.5);
    }
}
