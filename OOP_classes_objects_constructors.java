class Student{
    String name;
    int age;
    String branch;
    Student(){
        System.out.println("Deafault constructor called");
    }
    Student(String name){
        this.name=name;
        //System.out.println("name is "+name);
    }
    Student(String name,int age,String branch){
            this.name=name;
            this.age=age;
            this.branch=branch;
    }
    public  void display(){
        System.out.println(name+" is "+age+" years "+branch+" student");
        
    }
    public static void main(String args[]){
        //Student s1=new Student();
        // s1.name="Samu";
        // s1.age=12;
        // s1.branch="comp";
        // s1.display();
        Student s=new Student();
        s.display();
        Student ss= new Student("Sam");
        ss.display();
       Student s2=new Student("Kayva",12,"comp");
       s2.display();
    }
}