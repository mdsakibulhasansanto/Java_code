
// Copy Constructor ব্যবহারের করে একটি Program
package dp_problem;
 class Information {
    String name;
    int age ;
    Information (String name){
        this.name = name;
        System.out.println("Name : "+name);
    }

    Information (int age ){
        this.age = age;
        System.out.println("Age : "+age);
    }
}

class DisPlayCopyConstructor {
    public static void main(String[] args) {
        Information information1 = new Information("Md Sakibul Hasan Santo");
        Information information2 = new Information(20);
    }
}
