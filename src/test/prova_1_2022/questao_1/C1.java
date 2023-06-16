package test.prova_1_2022.questao_1;

public class C1 {

    int x = 1, y = 1;

    public C1() {
        System.out.println("Ritmooo, ritmoooo de contrutorrrr !!");
        x++; // 2
        y--; // 0
    }

    public C1(int f) {
        System.out.println("Você tem certeza ? Posso perguntar ?");
        x *= f;
        y += f;
    }
}
