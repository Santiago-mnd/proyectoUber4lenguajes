package Java;

class Card extends Payment {
    Integer number;
    Integer cvv;
    String  date;
    
    public Card(Integer id, Integer number, Integer cvv, String date) {
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
    
}
