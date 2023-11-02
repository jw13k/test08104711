import java.util.Scanner;

public class WalkingTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("거리를 입력하세요 (km): ");
        double distance = scanner.nextDouble();

        System.out.print("평지에서의 속도를 입력하세요 (km/h): ");
        double flatTerrainSpeed = scanner.nextDouble();

        System.out.print("언덕에서의 속도를 입력하세요 (km/h): ");
        double hillTerrainSpeed = scanner.nextDouble();

        System.out.print("숲에서의 속도를 입력하세요 (km/h): ");
        double forestTerrainSpeed = scanner.nextDouble();

        double flatTerrainTime = distance / flatTerrainSpeed;
        double hillTerrainTime = distance / hillTerrainSpeed;
        double forestTerrainTime = distance / forestTerrainSpeed;

        System.out.println("평지에서 걷는 시간: " + flatTerrainTime + " 시간");
        System.out.println("언덕에서 걷는 시간: " + hillTerrainTime + " 시간");
        System.out.println("숲에서 걷는 시간: " + forestTerrainTime + " 시간");
    }
}
