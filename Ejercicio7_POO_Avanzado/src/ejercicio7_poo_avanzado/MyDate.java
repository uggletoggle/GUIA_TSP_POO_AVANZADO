package ejercicio7_poo_avanzado;

public class MyDate {
    
    private int year;
    private int month;
    private int day;
    private final static String[] strMonths = {
        "Jan","Feb","Mar","Apr","May","Jun","Jul",
        "Aug", "Sep", "Oct", "Nov", "Dec"
        };
    private final static String[] strDays = {
        "Sunday" , "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"
    };
    private final static int[] daysInMonths = {
        31,28,31,30,31,30,31,31,30,31,30,31
    };
    
    public static boolean isLeapYear(int year){
        
        //Es bisiesto si es divisible por 4 y no por 100, a excepción de que también sea divisible por 400
        if(year%4 == 0){
            
            if (year%100 == 0){
            
                if (year % 400 == 0){
                    return true;
                } else return false;
                
            } else return true;
            
        }else return false;

    }
    
    public static boolean isValidDate(int year, int month, int day){
      
      if (month < 1 || month > 12){
          return false;
      }
      
      if (day < 1 || day > MyDate.daysInMonths[month-1]){
          return false;
      }
      
      return true;
      
    }
    
    public static int getDayOfWeek(int year, int month, int day){
        //Suponiendo que el mes arranca dia domingo
        int j = -1;
        
        if (MyDate.isValidDate(year, month, day)) {
            for(int i = 0; i < day; i++){
                j++;
                if(j == strDays.length){
                    j = 0;
                }
            }
        }
        
        return j;
    }
    
    public MyDate(int year, int month, int day){
        this.year= year;
        this.month = month;
        this.day = day;
    }
    
    public void setDate(int year, int month, int day){
        this.year= year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear(){return year;}
    public int getMonth(){return month;}
    public int getDay(){return day;}
    
    public void setYear(int year){this.year = year;}
    public void setMonth(int month){this.month = month;}
    public void setDay(int day){this.day = day;}
    
    @Override
    public String toString(){
        return strDays[MyDate.getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month-1] + " " + year;
    }
    
    public MyDate nextDay(){
        if (MyDate.isValidDate(year,month,day + 1)){
            return new MyDate(year,month,day + 1);
        } else if (MyDate.isValidDate(year,month+1,day)){
            return new MyDate(year,month+1,1);
        } else return new MyDate(year+1, 1, 1);
    }
    
    public MyDate nextMonth(){
        if (MyDate.isValidDate(year,month+1,day)){
            return new MyDate(year,month+1, day);
        }  else return new MyDate(year+1, 1, day);
    }
    
    public MyDate nextYear(){
        return new MyDate(year+1,month, day);
    }
    
    public MyDate previuousDay(){
        if (MyDate.isValidDate(year,month,day - 1)){
            return new MyDate(year,month,day - 1);
        } else if (MyDate.isValidDate(year,month-1,day)){
            return new MyDate(year,month-1,MyDate.daysInMonths[month-1]);
        } else return new MyDate(year-1, 12, MyDate.daysInMonths[11]);
    }
    
    public MyDate previousMonth(){
        if (MyDate.isValidDate(year,month-1,day)){
            return new MyDate(year,month-1, day);
        }  else return new MyDate(year-1, 12, day);
    }
    
    public MyDate previousYear(){
        return new MyDate(year-1,month, day);
    }
}
