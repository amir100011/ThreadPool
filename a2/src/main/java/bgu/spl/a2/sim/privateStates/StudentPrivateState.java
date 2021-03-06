package bgu.spl.a2.sim.privateStates;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import bgu.spl.a2.PrivateState;

/**
 * this class describe student private state
 */
public class StudentPrivateState extends PrivateState{

	private HashMap<String, Integer> grades;
	private long signature;
	
	/**
 	 * Implementors note: you may not add other constructors to this class nor
	 * you allowed to add any other parameter to this constructor - changing
	 * this may cause automatic tests to fail..
	 */
	public StudentPrivateState() {
		this.grades = new HashMap<String, Integer>();
		this.setHistory(new Vector<String>());
	}

	public HashMap<String, Integer> getGrades() {
		return grades;
	}

	public void setSignature(long signature){this.signature=signature;}

	public void addGrade(String courseName, Integer grade){
		this.grades.put(courseName,grade);
	}

	public void deleteGrade(String courseName){
		if(this.grades.containsKey(courseName))
			this.grades.remove(courseName);
	}

	public long getSignature() {
		return signature;
	}
}
