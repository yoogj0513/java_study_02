package kr.or.yi.java_study_02.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {
	// 예외 처리를 JVM에게 전가 
	// Exception도 상속 구조  : Exception > IOException > FileNotFoundException 
	//부모가 아래 값을 받을 수 있기 때문에 부모만 설정해도 됨. Exception을 쓰면 어디서 오류가 났는지 알 수 없을 수도 있음
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		readex01();
//		readex02();
		
		// 경로가 나타남
//		System.out.println(System.getProperty("user.dir"));
		
		// 풀 경로가 나타남
		String filePath = System.getProperty("user.dir") + "\\data\\department.txt";
//		System.out.println(filePath);
		
		readFile("department.txt");
		readFile("employee.txt");
		
		readFileInputStream("department.txt");
	}

	private static void readFileInputStream(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\" + fileName;
		File file = new File(filePath);
		
		//MS949 인코딩 : 윈도우에서 작업한 작업물
		// try()는 아무 클래스가 들어올 수 있는 것이 아닌, closable interface를 구현한 클래스만 가능
		// try() 안에 여러 클래스 가능
		try(FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "UTF8")){
			int c;
			while((c = isr.read()) != -1) {
				System.out.print((char)c); // 인코딩이 다르면 한글 등의 문자들은 깨짐. 영어는 절대 깨지지 않음
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFile(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\" + fileName;
		File file = new File(filePath);
		
		// try-catch-resource문 => 자동으로 close 호출, closable interface를 구현한 클래스만 가능
		try (FileReader fr = new FileReader(file)){ // 자동 클로즈, 오토 클로즈 (fr.close()를 안해도 되는것)
			//char[] buf = new char[1024];// 보통 1024를 씀. 1024는 1KB
			int c;
			while((c = fr.read())!= -1) {
				System.out.print((char)c);
			}
			System.out.println("Encoding : " + fr.getEncoding()); // 인코딩 출력
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private static void readex02() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("C:\\Windows\\system.ini");
		int c;
		while((c = fr.read()) != -1) {
			System.out.print((char)c);
		}
	}

	private static void readex01() {
		try {
			readex02();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("해당 파일이 존재 하지 않음");
		}
	}
}
