
class pen{

    String color;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }


} class student{
    String name;
    int age;
    //String city;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        //System.out.println(this.city);
    }
    student(student s2){
        System.out.println("constructor called");
        this.name=s2.name;
        this.age=s2.age;
       // this.city=city;
    }
    student(){

}







}

    public class opps01 {
    public static void main(String[] args) {
//       pen obj1=new pen();
//        obj1.color="red";
//        obj1.type="bule";
//        obj1.write();
//        obj1.printcolor();
//        obj1.color="green";
//        obj1.printcolor();

        Student st=new Student();

       st.name="akash";
       st.age=25;
       // Student s1=new Student(st);
       // st.printinfo();


    }
}
