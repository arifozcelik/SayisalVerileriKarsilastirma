package karsilastirma;

public class Demo {
    public static void main(String[] args) {
        Integer n = (Integer) 1923;
        Integer m = (Integer) 2015;

        System.out.println(n==m);
        System.out.println(n<m);
        System.out.println(n>m);

        System.out.println("=============");
        
        System.out.println(n.equals(m));
        System.out.println(n.compareTo(m));
    }
}
