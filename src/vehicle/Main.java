package vehicle;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Airplane airplane = new Airplane();
        System.out.println(airplane.getGo());
        System.out.println(airplane.getInfo());
        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.getInfo());
        Lada lada = new Lada();
        System.out.println(lada.getInfo());
        Lada lada2 = new Lada();

        System.out.println(lada.equals(ferrari));
        System.out.println(lada.equals(lada2));
        System.out.println(ferrari.equals(new Ferrari()));

        System.gc();   //проверка finalize

        System.out.println(lada.toString());
        System.out.println(lada.hashCode());

        System.out.println(lada.getClass());

        Lada lada3 = (Lada) lada.clone();
        System.out.println(lada3.getInfo());
    }
}
