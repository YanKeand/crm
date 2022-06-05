public  class Hello{
public static void main(String[]args){
    ecap ecap = new ecap();
    ecap.setAge(20);
    ecap.name = "小黄";
    System.out.println(ecap.getAge());

}
}
 class ecap{
    public String name;
    private int age;
    private double salary;

     public ecap() {

     }

     public void setname(String name){
        this.name = name;
    }
    public String getname(String name){
        return name;
    }

     public ecap(String name, int age, double salary) {
         setAge(age);
         setname(name);
         setSalary(salary);
     }

     public int getAge() {
         return age;
     }

     public double getSalary() {
         return salary;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }
 }
