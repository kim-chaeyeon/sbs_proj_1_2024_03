package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 프로젝트 시작 ==");
        System.out.printf("명령어)");
        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine(); // enter 치기 전까지 허용
        System.out.printf("입력된 명령어: %s\n", cmd);

        String cnd = sc.next(); // 띄어쓰기 전까지 허용
        System.out.printf("입력된 명령어: %s\n", cnd);

        int cad = sc.nextInt(); // 정수만 허용
        System.out.printf("입력된 명령어: %d\n", cad);

        // Scanner 닫기
        sc.close();

        System.out.println("== 프로젝트 시작 ==");
    }
}