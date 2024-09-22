package Method;

public class method_example {
    public static void main(String[] args) {

        MethodExample methodExample = new MethodExample();
        methodExample.Name();
        methodExample.suma(10,20);
        System.out.println(methodExample.suma(10,20)+30); // Return 30 + 30
    }

}

class MethodExample {

    void Name (){
        String name = "Md Sakibul hasan santo";
        System.out.println(name);
    }

    // ReturnType or parameters pass method
    int suma (int a, int b ){
        int firstNumber = a;
        int secondNumber = b;

        int result = firstNumber + secondNumber;
        return  result;
    }

}
