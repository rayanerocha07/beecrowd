import java.io.IOException;
import java.util.Scanner;

public class main {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();
        double media = ((3.5 * n1) + (7.5 * n2))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
    }
	
}
