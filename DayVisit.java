public class DayVisit extends ZooTaiping{
    String category;
    public DayVisit (String nm, String ic, boolean gomen, String ctgry){
        super(nm,ic,gomen);
        this.category = ctgry;
    }
    
    public double totalCharge(){
        double tot = 0.0;
        String adult = "Adult";
        String child = "Children";
        
        if(category.equalsIgnoreCase(adult)){
            if(govServant == true )
                tot = 25*0.85;
            else if (govServant == false)
                tot = 25;
        }
        else if(category.equalsIgnoreCase(child)){
            if(govServant == true )
                tot = 15*0.85;
            else if (govServant == false)
                tot = 15;     
        }     
        return tot;
        }  
     
    public String toString(){
    return "Visitor name : "+ visitorName + "\nIC Number : " + icNumber + "Govermant Servant : "+ govServant; 
    }

}