import javax.swing.JOptionPane;

class TestZoo{

    public static void main(String args[] )
    {
          ZooTaiping [] zt = new ZooTaiping [20]; //Declare an array of objects to store 20 data information
          Boolean gServant = false;
          Boolean pA = false;
          Boolean pB = false;
          Boolean pC = false;
          int countDay = 0;
          int countNight = 0;
          double sumDay = 0.0;
          double sumNight = 0.0;
          double sumtotal = 0.0 ;
          String C =" ";
           
              
          for (int i = 0; i<zt.length; i++){    
           
            String time = JOptionPane.showInputDialog("Select booking time [D- Daytime/N- Nighttime]: ");
                     
            if(time.equalsIgnoreCase("D")){
               
                String ct = JOptionPane.showInputDialog("Select Category [Adult/Children]:");
                String vName = JOptionPane.showInputDialog("Enter visitor Name : ");
                String icNumber = JOptionPane.showInputDialog("Enter IC number: ");
                String gS = JOptionPane.showInputDialog("Are the visitor goverment Servant? [Yes/No]");
                if(gS.equalsIgnoreCase("Yes")){
                    gServant = true;                
                }
                 else if(gS.equalsIgnoreCase("No")){
                    gServant = false;              
                }  
                                
                zt [i] = new DayVisit (vName,icNumber,gServant,ct); //The number of data to be stored and information on each visitor is given by the user.
                countDay++;
                sumDay+=zt[i].totalCharge();
            }
            
            else if(time.equalsIgnoreCase("N") ){
               
                String vName = JOptionPane.showInputDialog("Enter visitor Name : ");
                String icNumber = JOptionPane.showInputDialog("Enter IC number: ");
                String gS = JOptionPane.showInputDialog("Are the visitor goverment Servant? [Yes/No]");
                
                if(gS.equalsIgnoreCase("Yes"))
                    gServant = true;
                else if(gS.equalsIgnoreCase("No"))
                    gServant = false;    
                    
                String pckg = JOptionPane.showInputDialog("Select Package [A/B/C]: ");
                if(pckg.equalsIgnoreCase("A"))
                    pA = true;
                else if(pckg.equalsIgnoreCase("B"))
                    pB = true;
                else if(pckg.equalsIgnoreCase("C")){
                    pC = true;
                }
                
                zt [i] = new NightVisit (vName,icNumber,gServant,pA,pB,pC);//The number of data to be stored and information on each visitor is given by the user.             
                countNight++;
                sumNight+=zt[i].totalCharge(); 
                
                if(pckg.equalsIgnoreCase("C"))
                     C +=  zt[i].toString();
            }               
            sumtotal = sumDay+sumNight;                
        }          
         //Calculate and display the number of visitors for each category (day and night visit) and the total income for the Zoo Taiping.
          System.out.println("The number of visitor for Day Time : "+ countDay);
          System.out.println("\nThe number of visitor for Night Time : "+ countNight);
          System.out.println("\nThe total income for ZooTaiping daily : RM "+ sumtotal);
          //Find and display all visitor details that choose package C for the night visit Zoo promotion.
          System.out.println("\nVisitors that choose package C for night visit Zoo promotion : "+ C+ "\n");
         }
    }