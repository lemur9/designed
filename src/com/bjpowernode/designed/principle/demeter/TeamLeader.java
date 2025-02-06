package com.bjpowernode.designed.principle.demeter;

public class TeamLeader implements Manager {

    private Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void assginTasks(){
        System.out.println("给下属分配任务");

        if(programmer instanceof JavaProgrammer) {
            //如果是java程序员,分配的是java开发任务
            ((JavaProgrammer)programmer).work();
        }else if(programmer instanceof PythonProgrammer){
            //如果是Python程序员,分配的是Python开发任务
            ((PythonProgrammer)programmer).work();
        }

    }

}
