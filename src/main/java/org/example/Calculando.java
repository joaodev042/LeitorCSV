package org.example;

public class Calculando {

  Calculos s = new Calculos();
    
    public double soma(){
        s.setNumb1(5);
        s.setNum2(6);
        double v = s.getNumb1() + s.getNum2();
        return v;
    }


}
