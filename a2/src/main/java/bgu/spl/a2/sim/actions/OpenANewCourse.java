package bgu.spl.a2.sim.actions;

import bgu.spl.a2.Action;
import bgu.spl.a2.Promise;
import bgu.spl.a2.sim.privateStates.DepartmentPrivateState;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class OpenANewCourse extends bgu.spl.a2.Action<Boolean>{

    private Integer availableSpots;
    private Vector<String> prequisites;
    private DepartmentPrivateState DepartmentPrivateState;
    private String courseName;

    @Override
    protected void start(){
        List<Action<Boolean>> actions = new ArrayList<>();
        Action<Boolean> Confirmation = new OpenANewCourseConfirmation(this.DepartmentPrivateState,this.courseName);
        actions.add(Confirmation);
        //sendMessage(Confirmation,this.DepartmentPrivateState)
    }

    public OpenANewCourse(String courseName,Integer availableSpots,Vector<String> prequisites,DepartmentPrivateState DepartmentPrivateState){
        this.actionName = "Open Course";
        this.Result = new Promise<Boolean>();
        this.availableSpots = availableSpots;
        this.prequisites = prequisites;
        this.DepartmentPrivateState = DepartmentPrivateState;
        this.courseName = courseName;
    }
}

