package Application;

import Application.Application;
import Book.BestSellerBook;
import Book.ChildBook;
import Customer.Customer;
import PaymentMethod.Card;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Application application = new Application (
                new Customer(
                        new Card("현대 카드", 0.1),
                        5000,
                        new BestSellerBook("오브젝트", 38000),
                        new BestSellerBook("알고리즘 문제 해결 전략 세트", 50000),
                        new ChildBook("해리포터 전 권 세트", 83700)
                ),

                new BestSellerBook("오브젝트", 38000),
                new BestSellerBook("알고리즘 문제 해결 전략 세트", 50000),
                new ChildBook("해리포터 전 권 세트", 83700)
        );

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int menu = 0;

            System.out.println(" 1. 책 정보 추가하기");
            System.out.println(" 2. 책 정보 출력하기");
            System.out.println(" 3. 책 장바구니에 담기");
            System.out.println(" 4. 결제하기");
            System.out.println(" 0. 종료");
            System.out.println(" 메뉴 선택 : ");
            menu = scanner.nextInt();

            if(menu == 2) {
                application.print_book_info();
            }

            else if (menu==0) {
                System.out.println("프로그램 종료");
                return;
            }
        }
    }
}
