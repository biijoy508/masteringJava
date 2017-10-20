package constructorReuse;

public class ReuseMe {

    private static String name;
    private static Integer account;

    public ReuseMe(){
        this(name);
    }
    public ReuseMe(final String name){
          this(name, account);
    }
    public ReuseMe(final String name, final Integer account){
      this("1",2,3.00,4,5,new TraineeType());
    }

    /**
     * constructor(blah, blah, blah)
     *@param objects
     */
    public ReuseMe(final Object...objects ){
      for(Object c : objects){
        System.out.println(c.getClass().getTypeName());
      }
    }

}
