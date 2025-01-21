package Test01;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl2();

    public ClassManager() {
        students.add(new Student("张三", '女', 99));
        students.add(new Student("李四", '男', 97));
        students.add(new Student("王五", '男', 98));
        students.add(new Student("赵六", '女', 99));
    }

    //打印全班学生的信息
    public void printInfo() {
        studentOperator.printAllInfo(students);
    }


    //打印全班学生的平均分
    public void printScore() {
        studentOperator.printAllScore(students);
    }

}
