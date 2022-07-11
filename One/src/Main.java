package com.company;

public class Main {
    public static void main(String[] args){
        //int Resultado = 0;
        //Resultado = suma(2, 2, 4);
        //System.out.println(Resultado);
       suma(2, 4, 6);
        coche miCoche = new coche();
        miCoche.aumentoPuertas();

        System.out.println(miCoche.puertas);
    }
   public static void suma(int a, int b, int c){
        //return a + b + c;
        int resultado = a + b + c;
       System.out.println(resultado);
    }
}

class coche{
    public int puertas = 0;

    public void aumentoPuertas(){
        this.puertas++;
    }

}