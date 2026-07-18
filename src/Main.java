import Bebidas.*;
import Complementos.Canela;
import Complementos.Chocolate;
import Complementos.Crema;
import Complementos.Leche;

import java.util.Scanner;

public class Main {
    public static void  main (String [] args){

        Scanner sc = new Scanner(System.in);

        Cafe pedido = null;
        System.out.println("------ SAMS CAFE ------");
        System.out.println("Seleccione un cafe:");
        System.out.println("1._ Expresso");
        System.out.println("2._ Americano");
        System.out.println("3._ Latte");
        System.out.println("4._ Mocca");
        System.out.println("Opción: ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                pedido = new Expresso();
                break;
            case 2:
                pedido = new Americano();
                break;
            case 3:
                pedido = new Latte();
                break;
            case 4:
                pedido = new Mocca();
                break;
            default:
                System.out.println("Opción invalida");
        }
        int opcC;
        do{
            System.out.println("------ Complementos ------");
            System.out.println("Seleccione su complemento:");
            System.out.println("1._ Leche");
            System.out.println("2._ Crema");
            System.out.println("3._ Chocolate");
            System.out.println("4._ Canela");
            System.out.println("5._ Finalizar pedido");
            System.out.println("Opción: ");
            opcC = sc.nextInt();

            switch (opcC) {
                case 1:
                    pedido = new Leche(pedido);
                    break;
                case 2:
                    pedido = new Crema(pedido);
                    break;
                case 3:
                    pedido = new Chocolate(pedido);
                    break;
                case 4:
                    pedido = new Canela(pedido);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }while (opcC !=5 );

        System.out.println("----- BOLETA ELECTRONICA -----");
        System.out.println("Pedido: " + pedido.descripcion());
        System.out.println("Total a pagar: " + pedido.precio());
        System.out.println("------------------------------");

    }
}