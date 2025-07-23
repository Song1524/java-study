package hw.array;

import java.util.Scanner;

public class Hw6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "번째 문자열: ");
            arr[i] = sc.nextLine();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
            String answer = sc.nextLine();

            if (answer.equals("N") || answer.equals("n")) {
                break;
            } else if (answer.equals("Y") || answer.equals("y")) {
                System.out.print("더 입력하고 싶은 개수: ");
                int addCount = sc.nextInt();
                sc.nextLine();
                
                String[] newArr = new String[arr.length + addCount];

                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }

                for (int i = arr.length; i < newArr.length; i++) {
                    System.out.print((i + 1) + "번째 문자열: ");
                    newArr[i] = sc.nextLine();
                }

                arr = newArr;

            } else {
                System.out.println("입력할 수 없는 값입니다.");
            }
        }

        System.out.println();
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
