package data_type;

import java.lang.reflect.Array;

public class array_ {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        System.out.println("Length of array: " + numbers.length);


        System.out.println("Array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

/*
Array একটি ডেটা স্ট্রাকচার যা একই ডেটা টাইপের একাধিক উপাদান (element) একটি তালিকায় ধারণ করে।
 অ্যারের প্রতিটি উপাদান নির্দিষ্ট একটি ইন্ডেক্স দ্বারা চিহ্নিত করা হয়, যা সাধারণত ০ থেকে শুরু হয়।
 */