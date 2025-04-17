import java.util.ArrayList;
public class ClubMembers {  
private ArrayList<MemberInfo> memberList;  

public ClubMembers() {
    memberList = new ArrayList<MemberInfo>();
}

public void setMemberList(ArrayList<MemberInfo> members) {
    memberList = members;
}

public void addMembers(String[] names, int gradYear) { 
    for (String person : names) {
        memberList.add(new MemberInfo(person, gradYear, true));
    }
}  

public ArrayList<MemberInfo> getMemberList() {
    return memberList;
}
 
public ArrayList<MemberInfo> removeMembers(int year) {
    ArrayList<MemberInfo> array = new ArrayList<MemberInfo>();
    for (int i = 0; i < memberList.size(); i++) {
        if (memberList.get(i).inGoodStanding() == true && (memberList.get(i).getGradYear() == year || memberList.get(i).getGradYear() < year)) {
            array.add(memberList.get(i));
        }
    }
    for (int j = memberList.size() - 1; j > -1; j--) {
        if (memberList.get(j).getGradYear() == year || memberList.get(j).getGradYear() < year) memberList.remove(j);
    }

    return array;
}  
 
}  
