
class Student{
    String name;
    String age;
    public void print(String name){
        System.out.println(name);
    }
    public void print(int age){
        System.out.println(age);
    }
    public void print(String name,int age){
        System.out.println(name+" "+age);
    }


}
public class polymoephism01 {
    public static void main(String[] args) {
        Student s=new Student();
        s.print("akash");
        s.print(23);

    }
}
