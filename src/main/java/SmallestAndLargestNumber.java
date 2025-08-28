import java.util.Arrays;
public class SmallestAndLargestNumber
{
public static void main(String[] args)
{

int numbers[] = {0,10,7,9,11,-1};

int largest=numbers[0];
int smallest=numbers[0];

for(int number: numbers)
{
 if(number>largest)
	largest=number;
 else if(number < smallest)
   	smallest=number;
}
System.out.println("Array is:" + Arrays.toString(numbers));
System.out.println("Largest number is: "+largest);

System.out.println("Smallest number is: "+smallest);


}
}