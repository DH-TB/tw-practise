package com.tw;

public class CommandDesktop {
    public static final String DESKTOP_MENU = "\n***********\n" +
            "1. 添加学生\n" +
            "2. 生成成绩单\n" +
            "3. 退出\n" +
            "请输入你的选择（1～3):\n" +
            "***********\n";
    public static final String ADD_STUDENT= "请输入学生信息（格式：姓名, 学号, 数学：分数, 语文：分数, 英语：分数, 编程：分数），按回车提交：\n";
    public static final String PRINT_REPORT = "请输入要打印的学生的学号（格式：学号, 学号,...），按回车提交：\n";
    public static final String ADD_STUDENT_ERROR = "请按正确的格式输入（格式：姓名, 学号, 学科：成绩,...），按回车提交：\n";
    public static final String PRINT_REPORT_ERROR = "请按正确的格式输入要打印的学生的学号（格式：学号, 学号,...），按回车提交：\n";


    public void getDesktopMenu(){
        System.out.println(DESKTOP_MENU);
    }

    public void getAddStudent() {
        System.out.println(ADD_STUDENT);
    }

    public void getPrintReport() {
        System.out.println(PRINT_REPORT);
    }

    public void getAddStudentError() {
        System.out.println(ADD_STUDENT_ERROR);
    }

    public void getPrintReportError() {
        System.out.println(PRINT_REPORT_ERROR);
    }

}
