


import java.io.*;
public class Main{
public static void main(String []args){

File file=new File("archivo.csv");
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String line; 
  int line=0;
  while ((line = br.readLine()) != null) 
    System.out.println(line); 
if(line>0){
string []params=line.split(",");
string nombre =params[0];
int age = Integer.parseint(params[1]);
Dog Dog =new Dog(age, name);

System.out.println(Dog.getname()+"otra cosa");
System.out.println(Dog.getname());
}


    linenumber++;
  } 


public static void main1(String []args){
Owner German = new Owner(19, Gender.MALE, "German");
Owner Ow2= new Owner(20, Gender.FEMALE, "Ow2");
Owner Ow3= new Owner(25, Gender.FEMALE, "Ow3");
Owner Ow4= new Owner(38, Gender.FEMALE);
Dog Jacob= new Dog(6,Raza.PUG);
Dog D2= new Dog(6, Raza.BULL_DOG);
Dog D3= new Dog(6, Raza.BULL_DOG);



German.setdog(Jacob);
Ow2.setdog(D2);
Ow3.setdog(D3);

System.out.println(German.getname());
System.out.println(Jacob.getname());	
System.out.println(Ow2.getname());	
System.out.println(D2.getname());
System.out.println(Ow3.getname());	
System.out.println(D3.getname());	
}
}