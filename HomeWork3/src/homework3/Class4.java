/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

/**
 *
 * @author Stas
 */
public class Class4 {

    public void all(){
        System.out.println("Задание 4:");
        a();
        b();
        c();
        d();
        e();
        f();
    }
    public void a(){
        int mas[] = new int[50];
        System.out.print("    mas");   
        for(int i = 0; i < 50;i++){
            mas[i] = i*2 +1;
            System.out.print(mas[i] + " "); 
        }
        System.out.println();
        System.out.print("   ");
        for(int i = 1; i <= mas.length;i++){
            System.out.print(" "+mas[mas.length-i]); 
        }
        System.out.print(" sam");
        System.out.println();
    }
    public void b(){
        int mas[] = new int[20];
        int ch = 0;
        System.out.print("    mas");        
        for(int i = 0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*10);
            System.out.print(" "+mas[i]); 
            if(mas[i] % 2 ==0){
                ch+=1;
            }
        }
        System.out.println(); 
        System.out.println("    ch = "+ch);
        System.out.println("    ne ch = "+ (20-ch));
        System.out.println(); 
        
    }
    public void c(){
        int mas[] = new int[10];
        int ch = 0;
        System.out.print("    mas1");        
        for(int i = 0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*100);
            System.out.print(" "+mas[i]); 
            if(mas[i] % 2 !=0){
                mas[i] = 0;
            }
        }
        System.out.print("    mas2"); 
        for(int i = 0;i<mas.length;i++){
            System.out.print(" "+mas[i]); 
        }
        System.out.println(); 
        System.out.println();
    }
    public void d(){
        int mas[] = new int[15];
        int max = 0;
        int min = 0;
        System.out.print("    mas1");        
        for(int i = 0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*100 - 50);
            if(mas[i]>max)max = mas[i];
            if(mas[i]<min)min = mas[i];
            System.out.print(" "+mas[i]); 
        }

        System.out.println();
        System.out.println("    max" + max);
        System.out.println("    min" + min);
        System.out.println("    maxFirstIndex = " + first(mas,max));
        System.out.println("    maxLastIndex = " + last(mas,max)+"//если бы max встречалось больше 1 раза то вывело бы место последнего появления");
        System.out.println();
        
    }
    public int first(int mas[], int e){
        for(int i = 0;i<mas.length;i++){
            if(mas[i] == e){
                return i;                       
            }
        }
        return -1;
    }
    public int last(int mas[], int e){
        int t = 0;
        for(int i = 0;i<mas.length;i++){
            if(mas[i] == e){
                t = i;                       
            }
        }
        return t;
    }
    public void e(){
    int mas1[] = new int[10];
    int mas2[] = new int[10];
        System.out.print("    mas1");   
        for(int i = 0;i<mas1.length;i++){
            mas1[i] = (int) (Math.random()*10);
            System.out.print(" "+mas1[i]); 
        }
        
        System.out.print("    mas2");   
        for(int i = 0;i<mas2.length;i++){
            mas2[i] = (int) (Math.random()*10);
            System.out.print(" "+mas2[i]); 
        }
        System.out.println("    mas1 sr = "+sr(mas1)); 
        System.out.println("    mas2 sr = "+sr(mas2)); 
        if(sr(mas1) >= sr(mas2)){
            if(sr(mas1) == sr(mas2)){
                System.out.println("    sr равны");   
            }else System.out.println("    mas2<mas1");  
        } else System.out.println("     mas2>mas1");  
    }
    public double sr(int mas[]){        
        double res = 0;
        for(int i = 0;i<mas.length;i++){
            res += mas[i];
        }
        return res /mas.length;
    }
    public void f(){
        int mas[] = new int[20];
        int i1 = 0;
        int im1 = 0;
        int i0 = 0;
        System.out.print("    mas");        
        for(int i = 0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*2) + (int) (Math.random()*2 - 2);
            System.out.print(" "+mas[i]); 
            if(mas[i] == 0) i0++;
            if(mas[i] == 1) i1++;
            if(mas[i] == -1) im1++;            
        }
        System.out.println();
        if(i1 >= i0 && i1>= im1) System.out.println("  1 встречаеться чаще всех  " + i1 +" раз");
        if(i0 >= i1 && i0>= im1) System.out.println("  0 встречаеться чаще всех  " + i0 +" раз");
        if(im1>= i1 && im1>= i0) System.out.println("  -1 встречаеться чаще всех  " + im1 +" раз");
        if(i1 == i0) System.out.println("  1 и 0 встречаються по  " + i1 +" раз");
        if(i1 == im1) System.out.println("  1 и -1 встречаються по " + i1 +" раз");
        if(im1 == i0) System.out.println(" -1 и 0 встречаються по  " + i0 +" раз");
        
    }
    
    
}
