package model;

import java.util.Scanner;

public class Unmanned extends Spacecraft{

    private String mision;

    

    public Unmanned() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuerpo celeste de la misión: ");
        this.mision = sc.nextLine();
    }

    @Override
    public void accelerate() {
        while(this.fuelLevel > 0){
            this.speed += ((this.getMaxtThrust() - this.getWeight()) * 9.8 /this.getWeight())* 10;
            this.fuelLevel -= 1;
        }
        if(this.fuelLevel <= 0){
            System.out.println("Combustible agotado\n" + this.getSpeed());
        }
    }

    @Override
    public void decelerate() {
        while(this.fuelLevel > 0){
            this.speed += ((this.getMaxtThrust() - this.getWeight()) * 9.8 /this.getWeight())* 10;
            this.fuelLevel -= 1;
        }
        if(this.fuelLevel <= 0){
            System.out.println("Combustible agotado\n" + this.getSpeed());
        }
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("MENU\n1. Acelerar\n2. Bajar velocidad\n3. Status de la misión.\n4. Objetivo de la misión\n0. Salir");
        int op = sc.nextInt();
        while(op !=0){
            switch (op) {
                case 1:
                    this.accelerate();
                    break;

                case 2:
                    this.decelerate();
                    break;

                case 3:
                    this.sendMessage();
                    break;
            
                default:
                System.out.println("Seleccione un opción valida.");
                    break;
            }
            System.out.println("MENU\n1. Acelerar\n2. Bajar velocidad\n3. Status de la misión.\n4. Objetivo de la misión\n0. Salir");
            op = sc.nextInt();
        }
        
    }
}
