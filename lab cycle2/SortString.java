public class SortString{
public static void main(String[] args)
{
String names[]={"st","joseph","college","of","engeneering"};
String temp;
int n=names.length;
int i;
int j;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(names[i].compareTo(names[j])>0)
{
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.println("the stored array of string is:");
System.out.println("Thasni Noufal\nRoll No:57\n26-02-2024\nQ6:Program to sort strings");
for(i=0;i<n;i++)
{
System.out.println(names[i]);
}
}
}
