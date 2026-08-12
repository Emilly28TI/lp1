*/calculadoraDeIdade
  
import java.time.LocalDate;
import java.time.Period;

public class CalculadoraIdade {
    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(1995, 8, 15);
        LocalDate hoje = LocalDate.now();
        
        int idade = Period.between(nascimento, hoje).getYears();
        
        System.out.println("A idade é: " + idade + " anos.");
    }
}
