import javax.swing.JOptionPane;

import java.text.DecimalFormat;

import static java.lang.Math.pow;

public class CalculadoraImc {
    public static void main(String args[]) {

        double imc, altura, peso;
        altura= Double.parseDouble( JOptionPane.showInputDialog("Digite sua Altura:"));
        peso=Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso:"));
imc=peso/pow(altura,2);
        DecimalFormat decimal=new DecimalFormat("0.00");
        String valorFormatado=decimal.format(imc);


        if(imc>=18.5 && imc<25){
            JOptionPane.showMessageDialog(null,"IMC="+valorFormatado + "-Peso Normal");
        }else if( imc<30){
            JOptionPane.showMessageDialog(null,"IMC="+valorFormatado + "-SobrePeso");
        }else if( imc<35){
            JOptionPane.showMessageDialog(null,"IMC="+valorFormatado + "-Obesidade grau I");
        }else if( imc<40){
        JOptionPane.showMessageDialog(null,"IMC="+valorFormatado + "-Obesidade grau II");
    }else if( imc>40){
        JOptionPane.showMessageDialog(null,"IMC="+valorFormatado + "-Obesidade grau III");
    }else{
            JOptionPane.showMessageDialog(null,"IMC="+valorFormatado + "-Abaixo do Peso");
        }

    }
}
