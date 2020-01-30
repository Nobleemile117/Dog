
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    private int age;
    private Raza raza;
    private String OwnerName;
   private String name;
    
     

    /**
     * Constructor for objects of class Dog
     */
    public Dog(int age, Raza raza)
    {
        // initialise instance variables
       this.age= age;
       this.raza = raza;
    }

    public void birthday(){
        age++;
}
public void setOwner(String Owner){
OwnerName=Owner;

}
public void setname(String name){
        this.name=name;
}
public String getname(){
	
	return name;
}

}