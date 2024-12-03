class DataSet {
    private final double[] data;
    private int dataSize;
    private double sum;
    public DataSet(){
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }

    public void add (double value){
        data[dataSize] = value;
        dataSize++;
        sum += value;    
    }

    public double getAverage(){
        if (dataSize == 0){
            return 0;
        }
        return sum / dataSize;
    }

    public double standardDeviation(){
        double sumofSquares = 0;
        double average = getAverage();
        for (int i = 0; i < dataSize; i++){
            sumofSquares += Math.pow(data[i]-average, 2);
        }

        return Math.sqrt(sumofSquares / dataSize);
    }

    @Override
    public String toString(){
        return "DataSet{"+
        "dataSize="+dataSize+
        "StandardDeviation="+standardDeviation()+
        "Average="+getAverage()+"}";
    }

    public static double CalculateAverage(DataSet[] datasets){
        double totalAverage = 0;
        for (DataSet d: datasets){
            totalAverage += d.getAverage();
        }

    return totalAverage / datasets.length;
}
}

public class Instance {
    public static void main(String[] args){
        DataSet ds1 = new DataSet();
        ds1.add(5.0);
        ds1.add(10.0);

        DataSet ds2 = new DataSet();
        ds2.add(3.0);
        ds2.add(7.0);
        ds2.add(12.0);

        System.out.println("Deviation of ds1: "+ds1.standardDeviation());
        System.out.println("Deviation of ds2: "+ds2.standardDeviation());

        DataSet[] datasets = {ds1, ds2};
        System.out.println("Average of All datasets: " + DataSet.CalculateAverage(datasets) );
    
}
}
