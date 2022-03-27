package model;

import java.util.Scanner;

public class Shuttle extends Spacecraft{
    private int payLoad;
    private int height;

    
    public Shuttle() {
        super();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Carga util [Ton]: ");
            this.payLoad = sc.nextInt();
            if(payLoad >= (this.getMaxtThrust() - this.getWeight())){
                System.out.println("La carga util es muy alta.");
            }
        } while (payLoad >= (this.getMaxtThrust() - this.getWeight()));
        
        System.out.println("Altura [m]: ");
        this.height = sc.nextInt();
    }

    @Override
    public void accelerate() {
        while(this.fuelLevel > 0){
            this.speed += ((this.getMaxtThrust() - this.getWeight()) * 9.8 /this.getWeight())* 60;
            this.fuelLevel -= 10;
        }
        if(this.fuelLevel <= 0){
            System.out.println("Combustible agotado\n" + this.getSpeed());
        }
    }

    @Override
    public void decelerate() {
        if(this.speed > 0){
            this.speed -=  (9.8 * 60) / 1000;
        }
        else{
            System.out.println(this.getSpeed());
        }
    }


    public double getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        if(payLoad >= (this.getMaxtThrust() - this.getWeight())){
            System.out.println("La carga paga es muy alta.");
        }else{
            this.payLoad = payLoad;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("MENU\n1. Despegar\n2. Bajar velocidad\n3. Status de la misión.\n0. Salir");
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
            System.out.println("MENU\n1. Despegar\n2. Bajar velocidad\n0. Salir");
            op = sc.nextInt();
        }
    }
}
