//1. Escreva um programa que exibe os primeiros 100 números naturais. Faça versões usando do/While.



public class Number100DW {
        public static void main(String[] args) {
            int contador = 0;
            do {
                System.out.println(contador++);
            }
            while(contador <= 100);
        }
    }

