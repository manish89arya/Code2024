package manish;

public class StringTest{


public static void main(String[] args) throws InterruptedException
{

StringBuilder sb = new StringBuilder();
sb.append("Manish").reverse();
System.out.println(sb);

Task t1 = new Task(sb);
Task t2 = new Task(sb);

t1.start();
t2.start();

t1.join();
t2.join();

System.out.println(sb.length());


}
}

class Task extends Thread  {

private StringBuilder sb;

public Task(StringBuilder sb)
{
this.sb = sb;

}

@Override
public void run()
{
for(int i=0; i<1000; i++)
	{
sb.append("a");
	}
}


}
