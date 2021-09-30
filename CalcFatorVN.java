//3. Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário.


import javax.swing.JOptionPane;


public class CalcFatorVN {

    public static void main(String[] args){
        int numero, auxiliar, fator =1;
        String mensagem = "" ;


        numero = Integer.valueOf(JOptionPane.showInputDialog("informe o numero:"));
        mensagem = numero + "! =";
            for(auxiliar=numero;auxiliar>=1;auxiliar--){
                fator *= auxiliar;
                mensagem  += auxiliar + (auxiliar>1?"x":"=");
        }
        mensagem += fator;

        JOptionPane.showMessageDialog(null,mensagem);

    }
}
