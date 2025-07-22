package hw.array;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		String[] choices = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		
        int win = 0;
        int draw = 0;
        int lose = 0;
        int total = 0;
		
		while (true) {
			String rsp;
			int com = (int) (Math.random() * 3);
			String comRSP = choices[com];
			
			System.out.print("가위바위보: ");
			rsp = sc.nextLine();
			
            if (rsp.equals("stop")) {
                System.out.println("게임을 종료합니다.");
    	        System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");
                break;
            }
			
			System.out.println("컴퓨터: " + comRSP);
			System.out.println("사용자: " + rsp);
			
			if (rsp.equals(comRSP)) {
				System.out.println("비겼습니다.");
				draw++;
			} 
			
			else if ((rsp.equals("가위") && comRSP.equals("보")) ||
            		 (rsp.equals("바위") && comRSP.equals("가위")) ||
            		 (rsp.equals("보") && comRSP.equals("바위"))) {
				System.out.println("이겼습니다!");
				win++;
			} 
			
			else if ((rsp.equals("가위") && comRSP.equals("바위")) ||
         		   	 (rsp.equals("바위") && comRSP.equals("보")) ||
         		   	 (rsp.equals("보") && comRSP.equals("가위"))) {
				System.out.println("졌습니다 ㅠㅠ");
				lose++;
			}
			
			else {
				System.out.println("잘못 입력하셨습니다.");			
			}
			
			total++;
			
			System.out.println();		
		}
		
	}

}
