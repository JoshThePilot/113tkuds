public class StudentGradeSystem {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    public static void printGradeReport(int[] scores) {
        int total = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;

        int countA = 0, countB = 0, countC = 0, countD = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            total += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            switch (getGrade(score)) {
                case 'A' -> countA++;
                case 'B' -> countB++;
                case 'C' -> countC++;
                case 'D' -> countD++;
            }
        }

        double average = (double) total / scores.length;

        int aboveAverage = 0;
        for (int score : scores) {
            if (score > average) aboveAverage++;
        }
        double aboveAverageRatio = (double) aboveAverage / scores.length * 100;

        System.out.println("====== 學生成績等級報告 ======");
        System.out.printf("全班平均分數：%.2f%n", average);
        System.out.println("最高分： " + max + "（學生編號: " + maxIndex + "）");
        System.out.println("最低分： " + min + "（學生編號: " + minIndex + "）");
        System.out.printf("高於平均分數的學生比例：%.2f%%%n", aboveAverageRatio);
        System.out.println("----------------------------------");
        System.out.println("等級統計：");
        System.out.println("A 等人數：" + countA);
        System.out.println("B 等人數：" + countB);
        System.out.println("C 等人數：" + countC);
        System.out.println("D 等人數：" + countD);
        System.out.println("----------------------------------");
        System.out.println("學生編號 | 分數 | 等級");
        System.out.println("---------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("    %2d     |  %3d |   %c%n", i, scores[i], getGrade(scores[i]));
        }

        System.out.println("===========");
    }

    public static void main(String[] args) {
        int[] studentScores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        printGradeReport(studentScores);
    }
}
