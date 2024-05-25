package dataSet;

public class DataSetRunner {
    public static void main(String[] args) {
        DataSet data1 = new DataSet(10);
        data1.add(555);;
        data1.add(550);
        System.out.println(data1.getSum());
        System.out.println(data1.getAverage());
        System.out.println(data1.getMaximum());
        System.out.println(data1.getMinimum());
    }
}
