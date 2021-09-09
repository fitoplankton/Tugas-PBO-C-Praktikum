import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearch(int data[], int kiri, int kanan, int search) {
        if (kiri >= kanan) {
            return -1;
        }

        int mid = (kiri + kanan) / 2;

        if (data[mid] < search) {
            return BinarySearch(data, mid + 1, kanan, search);
        } else if (data[mid] > search) {
            return BinarySearch(data, kiri, mid, search);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int data[] = {1, 3, 5, 9, 14, 19, 22, 26, 25, 40, 54, 67, 89, 93, 100};
        System.out.println("data yang ada: 1, 3, 5, 9, 14, 19, 22, 26, 25, 40, 54, 67, 89, 93, 100");

        System.out.print("input yang ingin anda cari: ");
        int search = sc.nextInt();

        int result = BinarySearch(data, 0, data.length, search);

        if (result==-1){
            System.out.println("tidak ada dalam data");
        } else{
            System.out.println("angka " + search + " terdapat pada index ke-" + result);
        }
    }
}




