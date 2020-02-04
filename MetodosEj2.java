package boletin18;

import java.util.Random;
import java.util.Scanner;

public class MetodosEj2 {
    public void mostrarArray(int[] array){
            for(int j=array.length-1;j>=0 ;j--){
                System.out.println(array[j]);
            }
        
    }
     public void InsertarDatos(int[] array){
        int num;
        Random rand = new Random();
        for(int i=0;i<array.length;i++){
            num=rand.nextInt(50)+1;
            array[i]=num;
        }
    }
    public void letraDNI(){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Numero: " + num + " Letras: " + letras.charAt(num % 23));
    }
}
