package topcoders.pt.st.rt.b.s;


import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;


/*
   Expense Tracker that handles expense tracking,saving, and loading from files

*/
public class ExpenseTracker 
{
   private int studentId;
   private LocalDate date;
   private double amount;
   private String category;
   private static List<ExpenseTracker> expenses = new ArrayList<>();

   //Default Constructor
    public ExpenseTracker() 
    {
    }

    //Parameterized Constructor
    public ExpenseTracker(int studentId, LocalDate date, double amount, String category) {
        this.studentId = studentId;
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    public int getStudentId() 
    {
        return studentId;
    }

    public void setId(int studentId)
    {
        this.studentId = studentId;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount) 
    {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public List<ExpenseTracker> getExpenses()
    {
        return expenses;
    }

    public void setExpenses(List<ExpenseTracker> expenses)
    {
        ExpenseTracker.expenses = expenses;
    }
 
    
      
   
    public  int changeMonthFormat(String month)
    {
       int searchMonth = 0;
             
             //If student found continue to search for the month
          
            
               //Convert month format from user to the two digits/one digits of the month
                String monthSearch = month.toLowerCase();
                
                switch(monthSearch)
                {
                    case "january":
                                    searchMonth = 01;
                                    break;
                    case "february":
                                    searchMonth = 02;
                                    break;

                    case "march":
                                    searchMonth = 03;
                                    break;

                    case "april":
                                    searchMonth = 04;
                                    break;

                     case "may":
                                    searchMonth = 05;
                                    break;

                     case "june":
                                    searchMonth = 06;
                                    break;

                     case "july":
                                    searchMonth = 07;
                                    break;

                     case "august":
                                    searchMonth = 8;
                                    break;


                     case "september":
                                      searchMonth = 9;
                                      break;

                     case "october":
                                    searchMonth = 10;
                                    break;

                     case "november":
                                    searchMonth = 11;
                                    break;

                     case "december":
                                    searchMonth = 12;
                                    break;

                     default:
                              JOptionPane.showMessageDialog(null,"INVALID INPUT ENTERED!!","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
                              break;

                }
                
        return searchMonth;
    }

    public String changeMonthCase(String month)
    {
      String temp ="" + Character.toUpperCase(month.charAt(0));
        for (int i = 1; i < month.length(); i++) 
        {
            
            temp +=Character.toLowerCase(month.charAt(i));
        }
      return temp;
    }
    
 }
