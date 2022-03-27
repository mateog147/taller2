package model;

import java.util.Scanner;

public class Manned extends Spacecraft{
    private int passengers;
    private boolean isOrbital;


    public Manned() {
        super();
        int flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de pasajeros: ");
        this.passengers = sc.nextInt();
        System.out.println("Orbita un cuerpo? [SI: 1] [NO: 0]: ");
        flag = sc.nextInt();
        if(flag == 1){
            this.isOrbital = true;
        }else{
            this.isOrbital = false;
        }
        
    }

    public void accelerate(int time) {
        if(this.fuelLevel > 0){
            this.speed += ((this.getMaxtThrust() - this.getWeight()) * 9.8 /this.getWeight()) * time;
            this.fuelLevel -= (time/4);
        }
        else{
            System.out.println("Combustible agotado");
        }
    }

    @Override
    public void accelerate() {
        if(this.fuelLevel > 0){
            this.speed += ((this.getMaxtThrust() - this.getWeight()) * 9.8 /this.getWeight())* 5;
            this.fuelLevel -= 10;
        }
        else{
            System.out.println("PELIGRO: Combustible agotado");
        }
    }

    @Override
    public void decelerate() {
        if(this.fuelLevel > 0){
            this.speed += ((this.getMaxtThrust() - this.getWeight()) * 9.8 /this.getWeight()) * 5;
            this.fuelLevel -= 5;
        }
        else{
            System.out.println("PELIGRO: Combustible agotado");
        }
        
    }

    public String sendMessage(String incomeMessage) {
        String response = "" ;
        switch(incomeMessage.toLowerCase()){
            case "speed":
                response += "Velocidad actual: " + this.speed + "Km/s";
                break;

            case "fuel":
                response += "Nivel de combustible: " + this.fuelLevel + "%";
                break;

            case "status":
                response += super.sendMessage() + "\nNumero de Pasajeros: " +this.passengers;
                break;
        }
        return response;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isOrbital() {
        return isOrbital;
    }

    public void setOrbital(boolean isOrbital) {
        this.isOrbital = isOrbital;
    }

    @Override
    public void showMenu() {
        // TODO Auto-generated method stub
        
    }
}
