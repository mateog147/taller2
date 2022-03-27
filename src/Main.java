import java.util.ArrayList;
import java.util.Scanner;

import model.Manned;
import model.Shuttle;
import model.Spacecraft;
import model.Unmanned;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Spacecraft> ships = new ArrayList<Spacecraft>();
        int op = 0;
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("MENU\n1. Crear una nave\n2. Ver lista de naves\n3. Operar una nave\n0. Salir");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Tipo de Nave:\n1. Lanzadera\n2. Nave Tripulada\n3. Nave no tripulada\n0. Volver");
                    op = scan.nextInt();

                    switch (op) {
                        case 1:
                            ships.add(new Shuttle());
                            break;

                        case 2:
                            ships.add(new Manned());
                        break;

                        case 3:
                            ships.add(new Unmanned());
                        break;
                    
                        default:
                            break;
                    }
                    op = 1;
                    break;

                case 2:
                    showList(ships);
                    System.out.println("Oprima un tecla para volver..");
                    String temp = scan.next();
                    break;

                case 3:
                    showList(ships);
                    System.out.println("\nSeleccione una nave: ");
                    op = scan.nextInt();
                    ships.get(op-1).showMenu();
                    op =3;
                    break;

                case 0:
                    
                    break;
            
                default:
                    System.out.println("Cerrando..");
                    break;
            }
        } while (op != 0);
        scan.close();
    }

    private static void showList(ArrayList<Spacecraft> list) {
        int i = 1; 
        for (Spacecraft spacecraft : list) {
            System.out.println(i+"."+spacecraft.sendMessage());
            i++; 
        }

    }
}
