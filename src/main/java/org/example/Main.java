package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figura f1 = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + f1.calcularArea());
        System.out.println("Perímetro del cuadrado: " + f1.calcularPerimetro());
        Figura f2 = new Circulo(3);
        System.out.println("Área del círculo: " + f2.calcularArea());
        System.out.println("Perímetro del círculo: " + f2.calcularPerimetro());
    }
}