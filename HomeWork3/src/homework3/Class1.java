/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Arrays;

/**
 *
 * @author Stas
 */
public class Class1 {
    private int number = 0;
    private int n = 15;
    private int mas1[] = new int[n];
    private int mas2[] = new int[n];
    private int mas3[] = new int[n];
    
    public void all(){
        System.out.println("Задание 1:");
        
        set(mas1);
        set(mas2);
        set(mas3);
        
        number = 0;
        bubbl(mas1);
        get(mas1);
        sort(mas2);
        get(mas2);
        arr(mas3);
        get(mas3);      

    }
    
    public void set(int mas[]){
        number ++;
        System.out.print("    mas"+number);        
        for(int i = 0;i<mas.length;i++){
           mas[i] = (int) (Math.random()*100);
           System.out.print(" "+mas[i]);           
        }
        System.out.println();          
    }
    
    public void get(int mas[]){
        number ++;
        System.out.print("    mas"+number);        
        for(int i = 0;i<mas.length;i++){
           System.out.print(" "+mas[i]);
        }
        System.out.println();
    }    
    public void bubbl(int mas[]){
        System.out.println();
        long startTime = System.nanoTime();         
        for(int i = mas.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( mas[j] > mas[j+1] ){
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("    BubblTime = "+estimatedTime);   
    }
    
    public void sort(int mas[]){
        System.out.println();
        long startTime = System.nanoTime(); 
        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int min_i = i; 

            for (int j = i+1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = mas[i];
                mas[i] = mas[min_i];
                mas[min_i] = tmp;
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("    SortTime = "+estimatedTime); 
    }
    
    public void arr(int mas[]){
        System.out.println();
        long startTime = System.nanoTime(); 
        Arrays.sort(mas);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("    Arrays.sortlTime = "+estimatedTime);
    }
}
