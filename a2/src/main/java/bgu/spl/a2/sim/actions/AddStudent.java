package bgu.spl.a2.sim.actions;

import bgu.spl.a2.sim.privateStates.DepartmentPrivateState;
import bgu.spl.a2.sim.privateStates.StudentPrivateState;

public class AddStudent extends bgu.spl.a2.Action<String> {

    private String studentName;
    private DepartmentPrivateState DepartmentPrivateState;
    private StudentPrivateState StudentPrivateState;
    private long signature;

    @Override
    protected void start() {
        this.DepartmentPrivateState.addStudent(this.studentName);
        this.StudentPrivateState.setSignature(this.signature);
    }

    public AddStudent(String studentName, DepartmentPrivateState DepartmentPrivateState,long signature, StudentPrivateState StudentPrivateState){
        this.studentName = studentName;
        this.DepartmentPrivateState = DepartmentPrivateState;
        this.StudentPrivateState = StudentPrivateState;
        this.signature= signature;
    }
}
