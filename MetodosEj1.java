package boletin18;
import java.util.Scanner;

public class MetodosEj1 {
    
    public void InsertarDatos(float[] array){
        float num;
        for(int i=0;i<array.length;i++){
            num=(float)(Math.random()*10);
            array[i]=num;
        }
        
    }   
    
    public float media(float[] array){
        float pro=0;
        float sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        pro=sum/array.length;
        return pro;
    }
    
    public float notaAlta(float[] array){
        float nota=-1;
        for(int i=0;i<array.length;i++){

                if(array[i]>nota){
                    nota=array[i];
                }
        }
        return nota;
    }
    
    public void mosSuspensos(float[] array){
        int cont=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<5){
                cont++;
            }
        }
        System.out.println("Suspensos: " + cont);
    }
    
    public void mosAprobados(float[] array){
        int cont=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>=5){
                cont++;
            }
        }
        System.out.println("Aprobados: " + cont);
    }
    
    public void mostrarArray(float[] array, String[] array2){
            for(int j=0;j<array.length ;j++){
                System.out.println(array2[j]);
                System.out.println(array[j]);
            }
        
    }
    
    public void InsertarDatos(float[] array, String[] array2){
        float num;
        String nomb;
        //Scanner sc = new Scanner(System.in);
        //Random rand = new Random();
        for(int i=0;i<array.length;i++){
            //num=sc.nextFloat();
            num=(float)(Math.random()*10);
            array[i]=num;
        }
        
        /*for(int i=0;i<array2.length;i++){
            nomb=sc.nextLine();
            array2[i]=nomb;
        }*/
        array2[0]="Jose";
        array2[1]="Abelino";
        array2[2]="Marcos";
        array2[3]="Neo";
        array2[4]="Luis";
        array2[5]="Paco";
        array2[6]="Jorge";
    }
    
    public String alumnoNotaAlta(float[] array, String[] array2){
        float nota=-1;
        int pos=0;
        for(int i=0;i<array.length;i++){
            //for(int j=0;j<array.length;j++){
                if(array[i]>nota){
                    nota=array[i];
                    pos=i;
                }
            //}
        }
        return array2[pos];
    }
    
    public void ordenarNotas(float[] array, String[] array2){
        float num, num2;
        String nomb, nomb2;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j]>array[i]){
                    num=array[j];
                    num2=array[i];
                    array[i]=num;
                    array[j]=num2;
                    nomb=array2[i];
                   nomb2=array2[j];
                    array2[i]=nomb2;
                    array2[j]=nomb;
                }
            }
        }
    }
    
    public void mostrarAprobados(float[] array,String[] array2){
        System.out.println("Alumnos Aprobados:");
        for(int i=0;i<array.length;i++){
            if(array[i]>=5){
                System.out.println("Nombre: " + array2[i] + "\nNota: " + array[i]);
            }
        }
    }
    public void mostrarNota(float[] array, String[] array2){
        Scanner sc=new Scanner(System.in);
        String nomb;
        boolean enc=false;
        nomb=sc.nextLine();
        for(int i=0;i<array2.length;i++){
            if(nomb.equals(array2[i])){
                enc=true;
                System.out.println("Alumno:");
                System.out.println(array2[i] + "\nNota:\n" + array[i]);
                break;
            }
        }
        if(enc==false){
            System.out.println("Alumno no encontrado");
        }
    }
}
