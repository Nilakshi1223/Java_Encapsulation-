public class Person {
    private int salary;

    public int getSalary (){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

}
 class PersonSalary{

     public static void main(String[] args) {

         Person p = new Person();
         p.setSalary(500000);
         System.out.println("Person's salary is :- " + p.getSalary());
     }
 }