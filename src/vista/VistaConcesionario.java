package vista;

import modelo.CocheDTO;
import modelo.Tmenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VistaConcesionario {

    Scanner sc = new Scanner(System.in);
    public Tmenu Showmenu(){

       Tmenu[] options = Tmenu.values();
       for(int i = 0; i < options.length; i++){
           System.out.println((i+ 1) + ". " + options[i].getOpText());

       }

      int user = sc.nextInt();
       while(true){

       opUser = sc.nextInt();
       sc.nextLine();
       if (user >= 1 && user <= options.length){


        return options [user -1];
    }
    printMessage("Opcion incorrecta", TColors.Red);

           }

}




