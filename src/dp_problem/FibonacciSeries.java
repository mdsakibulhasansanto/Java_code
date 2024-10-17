
// For Loop ব্যবহার করে Fibonacci Series-এর প্রথম দশটি সংখ্যা প্রিন্ট করার প্রোগ্রাম
package dp_problem;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}


/*

Fibonacci সিরিজ এমন একটি সংখ্যা সিরিজ যেখানে প্রতিটি সংখ্যা তার পূর্বের দুটি সংখ্যার যোগফল হয়।
এই সিরিজটি ০ এবং ১ দিয়ে শুরু হয়।
এরপর প্রতিটি সংখ্যার জন্য নিয়ম অনুসারে যোগফল নির্ণয় করে নতুন সংখ্যা বের করা হয়।
 */
