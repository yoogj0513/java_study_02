package kr.or.yi.java_study_02.ch07.exam02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StudentManagement implements StdManagerInterface {
	private static final String Student = null;
	private ArrayList<Student> stdList;
	
	
	public StudentManagement() {
		this.stdList = new ArrayList<Student>();
	}

	@Override
	public boolean insertStudent(Student student) {
		if(student == null) {
			return false;
		}
		for(int i=0; i<stdList.size(); i++) {
			if(stdList.get(i).getStdNo() == student.getStdNo()) {
				System.out.println("번호가 중복됩니다.");
				return false;
			}
		}
		
		return stdList.add(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		try {			
			int stdNo = student.getStdNo();
			for(int i=0; i<stdList.size(); i++) {
				int stdListNo = stdList.get(i).getStdNo();
				if(stdListNo == stdNo) {
					return stdList.remove(i) != null;
				}
			}
			System.out.println("입력된 번호의 학생이 없습니다.");
		} catch (NullPointerException e) {
			return false;
		}
		return false;
	}

	@Override
	public ArrayList<Student> listStudent() {
		return this.stdList ;
	}

	@Override
	public boolean updateStudent(Student student) {
		try {			
			int stdNo = student.getStdNo();
			for(int i=0; i<stdList.size(); i++) {
				int stdListNo = stdList.get(i).getStdNo();
				if(stdListNo == stdNo) {
					String score = JOptionPane.showInputDialog("수정할 내용을 이름, 국어, 수학, 영어 순으로 입력하세요. ex)유경진, 90, 80, 70");
					String[] scoreArr = score.split(",");
					String stdName = scoreArr[0].trim();
					int kor = Integer.parseInt(scoreArr[1].trim());
					int math = Integer.parseInt(scoreArr[2].trim());
					int eng = Integer.parseInt(scoreArr[3].trim());
					
					stdList.get(i).setStdName(stdName);
					stdList.get(i).setKor(kor);
					stdList.get(i).setMath(math);
					stdList.get(i).setEng(eng);
					
					return stdList.get(i) != null;
				} 
			}
			System.out.println("입력된 번호의 학생이 없습니다.");
		} catch (NullPointerException e) {
			return false;
		}
		return false;
	}

	@Override
	public Student searchStudent(Student student) {
		try {			
			int stdNo = student.getStdNo();
			for(int i=0; i<stdList.size(); i++) {
				int stdListNo = stdList.get(i).getStdNo();
				if(stdListNo == stdNo) {
					System.out.println(this.stdList.get(i));
					return this.stdList.get(i);
				}
			}
			System.out.println("입력된 번호의 학생이 없습니다.");
		} catch (NullPointerException e) {
			return null;
		}
		return null;
	}
	

	public void setStudentList(ArrayList<Student> initStdList) {
		this.stdList = initStdList;
	}

}