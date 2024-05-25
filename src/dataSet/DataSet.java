package dataSet;

public class DataSet {
    public int maximumNumberOfValues;
    private int index;
    public double[] store;

    public DataSet(int maximumNumberOfValues) {
        this.maximumNumberOfValues = maximumNumberOfValues;
        store = new double[maximumNumberOfValues];
    }
    public void add(double value){
        if(index < maximumNumberOfValues){
            store[index] = value;
            index++;
        }
        else{
            System.out.println("Dataset is full");
        }
    }

    public double getSum(){
        double sum = 0;
        for(int i = 0; i < index; i++){
            sum += store[i];
        }
        return  sum;
    }
    public double getAverage(){
        if(index == 0){
            return  0;
        }
        return getSum() / index;
    }
    public double getMaximum(){
        double max = store[0];
        for(int i = 0; i < index; i++){
            max = Math.max(max, store[i]);
        }
        return max;
    }
    public double getMinimum(){
        double min = store[0];
        for(int i = 0; i < index; i++){
            min = Math.min(min, store[i]);
        }
        return min;
    }
}