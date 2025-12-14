package vista;

import modelo.CocheDTO;
import modelo.Tmenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VistaConcesionario {

    Scanner sc = new Scanner(System.in);

    public Tmenu Showmenu() {

        Tmenu[] options = Tmenu.values();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i].getOpText());
        }

        int user;

        while (true) {

            user = Integer.parseInt(sc.nextLine());
//          user = sc.nextInt();
//          sc.nextLine();
            if (user >= 1 && user <= options.length) {


                return options[user - 1];
            }
            System.out.println("Opcion incorrecta");

        }
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String entrarDatos(){
        String entrada = sc.nextLine();
        return entrada;
    }

    public void mostrarCoche(List<CocheDTO> coches) {
        if(coches.isEmpty()){
            System.out.println("No se encontraron coches");
        }
        for(CocheDTO coche : coches) {
                System.out.println(coche.getMarca() + " " +
                        coche.getModelo() + " " +
                        coche.getMatricula() + " " +
                        coche.getPrecio() + " " +
                        coche.getAnho() + " " +
                        coche.getKilometros() + ".");
        }
        System.out.println();
    }



}




