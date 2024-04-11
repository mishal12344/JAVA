public class complex{
double a,b;
complex(double r,double i){
this.a=r;
this.b=i;
}
public static complex sum(complex c1,complex c2)
{
complex temp=new complex(0,0);
temp.a=c1.a+c2.a;
temp.b=c1.b+c2.b;
return temp;
}
public static void main(String args[]){
System.out.println("THASNI NOUFAL\n 23MCA057\n 13-2-2024");
complex c1=new complex(5,4);
complex c2=new complex(6,3.5);
complex temp=sum(c1,c2);
System.out.printf("sum is:"+temp.a+"+"+temp.b+"i\n");
}
}

