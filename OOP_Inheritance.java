public class OOP_Inheritance{
static class Dog{
    String name;
    void eat( ){
        System.out.print( name+" eats");
    }
    void sleep( ){
        System.out.print(name+" sleeps");
    }
}
static class Puppy extends Dog{
void plays(){
    System.out.print(name+"palys");
}
}
public static void main(String[]args){
    //String name="Sushi";
   
    Puppy p=new Puppy();
     p.name="sushi";
    Dog d=new Puppy();//upcasting
    d.name="Bruno";
    System.out.println(d.name);// variables are printed because it is decided  by reference class . 
    d.sleep();// methods are printed because it is decided  by objects class .
    
    p.eat();
    


    
}
}