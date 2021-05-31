public class Fibonacci{
  public static void main(String args[]){
   
   int cant=10;
   int n1=0;
   int n2=1;
   int suma = 1;
   
   System.out.println(n1);
   for (int i=1; i<cant; i++){
    
    System.out.println(suma);

    
    suma=n1+n2;
    n1=n2;
    n2=suma;
    
  }
 }
} 