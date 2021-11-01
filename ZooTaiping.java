public abstract class ZooTaiping{
    String visitorName;
    String icNumber;
    boolean govServant;    
    
    
    public ZooTaiping(){
        visitorName = " ";
        icNumber =  " ";
        govServant = false;        
    }
    
    public ZooTaiping(String nm, String ic, boolean gomen){
        this.visitorName = nm;
        this.icNumber = ic;
        this.govServant = gomen;
        
    }
    
    public abstract double totalCharge();
    
    public String toString () {
        return "Visitor name : "+ visitorName + "\nIC Number : " + icNumber + "Govermant Servant : "+ govServant;    
    }
    

}