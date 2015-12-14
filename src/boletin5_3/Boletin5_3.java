package boletin5_3;

import javax.swing.JOptionPane;

public class Boletin5_3 {

    public static void main(String[] args) {
         Clase5_3 obx= new Clase5_3();
       double rad;
       
       String resposta = JOptionPane.showInputDialog("Introduzca el radio de la circunferencia");
       rad=Double.parseDouble(resposta);
       
       Clase5_3 obx2= new Clase5_3(rad);
       
       JOptionPane.showConfirmDialog(null,"El area de la circunferencia es igual a: "+obx2.calcularArea());
       JOptionPane.showConfirmDialog(null,"La longitud de la circunferencia es de: "+obx2.calcularLonxitude());
       
         
    }
    
}