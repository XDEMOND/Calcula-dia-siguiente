
package dia.siguiente;

import java.util.Scanner;

/**
 *
 * @author LAB 314
 */
public class DiaSiguiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año,mes,dia;
        
        Scanner teclado=new Scanner(System.in);
          System.out.println("Bienvenido al programa para calcular el día suguiente");
          System.out.println("favor de introducir el año");
          año=teclado.nextInt();
          do{
          System.out.println("favor de introducir el mes ");
          mes=teclado.nextInt();
          if(mes<1 || mes>12)
            System.out.println("Lo sentimos el mes que introdujo no existe");
          }while(mes<1 || mes>12);
          do{
          System.out.println("favor de introducir el dia");
          dia=teclado.nextInt();
          if(mes==2 && año%4==0 && dia>29)
              System.out.println("dia enexistente");
            dia=32;
           
          else
                    if(mes==2 && año%4!=0 && dia>28)
                        System.out.println("Dia inexistente");
                  dia=32;  
          else
              if(mes==4 ||mes==6 ||mes==9 ||mes==11 && dia>31)
                        System.out.println("el mes que introdujo no existe favor de verificarlo");
              dia=32;
                        
                         else
                                if(dia>31)
              System.out.println ("El mes que introdujo no existe favor de verificarlo");
              dia=32;
          else
          if(dia<1 && dia>31)
          System.out.println("El dia que introdujo no existe favor de verificarlo");
          dia=32;
          }while(dia<1 || dia>31);
          dia++;
          if(mes==2&&año%4==0&&dia==30)
              mes++;
              dia=1;
          System.out.println(año+"/"+mes+"/"+dia);
                             
                              
          
          
          
      
    }
}
