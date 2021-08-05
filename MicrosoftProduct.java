
/**
 * a small software to activate license of a microsoft products.
 * @author (Nishan Paudel)
 * @version (0.1)
 */
public class MicrosoftProduct
{
        // Declaring Variables for Microsoft Product
         private int ProductNo;
         private String ProductName;
         private String ActivationKey;
         private float PriceOfProduct;
     
     // defining constructor and passing arguments in constructors
         public MicrosoftProduct(int ProductNumber,String Product_Name)
     {
         this.ProductNo=ProductNumber;
         this.ProductName=Product_Name;
         this.ActivationKey=""; // assignig empty string to activation key
         this.PriceOfProduct=0; // initilizating 0 to priceOfSoftware variable.
     }
     
     // defining getter method for above four attributes for reading values of a variables.
         public int getProductNo()
         {
             return(ProductNo);
         }
     
         public String getProductName()
         {
             return(ProductName);
         }
        
        public String getActivationKey()
        {
            return(ActivationKey);
        }
        
        public float getPriceOfProduct()
        {
            return(PriceOfProduct);
        }
    
        // Setter methods to set and update values of a variables for below two methods.
        public void setActivationKey(String Activate_key)
        {
            this.ActivationKey=Activate_key;
        }
        
        public void setProductPrice(float ProductPrice)
        {
            this.PriceOfProduct=ProductPrice;
        }
        
        // Displaying details information of windows activation by using IF condition 
        public void DisplayProduct()
        {
            System.out.println("Product Name is : "+ProductName);
            System.out.println("Product Number is : "+ProductNo);
            
           
                if(ActivationKey !="")
                    {
                        System.out.println("Activation Key is : "+ActivationKey);
                        
                    }
                
                if(PriceOfProduct !=0)
                {
                    System.out.println("Price of a product is : "+PriceOfProduct);
                }
        }

}
