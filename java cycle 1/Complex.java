import java.io.DataInputStream;
class Complex
{
int real;
int imag;
void read()
{
DataInputStream in=new DataInputStream(System.in);
try
{
System.out.println("enter the real part:");
real=Integer.parseInt(in.readLine());
System.out.println("enter the imaginary part:");
imag=Integer.parseInt(in.readLine());
}
catch(Exception e){}
}
void display()
{
System.out.println(real+"+"+imag+"i\n");
}
void add(Complex c2)
{
int temp_real,temp_imag;
temp_real=real+c2.real;
temp_imag=imag+c2.imag;
System.out.println("\n sum of complex numbers is"+temp_real+"+"+temp_imag+"i\n");
}
}
class Complex_5
{
public static void main(String args[])
{
Complex c1=new Complex();
Complex c2=new Complex();
System.out.println("\n enter first complex number:");
c1.read();
System.out.println("\n enter second complex number:");
c2.read();
System.out.println("\n first complex number is :");
c1.display();
System.out.println("\n second complex number is :");
c2.display();
c1.add(c2);
}
}