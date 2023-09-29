package ra.entity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {
    //1. Fields - Attributes
    private String studentId;
    private String studentName;
    private int age;
    private String email;
    private String phone;
    private boolean sex;
    private float javacore;

    //2. Constructors
    public Student() {
    }

    public Student(String studentId, String studentName, int age, String email, String phone, boolean sex, float javacore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.javacore = javacore;
    }

    //3. Methods
    //3.1 Getter/Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getJavacore() {
        return javacore;
    }

    public void setJavacore(float javacore) {
        this.javacore = javacore;
    }

    //3.2. Methods
    public void inputData(Scanner scanner, Student[] arrStudents, int currentIndex) {
        boolean isExit = true;
        System.out.println("Nhập vào mã sinh viên:");
        do {
            this.studentId = scanner.nextLine();
            if (this.studentId.length() == 5) {
                if (this.studentId.startsWith("P")) {
                    boolean isExist = false;
                    for (int i = 0; i < currentIndex; i++) {
                        if (arrStudents[i].getStudentId().equals(this.studentId)) {
                            isExist = true;//đã tồn tại
                            break;
                        }
                    }
                    if (isExist) {
                        System.err.println("Mã sinh viên đã tồn tại, vui lòng nhập lại");
                    } else {
                        break;
                    }
                } else {
                    System.err.println("Mã sinh viên phải bắt đầu là P, vui lòng nhập lại");
                }
            } else {
                System.err.println("Mã sinh viên phải gồm 5 ký tự, vui lòng nhập lại");
            }
        } while (isExit);
        System.out.println("Nhập vào tên sinh viên:");
        do {
            this.studentName = scanner.nextLine();
            if (this.studentName.length() >= 10 && this.studentName.length() <= 50) {
                break;
            } else {
                System.err.println("Tên sinh viên phải từ 10-50 ký tự, vui lòng nhập lại");
            }
        } while (isExit);
        System.out.println("Nhập vào tuổi sinh viên:");
        do {
            this.age = Integer.parseInt(scanner.nextLine());
            if (this.age > 0) {
                break;
            } else {
                System.err.println("Tuổi sinh viên phải lớn hơn 0, vui lòng nhập lại");
            }
        } while (isExit);
        String regexEmail = "[a-zA-Z0-9]*@[a-zA-Z]*.[a-z]{2,3}";
        System.out.println("Nhập vào email:");
        do {
            this.email = scanner.nextLine();
            if (Pattern.matches(regexEmail, this.email)) {
                break;
            } else {
                System.err.println("Định dạng email không đúng, vui lòng nhập lại");
            }
        } while (isExit);
        String regexPhone = "(091|092|098|035|090)[0-9]{7}";
        System.out.println("Nhập vào số điện thoại:");
        do {
            this.phone = scanner.nextLine();
            if (Pattern.matches(regexPhone, this.phone)) {
                break;
            } else {
                System.err.println("Định dạng số điện thoại không đúng, vui lòng nhập lại");
            }
        } while (isExit);
        System.out.println("Nhập vào giới tính:");
        do {
            String gender = scanner.nextLine();
            if (gender.equals("true") || gender.equals("false")) {
                this.sex = Boolean.parseBoolean(gender);
                break;
            } else {
                System.err.println("Giới tính chỉ nhận giá trị true|false, vui lòng nhập lại");
            }
        } while (isExit);
        System.out.println("Nhập vào điểm javacore:");
        do {
            this.javacore = Float.parseFloat(scanner.nextLine());
            if (this.javacore >= 0 && this.javacore <= 10) {
                break;
            } else {
                System.err.println("Điểm javacore nằm trong khoảng 0-10, vui lòng nhập lại");
            }
        } while (isExit);
    }

    public void displayData() {
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d - Email: %s\n",
                this.studentId, this.studentName, this.age, this.email);
        System.out.printf("SĐT: %s - Giới tính: %s - Điểm javacore: %f\n",
                this.phone, this.sex ? "Nam" : "Nữ", this.javacore);
    }

    public static int add(int number1,int number2){
        return number1+number2;
    }
}
