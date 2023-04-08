public class Counting_strings {
    public static void main(String[] args) {
        String my_string = "10 + 20 - 5";
        int result = solution(my_string);
        System.out.println(result);
    }

    public static int solution(String my_string) {
        String[] arr = my_string.split("\\s");
        int answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            } else {
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }
        return answer;
    }
}
