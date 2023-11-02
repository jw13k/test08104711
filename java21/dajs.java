import java.util.Scanner;

public class DistanceSpeedTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이동한 거리를 입력 (킬로미터): ");
        double distance = scanner.nextDouble();

        System.out.print("이동한 속도를 입력 (킬로미터/시간): ");
        double speed = scanner.nextDouble();

        
        double time = distance / speed;

        System.out.println("이동에 소요된 시간은 " + time + " 시간입니다.");
    }
}
