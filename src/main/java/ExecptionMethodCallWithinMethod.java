

public class ExecptionMethodCallWithinMethod {


    public void method1(int a){
//
//        try{
//            method2(2);
//        }
//        catch (ArithmeticException ex){
//            System.out.println("metod1 exception");
//        }

        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }

    }

    public void method2(int a){

//        try{
//            int b= a/0;
//        }
//        catch (ArithmeticException ex){
//            System.out.println("method2 exception");
//        }

        try
        {
            method1(2);
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}
