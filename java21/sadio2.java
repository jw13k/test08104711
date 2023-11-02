import java.util.Scanner;

public class DisTCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("속도를 입력하세요 (킬로미터/시간): ");
        double speed = scanner.nextDouble();

        System.out.print("시간을 입력하세요 (시간): ");
        double time = scanner.nextDouble();

        double distance = speed * time;

        System.out.println("이동한 거리: " + distance + " 킬로미터");
        System.out.println("이동에 걸린 시간: " + time + " 시간");
    }
}
