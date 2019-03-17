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
public class Class2 {
    private int n;
    Class2(int n){
        this.n = n;
    }
    public void all(){
        System.out.println("Задание 2:");
        System.out.println("    n = "+n);
        factFor();
        factRec();
        
    }
    public void factFor(){
        long result = 1;
        long startTime = System.nanoTime();        
        for(int i = 1;i<=n;i++){
            result *= i; 
        }
        
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("    n! = " +result);
        System.out.println("    ForTime = " + estimatedTime);
        System.out.println();
    }
    public void factRec(){
        long startTime = System.nanoTime();
        System.out.println("    n! = " +rec(n));
        
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("    RecTime = " + estimatedTime);
        System.out.println();
    }
    public long rec(int n){
        if(n == 0)return 1;
        return n*rec(n-1);
    }
    
}
