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
public class Class5 {
    public void all(){
        a();
        b();
        c();
        d();
    }
    public void a(){
    int mas1[][] = new int[8][8];
        for(int i = 0; i< 8;i++){
            for(int j = 0; j<8;j++){
                mas1[i][j] = (int) (Math.random()*100);
                System.out.print(mas1[i][j]+"  "); 
            }   
            System.out.println();
        }
        int s1 = 0;
        int s2 = 0;
        for(int i = 1; i< 8;i++){
           s1 +=mas1[i][i];
           s2 +=mas1[8-i][8-i];
        }
        System.out.println(" главная  = "+s1);
        System.out.println(" не главная  = "+s2);
        System.out.println();
        System.out.println();
    }
    
    public void b(){
    int mas1[][] = new int[8][5];
        for(int i = 0; i< 8;i++){
            for(int j = 0; j<5;j++){
                mas1[i][j] = (int) (Math.random()*200 - 100);
                System.out.print(mas1[i][j]+"  "); 
            }   
            System.out.println();
        }
        int max = 0;
        for(int i = 0; i< 8;i++){
            for(int j = 0; j<5;j++){
                if(mas1[i][j]>max) max = mas1[i][j];
            }   
        }

        System.out.println(" max  = "+max);

    }
    
    public void c(){
    int mas1[][] = new int[8][5];
        for(int i = 0; i< 8;i++){
            for(int j = 0; j<5;j++){
                mas1[i][j] = (int) (Math.random()*20 - 10);
                System.out.print(mas1[i][j]+"  "); 
            }   
            System.out.println();
        }
        int max = 0;
        int res = 1;
        int ind = 0;
        for(int i = 0; i< 8;i++){
            res = 1;
            for(int j = 0; j<5;j++){
                res *= mas1[i][j];
            } 
            if(res>max){
                max = res;
                ind = i;
            }
        }

        System.out.println(" max  = "+max +" на строке номер"+ind);

    }
    public void d(){
        System.out.println();
        System.out.println();
    int mas1[][] = new int[10][7];
        for(int i = 0; i< 10;i++){
            for(int j = 0; j<7;j++){
                mas1[i][j] = (int) (Math.random()*100);
                System.out.print(mas1[i][j]+"  "); 
            }   
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i< 10;i++){

                Arrays.sort(mas1[i]);
            
        }
        
        System.out.println();
        System.out.println();
        for(int i = 0; i< 10;i++){
            for(int j = 0; j<7;j++){
                System.out.print(mas1[i][j]+"  "); 
            }   
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
        
        
}
