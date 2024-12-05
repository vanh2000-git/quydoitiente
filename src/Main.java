import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số tiền muốn chuyển đổi:");
        usd = sc.nextDouble();
        double quydoi = vnd * usd;
        System.out.println("Giá trị vnd: " + quydoi);
    }
}