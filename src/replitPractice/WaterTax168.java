package replitPractice;

public class WaterTax168 {
    /*
    if the units are 50 or less than 50 * 0.60
    if the units are above 50 than units * 0.90
    if the units are above 100 than units * 0.90 + 50(fine)
    if the units are above 150 than units * 0.90 + 100(fine
     */
    public double waterTax(double units){
        double bill = 0.0;
        if(units <= 50){
            bill = units * 0.60;
        }else if(units > 50 || units < 100){
            bill = units * 0.90;
        }else if(units >= 100 || units < 150){
            bill = (units * 0.90) + 50;
        }else if(units >= 150){
            bill = (units * 0.90) + 100;
        }

        return bill;
    }

}
