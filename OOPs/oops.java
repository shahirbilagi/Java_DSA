package OOPs;
 class Student{
    String name;
    int age;
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String args[])
    {
        Student s=new Student();
        s.name="shahir";
        s.age=13;
        s.print();
    }
}
