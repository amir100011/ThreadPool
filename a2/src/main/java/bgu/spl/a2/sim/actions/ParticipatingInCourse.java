package bgu.spl.a2.sim.actions;

import bgu.spl.a2.sim.privateStates.DepartmentPrivateState;
import bgu.spl.a2.sim.privateStates.CoursePrivateState;
import bgu.spl.a2.sim.privateStates.StudentPrivateState;

public class ParticipatingInCourse extends bgu.spl.a2.Action<String> {

    private CoursePrivateState CoursePrivateState;
    private DepartmentPrivateState DepartmentPrivateState;
    private StudentPrivateState StudentPrivateState;
    private String courseName;


    @Override
    protected void start() {

    }

    public ParticipatingInCourse(String courseName, CoursePrivateState CoursePrivateState, DepartmentPrivateState DepartmentPrivateState, StudentPrivateState StudentPrivateState){
        this.CoursePrivateState = CoursePrivateState;
        this.DepartmentPrivateState = DepartmentPrivateState;
        this.DepartmentPrivateState = DepartmentPrivateState;
        this.courseName = courseName;
    }
}
