class base {
    int a,b,c;
    base(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}
class derived extends base
{
    derived(int a,int b,int c)
    {
        super(a, b);
        c=this.c;
    }
}
class parameterized_super
{
    public static void main(String[] args) {
        derived ob=new derived(3,4,5);
    }
}
