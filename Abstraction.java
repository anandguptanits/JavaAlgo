
class Abstraction{


  public static void main(String args[])
  {
    Iphone iphone=new Iphone();
    Samsung sam=new Samsung();
    showConfig(iphone);
    showConfig(sam);

  }
   
   public static void showConfig(Phone ip)
   {
           ip.show();
   }

  

}


abstract class Phone{
    abstract void show();
}

class Iphone extends Phone{

    void show()
    {
        System.out.println("2gb ram 300mah white");
    }
}

class Samsung extends Phone{

    void show()
    {
        System.out.println("8gb ram 300mah white");
    }
}