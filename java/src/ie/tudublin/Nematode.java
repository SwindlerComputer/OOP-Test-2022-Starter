package ie.tudublin;

public class Nematode 
{
    private String name;
    private boolean eyes;  //boolean for true or false
     private char gender;
    private boolean limbs;
    private int length;
    

  
   
    
    public String toString() 
    {

        
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs + ", name="
             + name + "]";
    }


    

    //tablerow constructor
    public Nematode(TableRow tr)
    {
        this(tr.getString("name"), tr.getInt("length"), tr.getInt("limbs") == 1, tr.getChar("gender"), tr.getInt("eyes") == 1);
    }
  
    
    //constructor
    public Nematode(String name, int length, boolean limbs, char gender, boolean eyes) {
        this.name = name;
        this.eyes = eyes;
        this.gender = gender;
        this.limbs = limbs;
        this.length = length;
        
       
       
    }
    //accessors
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLength() {
        return length;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public boolean isLimbs() {
        return limbs;
    }
    public void getLimbs(boolean limbs) {
        this.limbs = limbs;
    }
    public void setLength(int length) {
        this.length = length;
    }
  
}