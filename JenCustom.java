import java.util.Scanner;

public class JenCustom {
    public static void main(String[] args) {
        JenCustom jenCustom = new JenCustom();
        jenCustom.startMainMenu();
    }


    boolean checkIfInt(String input){
        boolean isInt = true;

        try {
            int num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            isInt = false;
        }

        return isInt;
    }

    private void startMainMenu(){
        while(true){
            System.out.println("-- 오늘 뭐 먹지? --");
            System.out.println("메인페이지 - 메뉴 선택");
            System.out.println("1. 음식점");
            System.out.println("2. 리뷰");
            System.out.println("3. 나가기");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int num = 0;
            if (checkIfInt(input)){
                num = Integer.parseInt(input);
            } else {
                System.out.println("WARNING: Need to input Integer type!!!");
            }



            if (num == 1){
                System.out.println("Print Menu 1");
                startRestaurantScreen();
            } else if (num == 2){
                System.out.println("Print Menu 2");
                startReviewScreen();
            } else if (num == 3){
                System.out.println("Finish Main Menu");
                break;
            } else {
                System.out.println("Miss typing!");
            }
        }
    }

    private void startRestaurantScreen(){
        while(true){
            System.out.println("서브메인페이지1 - 음식점 메뉴 선택");
            System.out.println("1. 전체 보기");
            System.out.println("2. 추가하기");
            System.out.println("3. 검색하기");
            System.out.println("4. 이전 메뉴");


            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int num = 0;
            if (checkIfInt(input)){
                num = Integer.parseInt(input);
            } else {
                System.out.println("WARNING: Need to input Integer type!!!");
            }

            if (num == 1){
                System.out.println("Print Menu 1 - 전체 음식점 목록 보기");
            } else if (num == 2){
                System.out.println("Print Menu 2 - 음식점 추가 등록");
            } else if (num == 3){
                System.out.println("Print Menu 3 - 음식점 검색하기");
            } else if (num == 4){
                System.out.println("Go to previous menu");
                break;
            } else {
                System.out.println("Miss typing!");
            }
        }
    }

    private void startReviewScreen(){
        while(true){
            System.out.println("서브메인페이지2 - 리뷰 메뉴 선택");
            System.out.println("1. 리뷰 쓰기");
            System.out.println("2. 전체 리뷰 보기");
            System.out.println("3. 리뷰 검색하기");
            System.out.println("4. 이전 메뉴");


            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int num = 0;
            if (checkIfInt(input)){
                num = Integer.parseInt(input);
            } else {
                System.out.println("WARNING: Need to input Integer type!!!");
            }

            if (num == 1){
                System.out.println("Print Menu 1 - 리뷰 쓰기");
            } else if (num == 2){
                System.out.println("Print Menu 2 - 전체 리뷰 보기");
            } else if (num == 3){
                System.out.println("Print Menu 3 - 리뷰 검색하기");
            } else if (num == 4){
                System.out.println("Go to previous menu");
                break;
            } else {
                System.out.println("Miss typing!");
            }
        }

    }

}

class Restaurant {

}

class Review {

}

