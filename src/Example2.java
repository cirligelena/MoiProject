public class Example2 {
    public static void main(String[] args) {
        double sumMas1 = 0, sumMas2 = 0;

        int[] masiv1 = new int[5];
        for (int i =0; i < masiv1.length; i++){
            masiv1[i] = (int)(Math.random()*6);
            System.out.print(masiv1[i] + " ");
            sumMas1 = sumMas1 + masiv1[i];
        }
        System.out.println();

        int[] masiv2 = new int[5];
        for (int i =0; i < masiv2.length; i++) {
            masiv2[i] = (int) (Math.random() * 6);
            System.out.print(masiv2[i] + " ");
            sumMas2 = sumMas2 + masiv2[i];
        }
        System.out.println("\n" + sumMas1/5 + "  " + sumMas2/5);
        if (sumMas1/5 == sumMas2/5)
            System.out.println("\naverage of this arrays is equal");
        else if (sumMas1/5 < sumMas2/5)
            System.out.println("\naverage of second array is bigger than average of first array");
        else System.out.println("\naverage of first array is bigger than average of second array");
    }

}
