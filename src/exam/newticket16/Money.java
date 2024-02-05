package exam.newticket16;

class Money {
    private long rubles;

    private double kopecks;

    public Money(long rubles, double kopecks) {
        this.rubles = rubles;
        this.kopecks = kopecks;
    }
    public long getRubles() {
        return rubles;
    }

    public double getKopecks() {
        return kopecks;
    }
    public void setRubles(long rubles) {
        this.rubles = rubles;
    }

    public void setKopecks(double kopecks) {
        this.kopecks = kopecks;
    }


    public Money add(Money other) {
        long resultRubles = this.rubles + other.rubles;
        double resultKopecks = this.kopecks + other.kopecks;
        return new Money(resultRubles, resultKopecks);
    }

    public Money sub(Money other) {
        long resultRubles = this.rubles - other.rubles;
        double resultKopecks = this.kopecks - other.kopecks;
        return new Money(resultRubles, resultKopecks);
    }


//    private void overflowCheck() {
//       if()
//    }

    @Override
    public String toString() {
        return rubles + "," + String.format("%.2f", kopecks).replace("0.", "");
    }

    public static void main(String[] args) {
        Money money1 = new Money(10, 10);
        Money money2 = new Money(5, 25);
        System.out.println(money1.add(money2));




    }

}
