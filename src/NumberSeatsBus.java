public enum NumberSeatsBus {

    ESPECIALLYSMALL(0, 10),                 //особо малая (до 10 мест)
    SMALL(10, 25),                           //малая (до 25)
    AVERAGE(40, 50),                         //средняя (40–50)
    BIG(60, 80),                             //большая (60–80)
    VERYBIG(100, 120);                         //особо большая (100–120 мест)

    private final int from;
    private final int to;

    NumberSeatsBus(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
