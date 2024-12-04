package Constructor;

import java.util.Scanner;

public class Constructor {


    Constructor (String name){
        String Name = name;

        System.out.print(Name);
    }

}


class Main {

    public static void main(String[] args) {
        Constructor constructor = new Constructor("Santo");
    }
}
