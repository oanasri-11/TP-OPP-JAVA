public class FeedingProg{

  private String feedtype;
  private double quantity;  // per meal

  
  public FeedingProg(String feedtype, double quantity) {
    this.feedtype = feedtype;
    this.quantity = quantity;
  }
  public void setFeedType(String feedtype){
      this.feedtype = feedtype;
  }
  public void setQuantity(double quantity){
      this.quantity = quantity;
  }
  public String getFeedType(){
      return feedtype;
  }
  public double getQuantity(){
      return quantity;
  }
  public void displayFeedingProg(){
      System.out.println("- Feed Type: " + feedtype);
      System.out.println("- Quantity per meal: " + quantity);
  }
  
  

  
}