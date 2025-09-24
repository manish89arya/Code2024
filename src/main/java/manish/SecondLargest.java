package manish;

public class SecondLargest {


public static void main(String[] args)
{

	int[] a = {10,4,3,11,44,6,13,1};
	
	SecondLargest s1 = new SecondLargest();
	s1.findSecondLargest(a);


}

public void findSecondLargest(int[] input)
{

int max1 = input[0];
int max2 = input[1];

for (int i=2;i<input.length;i++)
{

if(max1<input[i])
{
if(max2 < max1)
{
max2 = max1;
}
max1 = input[i];
} 
else if (max2<input[i])
{
max2 = input[i];

}

}
System.out.println("Max1: "+max1+ " Max2: "+max2);

}


}