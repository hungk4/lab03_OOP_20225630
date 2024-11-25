package lab01.code;

import java.util.Scanner;

public class DaysOfMonth {
  String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
  String[] Abbreviation = {"Jan", "Feb" , "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
  String[] In3L = {"Jan", "Feb" , "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
  
  public boolean isLeapyear(int year){
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  public int daysOfMonth(String month, int year){
    int monthNum = -1;
    try{
      monthNum = Integer.parseInt(month);

      if(monthNum < 1 || monthNum > 12) {
        return -1;
      }
    } catch(NumberFormatException e){
    }

    for(int i = 0; i < 12; i++){
      if(month == months[i] || month == Abbreviation[i] || month == In3L[i]){
        monthNum = i + 1;
        break;
      }
    }
    
    switch (monthNum) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        return isLeapyear(year) ? 29 : 28;
      default:
        return -1;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a years: ");
    int year = scanner.nextInt();
    scanner.nextLine(); 
  
    System.out.print("Enter a month (1, Jan, January): ");
    String month = scanner.nextLine();
  
    DaysOfMonth daysOfMonth = new DaysOfMonth();
  
    int days = daysOfMonth.daysOfMonth(month, year);
    if (days == -1) {
      System.out.println("Invalid month entered.");
    } else {
        System.out.println("The month of " + month + " in the year " + year + " has " + days + " days.");
    }
  
    scanner.close();
    
  }
}


 