
public class App {

    public static void main(String[] args) {

        Metodos a = new Metodos();

        int[] list1 = Generador.generate(10000);
        int[] list2 = Generador.generate(50000);
        int[] list3 = Generador.generate(100000);

        int[] bubble1 = list1.clone();
        int[] bubble2 = list2.clone();
        int[] bubble3 = list3.clone();

        int[] quick1 = list1.clone();
        int[] quick2 = list2.clone();
        int[] quick3 = list3.clone();

        int[] col1 = list1.clone();
        int[] col2 = list2.clone();
        int[] col3 = list3.clone();

        int[] colV1 = list1.clone();
        int[] colV2 = list2.clone();
        int[] colV3 = list3.clone();

        Results resBubble1 = Benchmark.medir(() -> a.sortBubble(bubble1), "Burbuja", "10.000");
        Results resBubble2 = Benchmark.medir(() -> a.sortBubble(bubble2), "Burbuja", "50.000");
        Results resBubble3 = Benchmark.medir(() -> a.sortBubble(bubble3), "Burbuja", "100.000");

        Results resQuick1 = Benchmark.medir(() -> a.sortQuick(quick1), "Quicsort", "10.000");
        Results resQuick2 = Benchmark.medir(() -> a.sortQuick(quick2), "Quicsort", "50.000");
        Results resQuick3 = Benchmark.medir(() -> a.sortQuick(quick3), "Quicsort", "100.000");

        Results resCol1 = Benchmark.medir(() -> a.sortCollectors(col1), "Collectors", "10.000");
        Results resCol2 = Benchmark.medir(() -> a.sortCollectors(col2), "Collectors", "50.000");
        Results resCol3 = Benchmark.medir(() -> a.sortCollectors(col3), "Collectors", "100.000");

        Results resColV1 = Benchmark.medir(() -> a.sortCollectorsV2(colV1), "Collectors V2", "10.000");
        Results resColV2 = Benchmark.medir(() -> a.sortCollectorsV2(colV2), "Collectors V2", "50.000");
        Results resColV3 = Benchmark.medir(() -> a.sortCollectorsV2(colV3), "Collectors V2", "100.000");

        System.out.println(resBubble1);
        System.out.println(resBubble2);
        System.out.println(resBubble3);
        System.out.println();

        System.out.println(resQuick1);
        System.out.println(resQuick2);
        System.out.println(resQuick3);
        System.out.println();

        System.out.println(resCol1);
        System.out.println(resCol2);
        System.out.println(resCol3);
        System.out.println();

        System.out.println(resColV1);
        System.out.println(resColV2);
        System.out.println(resColV3);
    }
}
