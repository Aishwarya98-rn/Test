
public class mainClass {

public mainClass() {
// TODO Auto-generated constructor stub
add(5, 6);
}
public static void main(String[] args) {
System.out.println("Hello Aishwarya");
mainClass m = new mainClass();
// int a=5;
// int b=6;
// int c = a + b;
// System.out.println("C valus is : "+c);
}

public void add(int a, int b) {
if(a == 0 || b == 0) {
System.out.println("Value should be greater than 0");
}else {
int c = a + b;
System.out.println("C valus is : "+c);

if(a == 1 || b == 1)
{
int d = a + b;
System.out.println("d valus is : "+c);
}
else if(a == 1 || b == 1) {
int e = a + b;
System.out.println("e valus is : "+c);
}else if(a == 2 || b == 2) {
int f = a + b;
System.out.println("f valus is : "+c);
}else if(a == 3 || b == 3) {
int g = a + b;
System.out.println("g valus is : "+c);
}else if(a == 4 || b == 4) {
int h = a + b;
System.out.println("h valus is : "+c);
}
else
{
System.out.println("valus is greater than 5");
}

}}
}