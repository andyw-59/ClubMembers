public class MemberInfo {  
private String name;
private int gradYear;
private boolean hasgoodStanding;

public MemberInfo(String name1, int gradYear1, boolean hasGoodStanding1) {  
    name = name1;
    gradYear = gradYear1;
    hasgoodStanding = hasGoodStanding1;
}  

public int getGradYear() { 
    return gradYear;
}  
  
public boolean inGoodStanding() { 
    return hasgoodStanding;
}  

public String toString() {
    String s = "\nName: " + name + "\n";
    s += "Year: " + gradYear + "\n";
    return s + "Good Standing: " + hasgoodStanding + "\n";
}

} 
