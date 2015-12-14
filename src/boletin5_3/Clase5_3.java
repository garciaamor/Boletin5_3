package boletin5_3;

public class Clase5_3 {
    private double radio;
    private static final double Pi=3.14;
    
    public Clase5_3(){
        
    }
    public Clase5_3(double rad){
        radio=rad;        
    }
     
    public void setradio(double rad){
        radio=rad;
    }
    public double getradio(){
        return radio;
    }
    public double calcularArea(){
        double resultado= (double)Math.pow(radio,2);
        return (Pi*resultado);
    }
    public double calcularLonxitude(){
        return (2*Pi*radio);
    }
}

