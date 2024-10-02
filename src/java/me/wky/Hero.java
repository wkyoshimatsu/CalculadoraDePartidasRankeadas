package src.java.me.wky;

public class Hero {
    private int wins;
    private int loses;
    private int balance;
    private String rank;

    public Hero() {
        this.wins = 0;
        this.loses = 0;
        this.balance = 0;
        this.rank = "Ferro";
    }

    public void calculateRank(int wins, int loses){
        this.wins = wins;
        this.loses = loses;

        this.balance = wins - loses;

        if (balance < 10){
            this.rank = "Ferro";
        } else if (balance < 20) {
            this.rank = "Bronze";
        } else if (balance < 50) {
            this.rank = "Prata";
        } else if (balance < 80) {
            this.rank = "Ouro";
        } else if (balance < 90) {
            this.rank = "Diamante";
        } else if (balance < 100) {
            this.rank = "Lendário";
        } else {
            this.rank = "Imortal";
        }
    }

    public String heroToString() {
        return "O Herói tem de saldo de " + balance +
                " está no nível de " + rank;
    }
}
