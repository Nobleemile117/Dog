
/**
 * Write a description of class Owner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Owner
{
     
   
    private int age;
    private Gender gender;
    private Dog dog;
    private String name;
    
    
    
    /**
     * Constructor for objects of class Owner
     */
    public Owner(int edad, Gender gender)
    {
        // initialise instance variables
       this.age=age;
       this.gender=gender;
    }
  public Owner(int edad, Gender gender, String name)
    {
        // initialise instance variables
       this.age=age;
       this.gender=gender;
       this.name=name;
    }

    public void birthday(){
    age+=1;
    }
 
    public void setname(String name){
        this.name=name;
}
public void setname(String name, String lastname){
        this.name=name+ ""+ lastname;
}
public void setdog(Dog dog){
	this.dog=dog;
	dog.setname("Jacob");
	dog.setOwner(name);
	
}
public String getname(){
	
	return name;
}


}