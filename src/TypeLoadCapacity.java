public enum TypeLoadCapacity {

    N1(0D, 3.5),                  //(с полной массой до 3,5 тонн)
    N2(3.5, 12D),                 //(с полной массой свыше 3,5 до 12 тонн)
    N3(12D, null);                  //(с полной массой свыше 12 тонн)

    private final  Double from;
    private final Double to;

    TypeLoadCapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }
}
