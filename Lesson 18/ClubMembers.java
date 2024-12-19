import java.util.ArrayList;
import java.util.Iterator;

class MemberInfo {
    private final String name;
    private final int gradYear;
    private final boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    @Override
    public String toString() {
        return name + " (" + gradYear + ", " + (hasGoodStanding ? "Good Standing" : "Not in Good Standing") + ")";
    }
}

public class ClubMembers {
    private final ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<>();
    }

    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            MemberInfo newMember = new MemberInfo(name, gradYear, true);
            memberList.add(newMember);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedMembers = new ArrayList<>();
        Iterator<MemberInfo> iterator = memberList.iterator();
        while (iterator.hasNext()) {
            MemberInfo member = iterator.next();
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    graduatedMembers.add(member);
                }
                iterator.remove();
            }
        }
        return graduatedMembers;
    }


    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    public void printMembers() {
        for (MemberInfo member : memberList) {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        ClubMembers club = new ClubMembers();
        String[] newMembers = {"Smith, Jane", "Fox, Steve", "Xin, Michael", "Garcia, Maria"};
        String[] graduatedm = {"Notch, Sheep", "Killer, hen"};

        club.addMembers(newMembers, 2019);
        club.addMembers(graduatedm, 2018);
        System.out.println("After adding members:");
        club.printMembers();
        ArrayList<MemberInfo> graduated = club.removeMembers(2018);
        System.out.println("\nGraduated members in good standing:");
        for (MemberInfo member : graduated) {
            System.out.println(member);
        }
        System.out.println("\nRemaining members:");
        club.printMembers();
    }
}
