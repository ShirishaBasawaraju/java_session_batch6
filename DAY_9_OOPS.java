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

