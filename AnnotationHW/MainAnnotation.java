public class MainAnnotation 
{
    public static void main(String[] args) throws Exception
    {
        MyService service = new MyService();
        DependencyInjector.inject(service);
        service.execute();
    }    
}