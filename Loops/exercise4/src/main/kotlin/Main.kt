fun main() {
    var ticket: Double = 5.00;
    var totalTickets: Int = 120;
    while(ticket >= 1){
        var profit: Double = (ticket * totalTickets) - 200;
        println("|Ticket Price: R$ $ticket | Total Tickets sold: $totalTickets | Profit: R$ $profit");
        ticket = ticket - 0.5;
        totalTickets = totalTickets + 26;

    }
}