public class Student {
    String name;
    int id;
    int age;
    String branch; 

    public void makeNoise(){
        System.out.println("Students make noise");
    }
    public void studStudy(){
        System.out.println("Students are studying");
    }
    public Student(String name, int age, int id , String branch){
       this.name = name ;
       this.id = id ;
       this.branch = branch;
       this.age= age ;
       // System.out.println("heyy student");
    }
    public String toString(){
    return this.name + " " + this.id;
    }
}

public class DAY_9 {
    public static void main(String[] args) {
        
    
    
                Student s1 = new Student("Gayathri", 19, 25, "CSE"); // default constructor
                //s1.name = "Gayathri";
               // s1.id = 25;
                //s1.branch = "CSE";
                //s1.age = 19;
                System.out.println(s1); //Student@7a81197d //toString fun() // location of s1
               // System.out.println(s1.name);

                
            
            
        
        Student s2 = new Student("John", 19 , 21, "CSE" );
               // s2.name = "Gayathri";
               // s2.id = 25;
               // s2.branch = "CSE";
                //s2.age = 19;
                System.out.println(s2);
                
                //System.out.println(s1==s2);

                Student s3 = s1;
              //  s3.name = "Shiri";
              //  System.out.println(s1.name); //shiri
              //  System.out.println(s2.name); //gayathri
               // System.out.println(s3.name); //shiri
                
        }
    }
# problems
    public int maxMod5(int a, int b) {
  if (a == b) {
        return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b); 
        }
        else{
        return Math.max(a, b);
}
}
#problem
    public int sumLimit(int a, int b) {
  int sum = a + b;
        if (String.valueOf(sum).length() > String.valueOf(a).length()) {
            return a;
        } else {
            return sum;
}
}
#problem
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
   if (equalOk) {
            return a <= b && b <= c; 
        } else {
            return a < b && b < c;    
        }
}
#problem
    public int sumLimit(int a, int b) {
  int sum = a + b;
        if (String.valueOf(sum).length() > String.valueOf(a).length()) {
            return a;
        } else {
            return sum;
}
}
#problem
    public boolean specialEleven(int n) {
  if(n%11 ==0 || n%11 == 1){
    return true;
  }
  return false;
}
#problem
    public boolean old35(int n) {
  if(n % 3 == 0 && n % 5 == 0){
  return false;
} else if(n % 3 == 0 || n % 5 == 0){
return true;
}
return false;
}
#problem
    public boolean in1To10(int n, boolean outsideMode) {
if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
}

