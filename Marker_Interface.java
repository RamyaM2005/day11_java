interface Printable
{
}
class h implements Printable
{
    public void print()
    {
        System.out.println("Hello");
    }
}
class Marker_Interface
{
    public static void main(String[] args) {
        h f=new h();
        f.print();
    }
}