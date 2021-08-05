// defining child class for Enterprise Edition
public class EnterpriseEdition extends MicrosoftProduct
{
    private String CompanyName;
    private float PricePerUser;
    private int NumberOfUser;
    private String ActivationDate;
    private String LicenseExpireDate;
    private boolean IsActivated;
    private boolean IsExpired;

// after creating object of a class first constructor will run by defaut.    
public EnterpriseEdition(int ProductNo,String ProductName,float PricePerUser)
{
    super(ProductNo,ProductName); // calling parent class constructor 
    this.NumberOfUser=0;
    this.ActivationDate="";
    this.LicenseExpireDate="";
    this.PricePerUser=PricePerUser;
    this.IsActivated=false;
    this.IsExpired=false;
    this.CompanyName="";
    
}
// getter methods for above instance variables.to set values of a variables.
public String getCompanyName()
{
    return(CompanyName);
}

public float getPricePerUser()
{
    return(PricePerUser);
}

public int getNumberOfUser()
{
    return(NumberOfUser);
}

public String getActivationDate()
{
    return(ActivationDate);
}

public String getLicenseExpireDate()
{
    return(LicenseExpireDate);
}

public boolean getIsActivated()
{
    return(IsActivated);
}

public boolean getIsExpired()
{
    return(IsExpired);
}

// setter methods to set the price to price per user.using if/else condition.
public void setPricePerUser( float Price_per_user)
    {
        
    
        if(IsActivated ==true)
        {
            System.out.println(" it is not possible to change the license price for per user.");
        }
        else
        {
            this.PricePerUser=Price_per_user;
        }
    
    } 
    
    // activatelicense() methods is ussed to activate license for EnterpriseEdition class.
    public void activatelicense(String companyname,int NumberOfUser,String activationDate,String ExpireDate,String ActivationKey)
    {
        if(IsActivated == true)
        {
            System.out.println("Activation key has been already used: ");
            System.out.println("Company Name: "+CompanyName);
            System.out.println("No of user: "+NumberOfUser);
            
        }
        else
        {
            this.CompanyName=companyname;
            this.NumberOfUser=NumberOfUser;
            this.ActivationDate=activationDate;
            this.LicenseExpireDate=ExpireDate; 
            super.setActivationKey(ActivationKey); // calling parent class  
            float totalPrice=NumberOfUser*PricePerUser; // calculating total price for a product
            super.setProductPrice(totalPrice);
            this.IsActivated=true;
            this.IsExpired=false;
            System.out.println("license Sucessfully Activated");
            
            
            
        }
    }
    
        
     // below function is created to terminate license of a Enterprise Edition product 
        public void terminatelicense()
        {
            if(IsExpired ==true)
                {
                    System.out.println("the license has been Expired");
                }
                else
                {
                    this.CompanyName="";
                    this.NumberOfUser=0;
                    this.ActivationDate="";
                    this.LicenseExpireDate="";
                    super.setActivationKey("");
                    super.setProductPrice(0);
                    System.out.println("license has been terminated");
                    this.IsActivated=false;
                    this.IsExpired=false;
                    
                    
                }
            
        }
        
        // a displayproduct() method is used to display details information regarding to to activaton of a product by sing IF ELSE condition
        public void DisplayProduct()
        {
            super.DisplayProduct();
            System.out.println("price of a product per user "+PricePerUser);
            if(IsActivated==true)
            {
                
                System.out.println("Company name : "+CompanyName);
                System.out.println("No of user : "+NumberOfUser);
                System.out.println("License Activation Date : "+ActivationDate);
                System.out.println("License Expire date : "+LicenseExpireDate);
                System.out.println("Total Price of a Product : "+NumberOfUser*PricePerUser);
                System.out.println("Windows is Activated ");
    
            }
            else 
            {
                System.out.println(" Your License has not Activated ");
            }
            
        }
        
        
        
    
}


