//droid program

public class Droid {
  public static void main(String args[]){
    Droid myDroid = new Droid(); 
    
    myDroid.activate(); 
    
    myDroid.chargeBattery(5); 
    
    myDroid.hover(1);
    
    
    
    
    
  }
  
  public int batteryLevel; 
  
  public Droid () { 
  
    int batteryLevel = 100; 
  } 
  
  public void activate () { 
 
    System.out.println ("Activated!");
    
      batteryLevel = (100 - 5); 
  
    System.out.println("Battery Level is "+ batteryLevel +"percent.");
  }
  
  public void chargeBattery (int hours) { 
  
    System.out.println("droid charging...");
    
    batteryLevel = (batteryLevel+hours);
    
    if (batteryLevel < 100) { 
    System.out.println("Needs to charge");
    }
    
    if (batteryLevel > 100) { 
    System.out.println("Done!");
    batteryLevel = 100; 
    }  
    
    else if (batteryLevel == 100) { 
    System.out.println(batteryLevel); 
      
    }
         
    
  }
  
  public int checkBatteryLevel () { 
  System.out.println(batteryLevel); 
    return batteryLevel; 
   
  }
  
  public void hover (int feet) { 
  if (feet>2) { 
  System.out.println("error! too high");
  }
  else if (feet<2) { 
  System.out.println("hovering!"); 
  batteryLevel = batteryLevel - 20; 
  System.out.println(batteryLevel); 
  }
  }
 
  
  
}