package ra.run;

import ra.entity.Student;

import java.util.Scanner;

public class StudentManagement {
    //Khởi tạo mảng arrStudents để chứa tất cả dữ liệu sinh viên
    private static Student[] arrStudents = new Student[100];
    //Khỏi tạo chỉ số phần tử nhập dữ liệu
    private static int currentIndex = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*************MENU*****************");
            System.out.println("1. Nhập thông tin n sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    StudentManagement.inputListStudent(scanner);
                    break;
                case 2:
                    StudentManagement.displayListStudent();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        }while (true);
    }

    public static void inputListStudent(Scanner scanner){
        System.out.println("Nhập vào số sinh viên cần nhập thông tin:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            //Khởi tạo phần tử thứ currentIndex là 1 đối tượng sinh viên cần nhập liệu
            arrStudents[currentIndex] = new Student();
            //Nhập thông tin cho sinh viên
            arrStudents[currentIndex].inputData(scanner,arrStudents,currentIndex);
            //Tăng currentIndex
            currentIndex++;
        }
    }
    public static void displayListStudent(){
        System.out.println("THÔNG TIN TẤT CẢ SINH VIÊN:");
        for (int i = 0; i < currentIndex; i++) {
            arrStudents[i].displayData();
        }
    }
}
