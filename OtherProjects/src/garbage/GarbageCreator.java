package garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) {
		String filename = "C:\\Windows\\System32\\notepad.exe";;
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // In ra thông báo lỗi nếu có ngoại lệ
		}
		startTime = System.currentTimeMillis();
//		String outputString = "";
//		for(byte b : inputBytes) {
//			outputString += (char)b;
//		}
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b : inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
