package tutorialspoint;



public class Best_Friend { 
    String name; 
    int age; 
    String college; 
    String course; 
    String address; 
    Best_Friend 
    (String name, int age, String college, String course, String address) 
    { 
        this.name = name; 
        this.age = age; 
        this.college = college; 
        this.course = course; 
        this.address = address; 
    } 
    @Override
    public String toString() {
    	
    	return name+""+age+""+college;
    }
public static void main(String[] args) 
    { 
        Best_Friend b =  new Best_Friend("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu"); 
        System.out.println(b); 
       // System.out.println(b.toString()); 
    } 
} 

