public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Car car = new Car();
        Injector.inject(car);
        car.drive();
    }
    
}
