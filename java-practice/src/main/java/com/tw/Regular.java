package com.tw;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Regular {
    private static final String STU_REGREX = "([^, ]+), (\\w+), 数学：(\\d+), 语文：(\\d+), 英语：(\\d+), 编程：(\\d+)";
    private static final String STU_NUM_REGREX = "^(\\d+[\\s]*+[,]+[\\s]*)*(\\d+)$";
    private static final String reportTemplate = "成绩单\n" +
            "姓名|数学|语文|英语|编程|平均分|总分 \n" +
            "========================\n" +
            "%1$s" +
            "========================\n" +
            "全班总分：%2$s\n" +
            "全班总平均分：%3$s";

    public Student formatStudentInfo(String input) {
        Student stu = null;
        Matcher matcher = Pattern.compile(STU_REGREX).matcher(input);
        if (matcher.matches()) {
            stu = new Student(matcher.group(1),
                    matcher.group(2),
                    Integer.parseInt(matcher.group(3)),
                    Integer.parseInt(matcher.group(4)),
                    Integer.parseInt(matcher.group(5)),
                    Integer.parseInt(matcher.group(6)));
        }
        return stu;
    }

    public List formatStudentNos(String input) {
        List stuNum = null;
        Matcher matcher = Pattern.compile(STU_NUM_REGREX).matcher(input);
        if (matcher.matches()) {
            stuNum  = Arrays.asList(input.trim().split(",")).stream()
                    .map(num -> num.trim())
                    .distinct()
                    .collect(Collectors.toList());
        }
        return stuNum;
    }

    public String formatReportText(List studentsNum) {
        String gradereportItemTemplate = "%1$s|%2$d|%3$d|%4$d|%5$d|%6$d|%7$d\n";
        List<Student> printStudent = new StudentList().getStudents().stream().filter(s->studentsNum.contains(s.getNumber())).collect(Collectors.toList());
        String itemsText = printStudent.stream().map(s -> String.format(gradereportItemTemplate, s.getName(),
                        s.getMathsScore(),
                        s.getChineseScore(),
                        s.getEnglishScore(),
                        s.getProgramScore(),
                        s.getAverageScore(),
                        s.getTotalScore())).collect(Collectors.joining());

        Integer sum = printStudent.stream().mapToInt(item -> item.getTotalScore()).sum();
        Integer avg = sum / printStudent.size();
        return String.format(reportTemplate, itemsText,sum,avg);

    }
}


