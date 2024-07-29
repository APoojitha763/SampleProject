
public class methods{
    public static void myMethod(){
        System.out.println("Methods class");

    }
    //METHOD WITH PARAMETERS
    public static void methodParameter(String name, int age){

        System.out.println(name+" "+age);
    }
    //RETURN TYPES
    public static int returnType( int y){

        return 10+y;
    }

    // METHOD OVERLOADING
    public static double returnType(int z, int n){
        return z % n;
    }

    
}