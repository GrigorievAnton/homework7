import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // задача 1
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Scanner scan = new Scanner(System.in);
//        int search = scan.nextInt();
//        int index = -1;
//        int index1 = 0;
//        int index2 = nums.length - 1;
//        while (index1 <= index2) {
//            int index3 = (index1 + index2) / 2;
//            if (search > nums[index3]) {
//                index1 = index3 + 1;
//            } else if (search < nums[index3]) {
//                index2 = index3 - 1;
//            } else {
//                index = index3;
//                break;
//            }
//        }
//        if (index > 0) {
//            System.out.println("индекс числа :" + index);
//        } else {
//            System.out.println("число не найдено");

        // задача 2
        System.out.println("¬едите несколько слов");
        String str = scan.nextLine();
        System.out.println("ƒалее введите символ или слово (дл€ определени€ индекса)");
        String search1 = scan.nextLine();
        int index4 = str.indexOf(search1);
        System.out.println("индекс заданного: " + index4);

    }
}
