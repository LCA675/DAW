/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedaordenacion;

/**
 *
 * @author jmrivera
 */
public class BusquedaOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op, dato, posicion;
        int[] vector = new int[10];
        // Rellenamos el vector aleatoriamente y lo ordenamos
        rellenar(vector);
        ordenarBurbuja(vector);
        // Bucle de ejecución del programa a través del menú
        do {
            op = menu();
            switch (op) {
                case 1: // Búsqueda simple
                    rellenar(vector);
                    ver(vector);
                    dato = pedirDato();
                    posicion = busqueda(vector, dato);
                    if (posicion != -1) {
                        System.out.println("El numero " + dato + " esta en la posicion " + posicion);
                    } else {
                        System.out.println("El numero " + dato + " no existe en el vector");
                    }
                    break;
                case 2: // Búsqueda ordenada
                    rellenar(vector);
                    ordenarBurbuja(vector);
                    ver(vector);
                    dato = pedirDato();
                    posicion = busquedaOrdenada(vector, dato);
                    if (posicion != -1) {
                        System.out.println("El numero " + dato + " esta en la posicion " + posicion);
                    } else {
                        System.out.println("El numero " + dato + " no existe en el vector");
                    }
                    break;
                case 3: // Búsqueda binaria
                    rellenar(vector);
                    ordenarBurbuja(vector);
                    ver(vector);
                    dato = pedirDato();
                    posicion = busquedaBinaria(vector, dato);
                    if (posicion != -1) {
                        System.out.println("El numero " + dato + " esta en la posicion " + posicion);
                    } else {
                        System.out.println("El numero " + dato + " no existe en el vector");
                    }
                    break;
                case 4: // Ordenar por selección
                    rellenar(vector);
                    System.out.println("Sin ordenar");
                    ver(vector);
                    ordenarSeleccion(vector);
                    System.out.println("Ordenado");
                    ver(vector);
                    break;
                case 5: // Ordenar por burbuja
                    rellenar(vector);
                    System.out.println("Sin ordenar");
                    ver(vector);
                    ordenarBurbuja(vector);
                    System.out.println("Ordenado");
                    ver(vector);
                    break;
                case 6: // Insertar elemento en orden
                    rellenar(vector);
                    ordenarBurbuja(vector);
                    ver(vector);
                    dato = pedirDato();
                    posicion = busquedaBinaria(vector, dato);
                    if (posicion == -1) {
                        if (vector[vector.length - 1] > dato) {
                            int hueco = buscarHueco(vector, dato);
                            desplazarDerecha(vector, hueco);
                            vector[hueco] = dato;
                        }
                    } else {
                        System.out.println("Ya existe el numero " + dato + " en la posicion " + posicion);
                    }
                    ver(vector);
                    break;
                case 7: // Borrar elemento
                    rellenar(vector);
                    ordenarBurbuja(vector);
                    ver(vector);
                    dato = pedirDato();
                    posicion = busquedaBinaria(vector, dato);
                    if (posicion != -1) {
                        desplazarIzquierda(vector, posicion);
                    } else {
                        System.out.println("No existe el numero a borrar");
                    }
                    ver(vector);
                    break;
                default:
                // Nada que hacer
            }
            if (op != 0) {
                Entrada.leerTeclado("\nPulse intro para continuar...");
            } else {
                System.out.println("\nFin del programa.");
            }

        } while (op != 0);
    }

    /**
     * Función que muestra el menu
     *
     * @return Devuelve la opción de menú elegida
     */
    public static int menu() {
        System.out.println("Menu");
        System.out.println("----");
        System.out.println("1.- Busqueda simple");
        System.out.println("2.- Busqueda ordenada");
        System.out.println("3.- Busqueda binaria");
        System.out.println("4.- Ordenar por seleccion");
        System.out.println("5.- Ordenar por burbuja");
        System.out.println("6.- Insertar elemento en orden");
        System.out.println("7.- Borrar elemento con desplazamiento");
        System.out.println("0.- Salir");
        int op = Entrada.leerEntero("Introduzca opcion: ");
        return op;
    }

    /**
     * Procedimiento que rellena el vector aleatoriamente
     *
     * @param v vector a rellenar
     */
    public static void rellenar(int[] v) {
        // TODO code application logic here
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 1000);
        }
    }

    /**
     * Procedimiento que muestra el contenido del vector
     *
     * @param v vector a mostrar
     */
    public static void ver(int[] v) {
        // TODO code application logic here
        System.out.print("[" + v[0]);
        for (int i = 1; i < v.length; i++) {
            System.out.print(", " + v[i]);
        }
        System.out.println("]");
    }

    /**
     * Función que pide un entero por teclado
     *
     * @return Valor introducido
     */
    public static int pedirDato() {
        int dato;
        do {
            dato = Entrada.leerEntero("Introduzca un numero (entre 0 y 999): ");
        } while (dato < 0 || dato >= 1000);
        return dato;
    }

    /**
     * Función que busca un dato en un vector secuencialmente
     *
     * @param v vector
     * @param dato valor buscado
     * @return Devuelve la posición donde se encuentra o -1 si no existe
     */
    public static int busqueda(int[] v, int dato) {
        // TODO code application logic here
        for (int i = 0; i < v.length; i++) {
            if (v[i] == dato) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Función que busca un dato en un vector ordenado secuencialmente
     *
     * @param v vector
     * @param dato valor buscado
     * @return Devuelve la posición donde se encuentra o -1 si no existe
     */
    public static int busquedaOrdenada(int[] v, int dato) {
        // TODO code application logic here
        for (int i = 0; i < v.length && v[i] <= dato; i++) {
            if (v[i] == dato) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Función que busca un dato en un vector ordenado por el método de búsqueda
     * binaria
     *
     * @param v vector
     * @param dato valor buscado
     * @return Devuelve la posición donde se encuentra o -1 si no existe
     */
    public static int busquedaBinaria(int[] v, int dato) {
        // TODO code application logic here
        int izq, der, centro;
        izq = 0;
        der = v.length - 1;
        while (izq <= der) {
            centro = (int) ((izq + der) / 2);
            if (v[centro] == dato) {
                return centro;
            } else {
                if (dato > v[centro]) {
                    izq = centro + 1;
                } else {
                    der = centro - 1;
                }
            }
        }
        return -1;
    }

    /**
     * Procedimiento que ordena un vector por el método de la burbuja
     *
     * @param v Vector a ordenar
     */
    public static void ordenarBurbuja(int[] v) {
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = v.length - 1; j > i; j--) {
                if (v[j] < v[j - 1]) {
                    aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    }

    /**
     * Procedimiento que ordena un vector por el método de seleccion
     *
     * @param v Vector a ordenar
     */
    public static void ordenarSeleccion(int[] v) {
        int aux, vmenor;
        for (int i = 0; i < v.length; i++) {
            vmenor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[vmenor]) {
                    vmenor = j;
                }
            }
            aux = v[i];
            v[i] = v[vmenor];
            v[vmenor] = aux;
        }
    }

    /**
     * Función que busca el hueco donde debe insertarse el dato
     *
     * @param v vector
     * @param dato valor a insertar
     * @return Devuelve la posición donde se debería insertar o -1 si no hay
     * hueco (cuando es mayor que el último)
     */
    public static int buscarHueco(int[] v, int dato) {
        // TODO code application logic here
        int i = 0;
        while (i < v.length && v[i] < dato) {
            i++;
        }
        if (i < v.length) {
            return i;
        } else {
            return -1;
        }
    }

    /**
     * Procedimiento que desplaza hacia la izquierda el contenido de un vector
     *
     * @param v vector
     * @param posicion desde la que se desplaza el contenido
     */
    public static void desplazarIzquierda(int[] v, int posicion) {
        // TODO code application logic here
        for (int i = posicion; i < v.length - 1; i++) {
            v[i] = v[i + 1];
        }
        // Ponemos en la última posición un dato que no altere el orden del vector
        v[v.length - 1] = 10000;// dato no válido
    }

    /**
     * Procedimiento que desplaza hacia la derecha el contenido de un vector
     *
     * @param v vector
     * @param posicion desde la que se desplaza el contenido
     */
    public static void desplazarDerecha(int[] v, int posicion) {
        // TODO code application logic here
        for (int i = v.length - 1; i > posicion; i--) {
            v[i] = v[i - 1];
        }
    }

}
