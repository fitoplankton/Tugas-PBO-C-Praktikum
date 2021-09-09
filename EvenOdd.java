public class EvenOdd {
    public static void main(String[] args) throws Exception {
        int angka[]={1, 2, 3, 123124235, 4364123, 263464585, 1382460935, 
            328947023, 1928309120, 
            1092738906, 109749283, 5, 1, 7, 4, 
            239097515, 283957286, 984091236, 983407625, 
            238705926, 3826755, 89743095, 238970915, 
            283657235, 32589623,2385725,
            283572096, 235872095};
        
        System.out.println("Odd Numbers:");
        for(int k=0;k<angka.length;k++){
            if(angka[k]%2 != 0){
                System.out.println(angka[k]);
            }
        }
        
        System.out.println(" ");

        System.out.println("Even Numbers:");
        for(int k=0;k<angka.length;k++){
            if(angka[k]%2==0){
                System.out.println(angka[k]);
            }
        }
    }
}