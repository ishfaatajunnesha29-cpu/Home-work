import java.lang.reflect.Field;

class Injector 
{
    public static void inject(Object obj) throws Exception
    {

        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field field : fields)
        {
            if(field.isAnnotationPresent(Inject.class))
            {
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
    }
}
