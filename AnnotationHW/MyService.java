class MyService 
{
    @MyAnnotation
    private MyRepository repository;    
    
    public void execute()
    {
        repository.saveData();
    }
}