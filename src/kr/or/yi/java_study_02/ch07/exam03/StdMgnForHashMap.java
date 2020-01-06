package kr.or.yi.java_study_02.ch07.exam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import kr.or.yi.java_study_02.ch07.exam02.StdManagerInterface;
import kr.or.yi.java_study_02.ch07.exam02.Student;

public class StdMgnForHashMap implements StdManagerInterface {
	private HashMap<Integer, Student> stdMap;
	
	
	public StdMgnForHashMap() {
		this.stdMap = new HashMap<Integer, Student>();
	}
	
	/*
	 * put 중복일 경우 value값, 리턴 추가 된 경우 null 리턴 
	 */

	@Override
	public boolean insertStudent(Student student) {
		if (!stdMap.containsKey(student.getStdNo())) {
			stdMap.put(student.getStdNo(), student);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Student> listStudent() {
		ArrayList<Student> stdlist = new ArrayList<Student>();
		Set<Integer> keys = stdMap.keySet();
		for(Integer stdNo : keys) {
			stdlist.add(stdMap.get(stdNo));
		}
		return stdlist;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student searchStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
