import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static List<Quarto> quartos = new ArrayList<>();

    public static void main(String[] args) {

        Hospede hospede1 = new Hospede("José Henrique", "120.804.049-97", "99871-5221");
        Hospede hospede2 = new Hospede("Arthur Bitencourt", "119.698.431-10", "99635-2751");

        System.out.println("Hóspede 1 - " + hospede1);
        System.out.println();
        System.out.println("Hóspede 2 - " + hospede2);
        System.out.println();
        
        QuartoSimples quartoSimples1 = new QuartoSimples(101, "Simples", 2, 200, true);
		QuartoSimples quartoSimples2 = new QuartoSimples(102, "Simples", 2, 200, true);
		QuartoLuxo quartoLuxo1 = new QuartoLuxo(201, "Luxo", 4, 500, false);
		QuartoLuxo quartoLuxo2 = new QuartoLuxo(202, "Luxo", 4, 500, true);

        quartos.add(quartoSimples1);
        quartos.add(quartoSimples2);
        quartos.add(quartoLuxo1);
        quartos.add(quartoLuxo2);

        System.out.println("Quartos-\n" + quartoSimples1 + "\n" + quartoSimples2 + "\n" + quartoLuxo1 + "\n" + quartoLuxo2);

    }
}
