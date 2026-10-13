class AuctionProduct {
    private String productName;
    private double startingPrice;
    private double currentHighestBid;
    private String winningBidder;

  
    public AuctionProduct(String productName, double startingPrice) {
        this.productName = productName.toUpperCase();
        this.startingPrice = startingPrice;
        this.currentHighestBid = startingPrice;
        this.winningBidder = "None";
    }

    public void placeBid(String bidderName, double bidAmount) {
        String formattedBidder = bidderName.toUpperCase();
        System.out.println("\nBidder Name        : " + formattedBidder);
        System.out.printf("Bid Amount         : Rs. %.2f\n", bidAmount);

        if (bidAmount > currentHighestBid) {
            currentHighestBid = bidAmount;
            winningBidder = formattedBidder;
            System.out.println("Bid Status         : Bid Accepted");
        } else {
            System.out.println("Bid Status         : Bid Rejected - Bid Must Be Higher");
        }
    }

    
    public void placeBid(double bidAmount) {
        placeBid("ANONYMOUS", bidAmount);
    }

  
    public void displayProductInfo() {
        System.out.println("========== ONLINE AUCTION PLATFORM ==========");
        System.out.println("\nProduct Name       : " + productName);
        System.out.printf("Starting Price     : Rs. %.2f\n", startingPrice);
    }

 
    public void closeAuction() {
        System.out.println("\n---------- AUCTION SUMMARY ----------");
        System.out.println("Product Name       : " + productName);
        System.out.println("Winning Bidder     : " + winningBidder);
        System.out.printf("Final Bid Amount   : Rs. %.2f\n", currentHighestBid);
        System.out.println("=============================================");
    }
}

public class Main {
    public static void main(String[] args) {
        
        AuctionProduct laptop = new AuctionProduct("laptop", 50000.00);

       
        laptop.displayProductInfo();

      
        laptop.placeBid("ravi", 52000.00);
        laptop.placeBid("priya", 55000.00);
        laptop.placeBid("ravi", 53000.00);

        laptop.closeAuction();
    }
}