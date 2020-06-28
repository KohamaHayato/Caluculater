import java.util.*;
public class Calculator {
    private double sum = 0;
    private double avg = 0;
    public void Sum(ArrayList<Double> inputNumList){
        for(double nums:inputNumList){
            sum += nums;
        }
        System.out.println("合計値：" + sum);
    }

    public void Average(ArrayList<Double> inputNumList){
        avg = sum / inputNumList.size();
        System.out.println("平均値：" + avg);
    }
}
