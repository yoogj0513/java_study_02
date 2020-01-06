package kr.or.yi.java_study_02.ch08;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BufferedIOEX {
	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir") + "\\data\\";
		
		try(FileReader fin = new FileReader(filePath + "test.txt");
				BufferedOutputStream out = new BufferedOutputStream(System.out, 5);){
			int c;
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			
			//파일 데이터가 모두 출력된 상태
			Scanner sc = new Scanner(System.in);
			sc.nextLine();// <Enter> 키 입력
			out.flush(); // 버퍼가 남아 있던 문자 모두 출력
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
