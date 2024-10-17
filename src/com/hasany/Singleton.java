package com.hasany;

/*
* #### Explicación del Código
Clase Singleton:

Variable estática privada: private static Singleton instance; almacena la única instancia de la clase.
Constructor privado: private Singleton() evita la creación de instancias desde fuera de la clase.
Método público estático: public static Singleton getInstance() devuelve la única instancia de la clase, creando la instancia si aún no existe.
Método de ejemplo: public void showMessage() es un método de ejemplo que imprime un mensaje.

Clase Principal:

Obtener la instancia del Singleton: ´Singleton singleton´ = Singleton.getInstance(); obtiene la única instancia del Singleton.
Llamar a un método del Singleton: ´singleton.showMessage();´ llama al método showMessage del Singleton.
*
* */

public class Singleton {
    // Variable estática privada para almacenar la única instancia de la clase
    private static Singleton instance;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Singleton() {
        // Inicialización de la instancia
    }

    // Método público estático para devolver la instancia única de la clase
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Otros métodos de la clase
    public void showMessage() {
        System.out.println("Hello World from Singleton!");
    }
}
