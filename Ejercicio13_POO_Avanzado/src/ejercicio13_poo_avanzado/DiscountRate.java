package ejercicio13_poo_avanzado;

public class DiscountRate {

    private static double serviceDiscountPremium=0.2;
    private static double serviceDiscountGold=0.15;
    private static double serviceDiscountSilver=0.1;
    private static double productDiscountPremium=0.1;
    private static double productDiscountGold=0.1;
    private static double productDiscountSilver=0.1;
    
    public static double getServiceDiscountRate(String type){
        
        if (type == null){
            return 1;
        }
        
        if (type.equals("PREMIUM")){
            return DiscountRate.serviceDiscountPremium;
        }
        else if (type.equals("GOLD")){
            return DiscountRate.serviceDiscountGold;
        }
        else if (type.equals("SILVER")){
            return DiscountRate.serviceDiscountSilver;
        } else return 1;
        
    }
    
    public static double getProductDiscountRate(String type){
        
        if (type == null){
            return 1;
        }
        
        if (type.equals("PREMIUM")){
            return DiscountRate.productDiscountPremium;
        }
        else if (type.equals("GOLD")){
            return DiscountRate.productDiscountGold;
        }
        else if (type.equals("SILVER")){
            return DiscountRate.productDiscountSilver;
        } else return 1;
    }
}
