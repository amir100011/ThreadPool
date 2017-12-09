package bgu.spl.a2.sim.actions;

import bgu.spl.a2.Promise;
import bgu.spl.a2.sim.privateStates.DepartmentPrivateState;

import java.util.List;

public class OpenANewCourseConfirmation extends bgu.spl.a2.Action<Boolean>{

    private String courseName;
    private DepartmentPrivateState DepartmentPrivateState;

    @Override
    protected void start() {
        if (this.DepartmentPrivateState.getCourseList().contains(courseName))
            this.complete(false);
        else this.complete(true);
    }

    public OpenANewCourseConfirmation(DepartmentPrivateState DepartmentPrivateState , String courseName){
        this.courseName = courseName;
        this.DepartmentPrivateState = DepartmentPrivateState;
        this.setActionName("Open Course Confirmation");
        this.Result = new Promise<Boolean>();
    }

}
