public class ShuttleNumber {
    public static void main(String[] args) {
        int shuttleNumber = 1;
        int count = 0;
        while (count < 100) {
            String numberAsString = String.valueOf(shuttleNumber);
            if (numberAsString.contains("4") || numberAsString.contains("9")) {
                shuttleNumber++;
            } else {
                System.out.println(shuttleNumber);
                shuttleNumber++;
                count++;
            }
        }
    }
}