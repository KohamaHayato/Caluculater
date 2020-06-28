import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<Double> numList = new ArrayList<>();
        double inputNum=0;
        Calculator calculator = new Calculator();

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        while(true){
            System.out.println("数字を入力してください。");
            inputNum = scan1.nextInt();
            numList.add(inputNum);
            System.out.println("入力を終了しますか？(y/n)");
            String finish = scan2.nextLine();
            if(finish.equals("y")){
                System.out.println("入力を終了します。");
                break;
            }
        }

        while(true){
            System.out.println("コマンドを入力してください。");
            String cmd = "";
            cmd = scan2.nextLine();
            switch (cmd){
                case "+":
                    calculator.Sum(numList);
                    break;
                case "-":
                    calculator.Average(numList);
                    break;
                case "n":
                    System.out.println("計算を終します。");
                    return;
                default:
                    System.out.println("異常終了");
            }
        }
    }
}
