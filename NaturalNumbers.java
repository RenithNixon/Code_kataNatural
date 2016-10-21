import java.util.*;
class NaturalNumbers
{
public static void main(String args[])
{
int n,i,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n>0)
{
i=1;
while(i<=n)
{
sum+=i;
i++;
}
System.out.println("The sum of natural numbers is:"+sum);
}
else
{
System.out.println("Enter a valid number");
}
}
}
