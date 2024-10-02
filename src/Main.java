import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float peso;
        float altura;
        float imc;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Informe seu peso:  ");
        peso= scanner.nextFloat();

        System.out.println("Informe sua altura: ");
        altura=scanner.nextFloat();

        altura=altura*altura;

        imc=peso/altura;

        System.out.println("Seu IMC é de: "+imc);

        if(imc<18.5){
            System.out.println("IMC abaixo do ideal");
        }
        else if(imc<25) {
            System.out.println("IMC está normal");
        }
        else if(imc<30 ){
            System.out.println(("IMC com excesso de peso"));
        }
        else if(imc<35){
            System.out.println("IMC de obesidade grau 1");
        }
        else if(imc<40){
            System.out.println("IMC de obesidade grau 2");
        }
        else{
            System.out.println("IMC de obesidade grau 3");
        }

    }
}