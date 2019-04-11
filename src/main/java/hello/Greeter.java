package hello;



public class Greeter {



  private String name = "";



  public String getName() 

  {

    return name;

  }



  public void setName(String name) 

  {

      this.name = name;

  }



  public String sayHello() 

  {

  	if (name == "") 

    {

       return "Hello!";

    }

    else 

    {

       return "Hello " + name + "!";

    }

  }

   public String sayAnnesTheMan() 

  {

    if (name == "") 

    {

       return "Who's the man?";

    }

    else 

    {

       return name + " the mf man!";

    }

  } 

}