package com.hasany;

public class Main {

    public static void main(String[] args) {
        // Obtener la única instancia del Singleton
        Singleton singleton = Singleton.getInstance();

        // Llamar a un método del Singleton
        singleton.showMessage();
    }
}
