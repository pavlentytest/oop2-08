public class Main {
    public static void main(String[] args) {
        TV samsung = new TV();
        System.out.println(samsung.model);
        System.out.println(samsung.diagonal);
        int a = 100;

        TV panasonic = new TV(10.2);
        panasonic.setWeight(11.2);
        panasonic.diagonal = 34;

    }
}