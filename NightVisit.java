public class NightVisit extends ZooTaiping{
    private boolean packageA; //if the visitor choose package A
    private boolean packageB; //if the visitor choose package B
    private boolean packageC; //if the visitor choose package C
   
    public NightVisit (String nm, String ic, boolean gomen,boolean A,boolean B, boolean C) {
        super(nm,ic,gomen);
        this.packageA = A;
        this.packageB = B;
        this.packageC = C;
    } //Normal constructor
    
    public boolean getA(){
        return packageA;    
    }
    
    public boolean getB(){
        return packageB;    
    }
    
    public boolean getC(){
        return packageC;    
    }
    
    public double totalCharge(){
       double tot = 0.0;
       String adult = "Adult";
       //String child = "Children";
        
       if(govServant == true )
       {
            if(packageA == true)
                tot = 50*0.85;
            else if (packageB == true)
                tot = 75*0.85;  
            else if (packageC == true)
                tot = 100*0.85; 
       }
       else if (govServant == false )
       {
            if(packageA == true)
                tot = 50;
            else if (packageB == true)
                tot = 75;   
            else if (packageC == true)
                tot = 100; 
       }
       return tot;
        }
     
    public String toString(){
    return "\nVisitor name : "+ visitorName + "\nIC Number : " + icNumber + "\nGoverment Servant : "+ govServant; 
    }

}