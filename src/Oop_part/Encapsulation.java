package Oop_part;

public class Encapsulation {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Md sakibul hasan santo");
        person.SetNum(20);
        System.out.println(person.getName());
        System.out.println(person.getNumber());
    }
}

class Person {

     private String name;
    private  int Number;
    // setter
    public void setName(String name) {
        this.name = name;
    }
    public  void  SetNum(int number){
        this.Number = number;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getNumber (){
        return Number;
    }

}

/*
Encapsulation হলো ডেটা এবং মেথডকে একত্রে প্যাকেট করা। ডেটা হাইড করার জন্য এটিকে প্রাইভেট করা হয়,
এবং শুধুমাত্র পাবলিক মেথডের মাধ্যমে অ্যাক্সেস করা যায়।
এতে ডেটা সুরক্ষিত থাকে এবং প্রাইভেট ফিল্ডগুলোকে বাইরের ওয়ার্ল্ড থেকে সরাসরি পরিবর্তন করা যায় না।
 */
