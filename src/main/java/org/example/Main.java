package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 프로젝트 시작 ==");
        Scanner sc = new Scanner(System.in);

        int lastArticleId = 0;

        while (true) {
            System.out.printf("명령어)");
            String cmd = sc.nextLine();
            cmd = cmd.trim(); // 양 옆 공백 제거
            if (cmd.length() == 0) {
                continue;
            }

            if (cmd.equals("exit")) {
                break;
            }

            if (cmd.equals("article write")) {
                int id = lastArticleId + 1;
                lastArticleId = id;
                System.out.println("제목 : ");
                String title = sc.nextLine();
                System.out.println("내용 : ");
                String boby = sc.nextLine();

                System.out.printf("글이 생성되었습니다.\n", id);
            }
            else if (cmd.equals("article list")) {
                System.out.println("게시물이 없습니다.");
            }
            else {
                System.out.printf("%s(은)는 존재하지 않는 명령어 입니다\n", cmd);
            }
        }
        // Scanner 닫기
        sc.close();
        System.out.println("== 프로젝트 시작 ==");
    }
}