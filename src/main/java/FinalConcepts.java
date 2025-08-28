import java.lang.System;
public class FinalConcepts{


public static void main(String[] args)
{

try{

System.out.println("Inside Try");
System.exit(0);
throw new RuntimeException("run time exeception");


} catch(NullPointerException e)
{
System.out.println("Inside Catch");

try{
System.out.println("Inside nested try");
}
finally{
System.out.println("Inside nested finally");
}

}

finally{
System.out.println("Inside finally");
}



}

}