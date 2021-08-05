
/**
 * HomeEdition Version of a microsoft products 
 * @author (Nishan Paudel)
 * @version (0.1)
 */
// creating child class for HomeEdition 
public class HomeEdition extends MicrosoftProduct 
{
    private String userName;
    private String activationDate;
    private String licenseExpireDate;
    private boolean isActivated;
    
// defining constructors which contains three parameters of different data types
public HomeEdition(int ProductNumber,String Product_Name,float Price)
{
   super(ProductNumber,Product_Name);
   super.setProductPrice(Price);
   this.userName="";
   this.activationDate="";
   this.licenseExpireDate="";
   this.isActivated=false;
   

}
// creating getter to return values of a variable.
public String getuserName()
{
    return(userName);
}
public String getActivationDate()
{
    return(activationDate);
}
public String getlicenseExpireDate()
{
    return(licenseExpireDate);
}
public boolean getisActivated()
{
    return(isActivated);
}

// Defining setter method sets variable values in the below function IF ELSE condition is used to set price of a products.
public void setprice(float price)
{
    if(isActivated ==false)
        {
            super.setProductPrice(price);
        }
        
        else
        {
            System.out.println("not possible to change the license price.");
        }

}

// ActivateLicense() methods to activate license of a products using IF ELSE condition.
public void ActivateLicense(String Name_of_User,String ActivationDate,String license_expire_date,String Activationkey)
{
    if(isActivated== true)
        {
            System.out.println("name of user: "+userName);
            System.out.println("Activation Date: "+activationDate);
        }
    else
        {
            super.setActivationKey(Activationkey);
            this.userName=Name_of_User;
            this.activationDate=ActivationDate;
            this.licenseExpireDate=license_expire_date;
            this.isActivated=true;
            
        }
}

// a method to display the details ot the products. 
public void DisplayProduct()
{
    super.DisplayProduct();
    if(isActivated==true)
    {
         // status of activation
         System.out.println("License has Activated");
        System.out.println("User name: "+userName);  // name of a product holder
        System.out.println("Activation Date: "+activationDate);  // date of license activation
        System.out.println("Expire Date: "+licenseExpireDate); // expire date of license 

    }
    else
    {
        System.out.println("License has not activated.");
    }

}

}

