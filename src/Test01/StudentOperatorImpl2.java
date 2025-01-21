package Test01;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int count1 = 0;
        int count2 = 0;
        System.out.println("---------------全班全部学生信息如下---------------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
            System.out.println("姓名：" + s.getName() +
                    ",性别：" + s.getSex() +
                    ",成绩：" + s.getScore());
        }
        System.out.println("男生人数：" + count1 + ",女生人数：" + count2);
        System.out.println("班级总人数：" + students.size());
        System.out.println("---------------------------------------------");
    }

    @Override
    public void printAllScore(ArrayList<Student> students) {
        double allScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (max < s.getScore()) max = s.getScore();
            if (min > s.getScore()) min = s.getScore();
            allScore += s.getScore();
        }
        System.out.println("学生最高分：" + max + ",学生最低分：" + min);
        System.out.println("平均分：" + (allScore - max - min) / (students.size() - 2));
    }
}
