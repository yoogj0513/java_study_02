package kr.or.yi.java_study_02.ch07.exam03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import kr.or.yi.java_study_02.ch07.exam02.Student;

public class ExamMain {
 
	public static void main(String[] args) {
		StdMgnForHashMap sm = new StdMgnForHashMap();
		
		for(Student std : initStdList()) {
			sm.insertStudent(std);
		}
		
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생검색, 6. 종료");
			res = sc.nextInt();
			System.out.println(res);
			switch(res) {
			case 1:
				prnStudents(sm.listStudent());
				break;
			case 2:
				System.out.printf("%s%n", "학생추가");
				Student addStd = getStudent();
//				sm.insertStudent(getStudent());
				System.out.println(sm.insertStudent(addStd));
				break;
			case 3:
				System.out.printf("%s%n", "학생 수정");
				break;
			case 4:
				System.out.printf("%s%n", "학생 삭제");
				break;
			case 5:
				System.out.printf("%s%n", "학생 검색");
				break;
			
			}
		}while(res < 6);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();
	}
	
	

	private static Student getStudent() {
		String res = JOptionPane.showInputDialog("학생정보 : 번호,성명,국어,수학,영어 ex)1,이상원,90,90,90");
		System.out.println(res);
		String[] resArr = res.split(",");
		
		int stdNo = Integer.parseInt(resArr[0].trim());
		String stdName = resArr[1].trim();
		int kor = Integer.parseInt(resArr[2].trim());
		int math = Integer.parseInt(resArr[3].trim());
		int eng = Integer.parseInt(resArr[4].trim());
		
		return new Student(stdNo, stdName, kor, math, eng);
	}



	private static void prnStudents(ArrayList<Student> listStudent) {
		for(Student std : listStudent) {
			System.out.println(std);
		}
	}
	
	private static ArrayList<Student> initStdList() {
		ArrayList<Student> arList = new ArrayList<>();
		Random rnd = new Random();
		String[] names = {"권수진", "정아름", "장현서", "황태원", 
				"배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선"};
		for(int i=0; i<names.length; i++) {
			arList.add(new Student(i+1, names[i], 
					rnd.nextInt(60)+41, 
					rnd.nextInt(60)+41, 
					rnd.nextInt(60)+41));
		}
		
		return arList;
	}

}
