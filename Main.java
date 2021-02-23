class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Jamie Schaffer");
    student1.setGPA(4.00);
    student1.setMajor("Accounting");

    student1.name = "Jamie Schaffer";
    student1.gpa = 4.0;
    student1.major = "Accounting";

    System.out.println("student1's name is " + student1.getName() + " and their GPA is " + student1.getGPA() + " and their major is " + student1.getMajor());

    System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major); 
     
  }
}