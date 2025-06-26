public class ds_02 {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double area = Math.PI * radius * radius;
        System.out.println("面積：" + area);
    }
}