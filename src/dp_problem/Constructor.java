package dp_problem;

 class Person {
     String name ;

     // Constructor create
     Person(String name){
         this.name = name;
     }

     void disPlay (){
         System.out.print("Name : "+name);
     }
}

class  ConstructorClass {
    public static void main(String[] args) {

        Person person = new Person("Md Sakibul hasan santo");
        person.disPlay();
    }
}
