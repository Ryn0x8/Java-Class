class SingleTable {
    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int numSeats, int height, double viewQuality) {
        this.numSeats = numSeats;
        this.height = height;
        this.viewQuality = viewQuality;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        this.viewQuality = value;
    }
}

class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.table1 = t1;
        this.table2 = t2;
    }

    public boolean canSeat(int numPeople) {
        int totalSeats = table1.getNumSeats() + table2.getNumSeats() - 2;
        return numPeople <= totalSeats;
    }

    public double getDesirability() {
        double avgViewQuality = (table1.getViewQuality() + table2.getViewQuality()) / 2.0;
        if (table1.getHeight() != table2.getHeight()) {
            return avgViewQuality - 10.0;
        }
        return avgViewQuality;
    }
}

public class ACP {
    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 74, 60.0);
        SingleTable t2 = new SingleTable(8, 74, 70.0);
        SingleTable t3 = new SingleTable(12, 76, 75.0);

        CombinedTable c1 = new CombinedTable(t1, t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());

        CombinedTable c2 = new CombinedTable(t2, t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());

        t2.setViewQuality(80.0);
        System.out.println(c2.getDesirability());
    }
}
