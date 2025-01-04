public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\"Heyy\"y, how\"s it going?");
        System.out.println(3+8);
        System.out.println(3-8);
        System.out.println(3*8);
        System.out.println(8/3);
        System.out.println(8%3);
        System.out.println(3%8);
        System.out.println(1%8);
     
         System.out.println("Size of byte in bits: " + Byte.SIZE);
         System.out.println("Size of byte in bytes: " + (Byte.SIZE / 8));
 
         
         System.out.println("Size of short in bits: " + Short.SIZE);
         System.out.println("Size of short in bytes: " + (Short.SIZE / 8));
 
 
         System.out.println("Size of int in bits: " + Integer.SIZE);
         System.out.println("Size of int in bytes: " + (Integer.SIZE / 8));
 

         System.out.println("Size of long in bits: " + Long.SIZE);
         System.out.println("Size of long in bytes: " + (Long.SIZE / 8));
 
     
         System.out.println("Size of float in bits: " + Float.SIZE);
         System.out.println("Size of float in bytes: " + (Float.SIZE / 8));

         System.out.println("Size of double in bits: " + Double.SIZE);
         System.out.println("Size of double in bytes: " + (Double.SIZE / 8));
 
     
         System.out.println("Size of char in bits: " + Character.SIZE);
         System.out.println("Size of char in bytes: " + (Character.SIZE / 8));

         int num1  = Integer.MAX_VALUE;
         int num2 = Integer.MAX_VALUE + 1;
         int num3 = Integer.MIN_VALUE;
         int num4 = Integer.MIN_VALUE - 1;
         System.out.println(num1);
         System.out.println(num2);
          System.out.println(num3);
          System.out.println(num4);
int a = (int)8.9;
System.out.println(a);

double t = 9.0/2; //4.5
double t1 = 9/2; //4
System.out.println(t);

int x = 10;
int y = 90;
if(x>y){
    System.out.println("10 is greater than 90");
} else {
    System.out.println(" 10 is lesser than 90");
}



    }
}
