import java.util.Arrays;

public class DragonKnight {
    public static void main(String[] args) throws Exception {
        int naga[] ={7, 2};
        int kesatria[] = {2, 1, 8, 5};

        Arrays.sort(naga);
        Arrays.sort(kesatria);

        int MinTotal =0;
        int D = 0;

        for (int h : kesatria){
            if((D < naga.length) && (h >= naga[D])){
                MinTotal += h;
                D++;
            }
        }

        if (D == naga.length){
            System.out.println(MinTotal);
        } else {
            System.out.println("Knight Fall");
        }
    }
}
