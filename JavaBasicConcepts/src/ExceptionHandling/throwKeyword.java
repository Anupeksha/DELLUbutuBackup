package ExceptionHandling;

public class throwKeyword {
    public static void main(String[] args) {
        System.out.println("Starting");
        String runMode="N";
        if(runMode.equals("N")) {
            try {
                throw new Exception("MyOwnExceptionInJava");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Exception occured which is recorded by JVM");
            }
        }
        System.out.println("Ending");

    }
}
