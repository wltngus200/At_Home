package com.green.videoKDT.Quest;

public class Quest01_Score {
    public static void main(String[] args) {
        /* 성적관리를 위한 프로그램을 작성하기 위해 클래스를 생성+요구사항에 맞게
         요구사항: 출력예시를 참고해 Grade라는 클래스 정의, 학생이름과 국어 영어 수학점수 저장하는 필드 평균 구하는 메소드
         평균=각 과목 점수 합/3 출력예시처럼 두개의 객체를 생성했을 때 각각의 평균 점수가 화면에 출력
         */
        Grade kang = new Grade("강백호", 90.0,85.5, 70.0);
        Grade chae = new Grade("채치수", 82.0,92.0, 60.5);
        kang.average();
        chae.average();
    }
}
    class Grade{
        String name;
        double korean;
        double english;
        double math;

        Grade(String na, double ko, double en, double ma){
            this.name = na;
            this.korean = ko;
            this.english = en;
            this.math = ma;

        }
        void average(){
            double avg=(korean+english+math)/3;
            System.out.printf("%s의 평균 %.2f\n",name,avg);
        }
}
