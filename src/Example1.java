public class Example1 {
    public static void main(String[] args) {
        int population = 10000000;
        int death = 8;
        int born = 14;
        for (int i = 0; i<10; i++ ){
            if(death>6) death = --death;
            if (born >7) born = --born;

            population = population + population * (born - death) /1000;
        }
        System.out.println("After 10 years population of the city xyz will be: " + population);
    }
}
