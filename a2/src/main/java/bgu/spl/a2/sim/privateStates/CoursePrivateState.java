package bgu.spl.a2.sim.privateStates;

import java.util.List;
import java.util.Vector;

import bgu.spl.a2.PrivateState;

/**
 * this class describe course's private state
 */
public class CoursePrivateState extends PrivateState{

	private Integer availableSpots;
	private Integer registered;
	private List<String> regStudents;
	private List<String> prequisites;
	
	/**
 	 * Implementors note: you may not add other constructors to this class nor
	 * you allowed to add any other parameter to this constructor - changing
	 * this may cause automatic tests to fail..
	 */
	public CoursePrivateState() {
		availableSpots = new Integer(0);
		registered = new Integer(0);
		regStudents = new Vector<String>();
		prequisites = new Vector<String>();
		this.setHistory(new Vector<String>());
	}

	public Integer getAvailableSpots() {
		return availableSpots;
	}

	public Integer getRegistered() {
		return registered;
	}

	public List<String> getRegStudents() {
		return regStudents;
	}

	public List<String> getPrequisites() {
		return prequisites;
	}

	public void setAvailableSpots(Integer AvailableSpots){
		this.availableSpots = new Integer(AvailableSpots.intValue());
	}

	public void setPrequisites(Vector<String> Prequisites ){this.prequisites = Prequisites;}

	private void incRegistered(){
		this.registered = new Integer(this.registered.intValue() + 1);
	}
	private void decRegistered(){
		this.registered = new Integer(this.registered.intValue() - 1);
	}

	public void addStudents(String studentName){
		int studentIndex = this.regStudents.indexOf(studentName);
		if (studentIndex == -1) {
			this.regStudents.add(studentName);
			incRegistered();
		}
	}
	public void removeStudents(String studentName){
		int studentIndex = this.regStudents.indexOf(studentName);
		if (studentIndex!=-1) {
			this.regStudents.remove(studentIndex);
			decRegistered();
		}
	}
}
