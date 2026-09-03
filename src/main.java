import java.util.Scanner;
public class main{
    public static void main() {
        Scanner leer = new Scanner(System.in);
        TV television = new TV();
        int opcion ;

        do {
            System.out.println("========= INTERACTUA CON LA TV ==========\n" +
                    "1)Prende la TV.\n" +
                    "2)Apaga la TV.\n" +
                    "3)Cambia canal especifico.\n" +
                    "4)Aumenta de canal.\n" +
                    "5)Disminuye de canal.\n" +
                    "6)Subir volumen.\n" +
                    "7)Baja el volumen\n" +
                    "0)Salir\n" +
                    "Elija una opcion: \n");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:{
                    television.turnOn();

                }
                break;
                case 2:{
                    television.turnOff();
                }
                break;
                case 3:{
                    System.out.println("Ingrese al canal a cambiar");
                    int channelnuevo = leer.nextInt();
                    television.setChannel(channelnuevo);

                }
                break;
                case 4:{
                    television.ChannelUp();

                }
                break;
                case 5:{
                    television.ChannelDown();
                }
                break;
                case 6:{
                    television.volumeUp();
                }
                break;
                case 7:{
                    television.volumeDown();
                }
                break;
                case 0:{
                    System.out.println("Hasta luego.");
                }
                break;

            }

        }while(opcion != 0);
    }
}

