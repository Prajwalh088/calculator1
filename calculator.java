class calculator
{
    float a;
    float b;
    public void Add(float a, float b)
    {
        float c=a+b;
        System.out.println("the sum of the float value is "+c);

    }

    public void sub(float a , float b)
    {
        float c=a-b;
        System.out.println("the difference of the float values isb"+c);
    }
    public void prod(float a,float b)
    {
        float c=a*b;
        System.out.println("the product of the two float values is "+c);
    }
    public void div(float a,float b)
    {
        float c=a/b;
        System.out.println("the product of the two float values is "+c);
    
    }
    public void square(int a)
    {
        int c=a*a;
        System.out.println("the square of the number is:"+c);
    }
   
    public void cube(int a)
    {
        int c=a*a*a;
        System.out.println("the cube of the number is:"+c);
    }


    public static void main(String agrs[])
    {
        calculator c=new calculator();
        c.Add(10,20);
        c.sub(20,10);
        c.prod(5,4);
        c.div(3,5);
        c.square(3);
        c.cube(3);
    }
}
