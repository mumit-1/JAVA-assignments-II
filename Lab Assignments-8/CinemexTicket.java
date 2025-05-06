public class CinemexTicket extends MovieTicket{
    public static int totalTicket;
    public String genre;
    public String status="Not paid";
  
    public static int getTotalTickets(){
        return totalTicket;
    }
    public CinemexTicket(String a, String b, String c, String d, String e) {
        super(a, d, b, 0.0);
        totalTicket++;
        genre = c;
        
        this.seat=e;
    }
    public CinemexTicket(String a,String b,String c,String d){
        this(a,b,c,d,"Regular");
    }
    public void calculateTicketPrice(){
        int num1 = Integer.parseInt(showtime.split(":")[0]);
        if(num1<(11+12) & num1>=(6+12)){
             int ok = 0;
        for (int i = 0; i < seatTypes.length; i++) {
            if (this.seat.equals(seatTypes[i])) {
                ok = i;
                break;
            }
        }
        super.setPrice(seatPrices[ok]);
            super.setPrice(super.getPrice()+(super.getPrice()*(nightShowCharge/100.00)));
        }
        else{
        int ok = 0;
        for (int i = 0; i < seatTypes.length; i++) {
            if (this.seat.equals(seatTypes[i])) {
                ok = i;
                break;
            }
        }
        super.setPrice(seatPrices[ok]);
        }
        System.out.println("Ticket price is calculated successfully.");
    }
    public String toString(){
        return "Movie: " + super.getMovie() + "-"+seat.charAt(0)+"-"+totalTicket+"\nShowtime: " + showtime + "\nDate: " + date+"\nGenre: "+genre+"\nSeat Type: "+this.seat+"\nPrice(tk): "+super.getPrice()+"\nStatus: "+status;
        }
    public String confirmPayment(){
        if(status.equals("Not paid")){
            status="Paid";
            return "Payment Successful.";
        }
        else{
             return "Ticket price is already paid!";
        }
    }
}
