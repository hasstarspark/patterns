package com.hasany;

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