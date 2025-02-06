package com.bjpowernode.designed.principle.demeter;

public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        PythonProgrammer pythonProgrammer = new PythonProgrammer();

        //老板,通知项目经历,开会
        boss.meet(teamLeader);

        teamLeader.setProgrammer(javaProgrammer);

        //项目经历,开完会,进行任务分配
        teamLeader.assginTasks();

        teamLeader.setProgrammer(pythonProgrammer);

        teamLeader.assginTasks();
    }
}
