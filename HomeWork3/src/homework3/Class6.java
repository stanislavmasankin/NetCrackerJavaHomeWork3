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
public class Class6 {
    	enum es { A, B, C, D,E }
	int mas1[] = new int[50];
        int mas2[] = { 0,0,0,0,0,0,0,0,0,0};
        int mas3[] = { 0,0,0,0,0,0,0,0,0,0};
        public void all(){
            a(es.A);
            b(es.A); 
            d();
            f();
        
        
        }
        public void a(es cs){
            long startTime = System.nanoTime(); 
                    if(cs == es.A)System.out.println("  A");
            else    if(cs == es.B)System.out.println("  B");
            else    if(cs == es.C)System.out.println("  C");
            else    if(cs == es.D)System.out.println("  D");
            else    if(cs == es.E)System.out.println("  E");
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("    Else-If-Time = "+estimatedTime);         
        }
        public void b(es cs){
            long startTime = System.nanoTime(); 
            switch (cs) {
                case A: 
                    System.out.println(" A");
                    break;
                    
                case B: 
                    System.out.println(" B");
                    break;
                    
                case C: 
                    System.out.println(" C");
                    break;
                    
                case D: 
                    System.out.println(" D");
                    break;
                    
                case E: 
                    System.out.println(" E");
                    break;
                default:
                    break;
            }
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("    Else-If-Time = "+estimatedTime);   
                    
            }
        public void c(int a){
                    if(a == 0)mas2[0]++;
            else    if(a == 1)mas2[1]++;
            else    if(a == 2)mas2[2]++;
            else    if(a == 3)mas2[3]++;
            else    if(a == 4)mas2[4]++;
            else    if(a == 5)mas2[5]++;
            else    if(a == 6)mas2[6]++;
            else    if(a == 7)mas2[7]++;
            else    if(a == 8)mas2[8]++;
            else    if(a == 9)mas2[9]++;
            else    if(a == 10)mas2[10]++;

        }
        public void d(){
        System.out.println("масив через else-if:");        
            for(int i = 0;i<mas1.length;i++){
               mas1[i] = (int) (Math.random()*10);
               System.out.print(" "+mas1[i]);  
               c(mas1[i]);
            }
            System.out.println();

            for(int i = 0;i<mas2.length;i++){
               System.out.println(i+ "  повторился "+mas2[i] +"раз");  
            }   
            System.out.println();
        }
        public void e(int a){
                    switch (a) {
                case 0: 
                    mas3[0]++;
                    break;
                    
                case 1: 
                    mas3[1]++;
                    break;
                    
                case 2: 
                    mas3[2]++;
                    break;
                    
                case 3: 
                    mas3[3]++;
                    break;
                    
                case 4: 
                    mas3[4]++;
                    break;
                case 5: 
                    mas3[5]++;
                    break;
                case 6: 
                    mas3[6]++;
                    break;
                case 7: 
                    mas3[7]++;
                    break;
                case 8: 
                    mas3[8]++;
                    break;
                case 9: 
                    mas3[9]++;
                    break;                  
            }
        }
        public void f(){
        System.out.println("масив через switg:");        
            for(int i = 0;i<mas1.length;i++){
               System.out.print(" "+mas1[i]);  
               e(mas1[i]);
            }
            System.out.println();

            for(int i = 0;i<mas2.length;i++){
               System.out.println(i+ "  повторился "+mas2[i] +"раз");  
            }   
            System.out.println();
        }
}

    