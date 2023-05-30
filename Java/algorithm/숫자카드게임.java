import java.util.Scanner;

public class 숫자카드게임 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 조건 값들 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int cardArr[][] = new int[n][m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int rowMin = 10001; // 행에서 가장 작은 값을 담을 변수

            for (int j = 0; j < m; j++) {
                cardArr[i][j] = scanner.nextInt();

                if (cardArr[i][j] < rowMin){
                    rowMin = cardArr[i][j];
                }
            }
            // 행에서 가장 작은 값이 max보다 클 경우 max 값 변경
            if (max < rowMin){
                max = rowMin;
            }
            System.out.println("결과는 : " + max);
        }
    }
}
