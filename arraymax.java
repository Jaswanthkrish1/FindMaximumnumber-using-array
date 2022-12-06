import java.util.*;
class arraymax
{
    public static void main(String args[])
{
  int g;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array lenth");	

g=sc.nextInt();
int arr[]=new int[g];
System.out.println("Enter values in array");
for(int i=0;i<arr.length;i++)
                 {
                   arr[i]=sc.nextInt();
                  }
System.out.println("OriginalArray values are :");
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+"");
System.out.println();
}

Arrays.sort(arr);
System.out.println("LEANER SORT");
for(int i=0;i<arr.length;i++)
{
 System.out.println(arr[i]+" ");
}

//System.out.println("Rverseing array");

//for(int i=arr.length-1;i>=0;i--)
//{
//System.out.println(arr[i]+" ");
//} 

int d=arr[g-1];  /**The start fron 0 , but store total length of arry -1,ex(a(0)=25, a(1)=25,a(2)=25,a(3)=25, the length of array is 4) array.length-1 that**/
// print maximumvalue
{
System.out.println("max value :="+d);
}
// find the value of remining array except d
int sum=0;
 for(int i=0;i<g-1;i++)
{
sum=sum+arr[i];
}
System.out.println("To remining sum:="+sum);
// Setting the max value equal to remaining value
if(sum==d)
{
System.out.println("The values of array equal to the maximum value");
}
else
{
System.out.println("The sum of least are not equal to max value");
}
}

  }