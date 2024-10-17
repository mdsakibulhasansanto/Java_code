//Method Overloading ব্যবহারের করে একটি Program
package dp_problem;
 class MethodOverloading {

     String name ;
     int rollNumber;
     int age ;

     void Information (String name){
         this.name = name;
         System.out.println("Name : "+name);
     }

     void Information (int RollNumber,int age){
         this.rollNumber = RollNumber;
         this.age = age;
         System.out.println("Roll number : "+rollNumber);
         System.out.print("Age : "+age);
     }

}
 class DisplayMethodOverloading {
     public static void main(String[] args) {
         MethodOverloading methodOverloading = new MethodOverloading();
         methodOverloading.Information("Md Sakibul Hasan Santo");
         methodOverloading.Information(10,15);
     }
}
