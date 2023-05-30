import java.util.*;

public class 큰수의법칙 {
    public static void main(String[] args){
        int N, M, K;
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();

        Integer arr[] = new Integer[N];

        for(int i =0; i < N ; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr, Collections.reverseOrder()); // 오름차순 정렬

        int first = arr[0];  // 가장 큰 수
        int second = arr[1]; // 두 번째로 큰 수
        int sum1 = 0; //가장 큰 수의 합
        int sum2 = 0; //두 번째로 큰 수의 합

        // 수열의 길이 K+1
        // 수열 반복 횟수 M/(K+1)
        // 가장 큰 수가 나오는 횟수 count = K * M/(K+1) + M%(K+1)
        // 두 번째 큰 수가 나오는 횟수 M - count
        int count =  (K * M/(K+1) + M%(K+1));
        sum1 = first * (K * M/(K+1) + M%(K+1));
        sum2 = second * (M - count);

        System.out.println(sum1 + sum2);
    }
}
