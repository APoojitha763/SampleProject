//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.IOException;
import java.beans.Expression;

public class main {
    public static void main(String[] args) {

        String text = "HelLo locate";

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
       //System.out.println(String.index of("locate"));
        //CONCATINATION
        String str1 ="Hello";
        String str2 = "World";
        System.out.println(str1+" "+str2);
        System.out.println(str1.concat(str2));
        //math objects
        System.out.println(Math.max(200,2000));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-25));
        System.out.println(Math.random());
        //Booleans
        System.out.println(10>100);
        //Conditions
        if(10>20){
            System.out.println("its 10");
        }
        else if(30>20){
            System.out.println("its 30");

        }
                else{
            System.out.println("its 20");

        }

                // terinary operator
                int time = 20;
                String result=(time<18)?"time is lessthan 20":"time is 20";
                System.out.println(result);

                //Switch
                int day = 3;
                switch(day){
                    case 1:
                        System.out.println("Monday");
                    case 2:
                        System.out.println("Tuesday");
                    case 3 :
                        System.out.println("wed");
                //while loop
                int i=0;
                while(i<5){
                    System.out.println(i);
                    i++;

                }
                //do while
                  int j=5;
                do{
                    System.out.println(j);
                    j++;

                }while(j<10);



                }
                //just methods
                methods.myMethod();
                //methods with parameters
                methods.methodParameter("poojitha",9);
                //method with return type
                System.out.println(methods.returnType(10));
                //method overloading
                System.out.println(methods.returnType(20,7));

                //creating objects for methods and classes
                ClassandObjects obj=new ClassandObjects();
                obj.myclass();
                ClassandObjects obj1=new ClassandObjects();
                obj1.mymethod();

                //constructors
                //int p;
                constructor obj2=new constructor();
                System.out.println(obj2.p);

                //OOPS
                // INHERITANCE
                Vechile obj4 = new Vechile();
                obj4.ChildCars();
                obj4.ParentCars();
            }
}