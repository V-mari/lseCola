import lse.ListaSimplementeEnlazada;

public class Main {
    public static  void main (String [] args){ /*
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
         System.out.println(listaSimplementeEnlazada);
        // insertar elementos a nuestra lista
        listaSimplementeEnlazada.insertar( 5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);
   // mostrarnos nuestra lista
        listaSimplementeEnlazada.mostrar();
        // eliminar algunos elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        // mostrar nuestra lista
        listaSimplementeEnlazada.mostrar();
*/


    Cola cola = new Cola();
    System.out.println(cola.estaVacia());
    for (int i = 1; i < 5; i++){
        cola.insertar(i);
    }
    cola.mostrar();
    }
}
