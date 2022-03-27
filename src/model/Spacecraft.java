package model;

import java.util.Scanner;

public abstract class Spacecraft {
    
    private String name;
    private double weight;
    private double maxtThrust;
    protected double speed;
    protected double fuelLevel;
    private String fuelType;

    public Spacecraft() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos");
        System.out.println("Nombre: ");
        this.name = sc.nextLine();
        System.out.println("Peso [Ton]: ");
        this.weight = sc.nextDouble();        
        System.out.println("Empuje Maximo [Ton]: ");
        this.maxtThrust = sc.nextDouble();

        this.speed = 0;
        this.fuelLevel = 100;
    }


    public abstract void accelerate();
    public abstract void decelerate();
    public abstract void showMenu();

    public  String sendMessage(){
        return "Nombre: " + name + "\nVelocidad: " + this.getSpeed() + "\nPorcentaje combustible: " + fuelLevel + "%"; 
    };

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight <= 0){
            System.out.println("El peso debe ser mayor a 0");
        }else{
            this.weight = weight;
        }
    }

    public double getMaxtThrust() {
        return maxtThrust;
    }

    public void setMaxtThrust(double maxtThrust) {
        if (maxtThrust <= 0) {
            System.out.println("El empuje maximo debe ser mayor a 0");
        } else {
            this.maxtThrust = maxtThrust;
        }
    }

    

    public String getSpeed() {
        return "Velocidad: " + (int)this.speed +" Km/s";
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}