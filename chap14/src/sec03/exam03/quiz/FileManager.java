package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	
	void deleteFile(File dir) {
		if (dir.delete()) {
			System.out.println(dir + " -> 삭제 완료");
		} else {
			System.out.println(dir + " -> 삭제 실패");
		}
	}
}
