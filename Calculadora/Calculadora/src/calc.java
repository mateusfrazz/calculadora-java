import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    numero n1=new numero();
    numero n2=new numero();
    numero res=new numero();
    String opc = "S";
    while(opc.equals("s") || opc.equals("S")){
        System.out.printf("Digite o valor 1:  ");
        n1.setValor(scan.nextInt());
        System.out.printf("Digite o valor 2:  ");
        n2.setValor(scan.nextInt());
        res.setValor(n1.getnumero() + n2.getnumero());
        System.out.println("O resultado é : " + res.getnumero());
        System.out.printf("Deseja somar outro valor?");
        opc= scan.next();
    }
    }
}
