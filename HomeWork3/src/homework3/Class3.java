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
public class Class3 {
    int size = 5;
    Class3(int size){
        this.size = size;
    }
    public void all(){
        System.out.println("Задание 3:");
        a1();
        b1();
        b2(); 
        System.out.println();
        System.out.println();
        size = (size/2)* 2 + 1;
        c();
        t();
        a();
        c();
    }
    public void a1(){
        for(int i = 0; i < size;i++){
            for(int j = 0; j<size;j++){
                System.out.print("0 ");
            }
            System.out.println();       
        }  
        System.out.println();
    }
    public void b1(){
        for(int i = 0; i < size;i++){
            for(int j = 0; j<i+1;j++){
                System.out.print("0 ");
            }
            System.out.println();       
        }          
        System.out.println();
    }
    public void b2(){
        for(int i = 0; i <size;i++){
            if(i ==0||i == size -1){
                for(int j = 0; j<size;j++){
                    System.out.print("0 ");
                }
            }else{
                System.out.print("0 ");
                for(int j = 1; j<size - 1;j++){
                    System.out.print("  ");
                }
                System.out.print("0 ");
            }     
            System.out.println();       
        }  
        System.out.println();
    }    
    public void c(){
            for(int i = 0; i <size;i++){
            if(i ==0||i == size - 1){
                for(int j = 0; j<size;j++){
                    System.out.print("0 ");
                }
            }else{
                System.out.print("0 ");
            } 
            System.out.println();       
        } 
        System.out.println();
    }
    public void t(){
        for(int i = 0; i <size;i++){
            if(i ==0){
                for(int j = 0; j<size;j++){
                    System.out.print("0 ");
                }
            }else{
                for(int j = 0; j<size;j++){
                    System.out.print("  ");
                    if(j == (int)size/2 - 1){
                        System.out.print("0");
                    }
                }                
            } 
            System.out.println();       
        } 
        System.out.println();
    }
    public void a(){
        for(int i = 0; i <size/2;i++){                       
            for(int j = 0; j<size;j++){
                if(j ==(int)size/2  + i ||j ==(int)size/2  - i ){
                    System.out.print("0 ");
                }else{
                    System.out.print("  ");
                }               
            }  
        System.out.println();       
        } 
        for(int i = 0; i <1;i++){ 
            if(i == 0){
                for(int j = 0; j<size;j++){
                    System.out.print("0 ");
                } 
            }  
        System.out.println();       
        } 
        for(int i = 0; i <size/2 ;i++){ 
            for(int j = 0; j<size;j++){
                if(j == 0 || j == size -1){
                    System.out.print("0 ");
                }else System.out.print("  ");
            }  
        System.out.println();       
        } 
    System.out.println();
    }
    
    
}
