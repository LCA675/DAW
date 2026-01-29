/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06_calle_laura;

/**
 *
 * @author DAW1-TARDE
 */
public class Ex06_Calle_Laura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        int[] vector1 = new int[10];
        int opcion, opcion1 = 1, opcion2 = 0, opcion3 = 0, opcion4 = 0, opcion5 = 0;
        do {
            opcion = menu();
            if (opcion == 1) {
                rellenarvector(vector);
                mostrarvector(vector);
                opcion1++;
            }
            if (opcion == 2) {
                rellenarvector(vector);
                mostrarvector(vector);
                valores(vector);
                opcion2++;
            }
            if (opcion == 3) {
                rellenarvector(vector);
                ordenarBurbuja(vector);
                mostrarvector(vector);
                extremos(vector);
                opcion3++;
            }
            if (opcion == 4) {
                rellenarvector(vector);
                repetidos(vector);
                ordenarBurbuja(vector);
                mostrarvector(vector);
                opcion4++;
            }
            if (opcion == 5) {
                rellenarvector(vector);
                for (int i = 0; i < vector.length; i++) {
                    vector1[i] = vector[i];
                }
                ordenarBurbujamejorado(vector, vector1);
                opcion5++;
            }
            //ejercicio2();
            Entrada.leerTeclado("Pulse una tecla para continuar.");
        } while (opcion != 0);

        if (opcion1 > 0) {
            System.out.println("Opción 1: " + opcion1);
        }
        if (opcion2 > 0) {
            System.out.println("Opción 2: " + opcion2);
        }
        if (opcion3 > 0) {
            System.out.println("Opción 3: " + opcion3);
        }
        if (opcion4 > 0) {
            System.out.println("Opción 4: " + opcion4);
        }
        if (opcion5 > 0) {
            System.out.println("Opción 5: " + opcion5);
        }
    }

    public static int menu() {
        int op;
        System.out.println("Menu bucles");
        System.out.println(" 1.- Rellenar vector y mostrarlo");
        System.out.println(" 2.- Calcular Medias");
        System.out.println(" 3.- Almacenar Extremos");
        System.out.println(" 4.- Comprobar valores repetidos");
        System.out.println(" 5.- Ordenar vector mejorado");
        System.out.println(" 0.- Salir");
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;
    }

    /*FUNCION PARA RELLENAR EL VECTOR*/
    public static void rellenarvector(int[] vector) {
        int i = 0;
        while (i < vector.length) {
            vector[i] = (int) (Math.random() * 100) + 1;
            while (vector[i] < 10) {
                vector[i] = (int) (Math.random() * 100) + 1;
            }

            i++;
        }

    }

    /* FUNCION PARA MOSTRAR EL VECTOR YA PREVIAMENTE RELLENADO*/
    public static void mostrarvector(int[] vector) {
        System.out.print("(");
        int i = 0;
        do {
            System.out.print(vector[i] + "-");
            i++;
        } while (i < vector.length);
        System.out.print(")");
        System.out.println("");
    }

    /*FUNCION PARA HACER LAS MEDIAS DE LOS PARES E IMPARES E IMPRIMIRLOS POR PANTALLA*/
    public static void valores(int[] vector) {
        int media_pares = 0, media_impares = 0, vecespar = 0, vecesimpar = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                media_pares += vector[i];
                vecespar++;
            }
            if (vector[i] % 2 != 0) {
                media_impares += vector[i];
                vecesimpar++;
            }
        }
        
        /* AQUI COMPRUEBO A QUE LADO REDONDEAR LA MEDIA. SI ES MAYOR QUE 5 PUES SUBIRA, COGO LA CENTENA LE SUMO UNO Y LA MULTIPLICO POR 10 PARA QUE ME DE EL VALOR APROXIMADO
        SINO ES MAYOR QUE 5, COJO LA CENTENA TAL CUAL Y LA MULTIPLICO POR 10 YA QUE TENDRIAMOS QUE REDONDEAR HACIA ABAJO
        POR EJEMPLO
        MEDIAIMPARES=48
        MEDIAPARES=32
        MEDIAPARES=30
        MEDIAIMPARES=50*/
        media_pares = media_pares / vecespar;
        media_impares = media_impares / vecesimpar;
        
        int decenaP= media_pares%10;
        int decenaI=media_impares%10;
        
        int centenaP= media_pares/10;
        int centenaI=media_impares/10;
        
        if (decenaP>=5){
            media_pares=(centenaP+1)*10;
        }
        
        if (decenaI>=5){
            media_impares=(centenaI+1)*10;
        }
        
        if (decenaP<5){
            media_pares=(centenaP*10);
        }
        
        if (decenaI<5){
            media_impares=(centenaI*10);
        }
        

        if (vecespar != 0) {
            System.out.println("Nº de valores pares: " + vecespar + " - Media de los valores pares: " + media_pares);
        }
        if (vecesimpar != 0) {
            System.out.println("Nº de valores pares: " + vecesimpar + " - Media de los valores pares: " + media_impares);
        }
        if (vecespar == 0) {
            System.out.println("Nº de valores pares: " + vecespar + " - No se puede calcular la media");
        }
        if (vecesimpar == 0) {
            System.out.println("Nº de valores pares: " + vecespar + " - No se puede calcular la media");
        }
    }

    /* FUNCION PARA IMPRIMIR LOS EXTREMOS DEL VECTOR*/
    public static void extremos(int[] vector) {
        System.out.println("Valores extremos: (" + vector[0] + "-" + vector[1] + "-" + vector[8] + "-" + vector[9] + ")");
    }

    /* HE UTILIZADO ESTE METODO PARA EL EJERCICIO DE EXTREMOS YA QUE VEÍA QUE ERA LA MEJOR MANERA DE HACERLO, 
    YA QUE ORDENAS EL VECTOR Y LOS EXTREMOS SIEMPRE VAN A SER LAS MISMAS POSICIONES*/
    public static void ordenarBurbuja(int[] vector) {
        int aux;
        for (int i = 0; i < vector.length; i++) {
            for (int j = vector.length - 1; j > i; j--) {
                if (vector[j] < vector[j - 1]) {
                    aux = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = aux;
                }
            }
        }
    }

    /* FUNCION PARA COMPROBAR SI HAY NUMEROS REPETIDOS EN EL VECTOR*/
    public static int repetidos(int[] vector) {
        for (int i = 0; i < vector.length; i++) {

            for (int j = 0; j < i; j++) {
                if (vector[i] == vector[j]) {
                    System.out.print("Hay valores repetidos en la lista: ");
                    return 0;
                }
            }
        }
        System.out.print("No hay valores repetidos en la lista: ");
        return 0;
    }

    /* METODO BURBUJA MEJORADO HE INTENTADO QUE CUANDO RECORRIESE LA LISTA 1 VEZ Y NO HUBIESE NINGUN CAMBIO DEJARA DE EJECUTARSE */
    public static int ordenarBurbujamejorado(int[] vector, int[] vector1) {
        int aux;
        for (int i = 0; i < vector.length; i++) {
            for (int j = vector.length - 1; j > i; j--) {
                if (vector[j] < vector[j - 1]) {
                    aux = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = aux;
                }
                
            }
            int posiciones = 0;
                boolean respuesta = true;
                for (int o = 0; o < vector1.length; o++) {
                    if (vector1[o] == vector[o]) {
                        posiciones++;
                    }
                }
                if (posiciones == vector.length) {
                    respuesta = false;

                }
                if (respuesta == false) {
                    System.out.println("El recorrido esta terminado ya que no ha hecho ningun cambio");
                    
                    i = vector.length;
                    return 0;

                }
        }
        System.out.println("Ha terminado de ordenar el vector");
        mostrarvector(vector);
        return 0;
    }

   

}
