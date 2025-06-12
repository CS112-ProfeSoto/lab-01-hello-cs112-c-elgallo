/**
 * Represents <This class contains all necessary info for the presence of a species of butterfly and the amount of the said species currently present>
 *
 * @author <crosas@miracosta.edu>
 *
 **/

public class Butterfly {

    /***** INSTANCE VARIABLES *****/
        private String butterflySpecies;
        private int numButterflies;
        
    /***** CONSTRUCTORS *****/
    
    /*
    no-argument/ defalt constructor , sets default values for the book information
    
    @param no method paramter duee to being a default constructor 
    
    @param does not return anything 
    
    */
    public Butterfly()
    {
        this.butterflySpecies = "Monarch Butterfly"; // since the instance variables are not passed in then the this. in not necessarily needed
        this.numButterflies = (int) Math.random()* 6 + 1; 
    }
    
    /*  
        Full Constructor, intakes parameters and assigns them definitions through "this"
    * @param parameters are String butterflySpecies which tells the user what the species of the butterfly is, and numButterflies which tells the exact amount of butterflies there are
    
    * @param has no return type 
    */
    public Butterfly(String butterflySpecies, int numButterflies) 
    {
        this.butterflySpecies = butterflySpecies;
        this.numButterflies = numButterflies;
    }
    
    /***** ACCESSORS *****/

    public String getbutterflySpecies() 
    {
        return this.butterflySpecies;
    }
    
    public int getnumButterflies() 
    {
        return this.numButterflies;
    }

    /***** MUTATORS *****/

    public void setbutterflySpecies(String butterflySpecies)
    {
        this.butterflySpecies = butterflySpecies;
    }

    public void setnumButterflies(int numButterflies) 
    {
        this.numButterflies = numButterflies;
    }
    
    /***** toString Method *****/

    public String toString()
    {
        return "Butterfly Species: " + butterflySpecies + " , " + "Butterfly population: " + numButterflies;
    }

    /***** equals Method *****/

    public boolean equals(Butterfly other)
    {
        return this.butterflySpecies.equals(other.butterflySpecies)
        && this.numButterflies == (other.numButterflies);
    }

}
