package test.prova_1_2022.questao_1;

public class C2 extends C1 {

    public void opC2(int f) {
        System.out.println(x + y);
    }

    public C2() {
        System.out.println("Quem quer dinheiroo ? Ou melhor contrutor ?");
        y *= 2;
        x += 3;
    }

    public C2(int f) {
        System.out.println("Passa ou repassa esse contrutor Silvio ?");
        y *= f; // 5
        x += f; // 6
    }
}
