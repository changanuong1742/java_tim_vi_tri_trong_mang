import java.util.Scanner;

 class TimGiaTriTrongMang {

    public static void main(String[] args) {

        String [] students = {"Long", "Nam", "Nhi", "Quoc"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten De Ktra: ");
        String input_name = scanner.nextLine();
        boolean status = false;

        for(int i = 0; i<students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Tim kiem ten: " + input_name + " Vi tri la: " + (i + 1));
                status = true;
                break;
            } else if(!status) {
                System.out.println("Khong tim thay ten nay trong mang");
            }
        }
    }
}
