package com.csc;

//import java.util.Scanner;

public class Converter {
  //for user input if we ever comeback to this assignment
  //-----------------------------------------------------
  //Scanner user = new Scanner(System.in);
  //Converter converter = new Converter();

  // public void prompt() {
  // prompt is universal so this is the entry point to the converters
  // System.out.print("enter how many ounces you have: ");
  // int ounces = user.nextInt();
  // bringing in converters
  // converter.toPounds(ounces);
  // converter.toPoundsAndOunces(ounces);
  // }
  //-------------------------------------------------------
  public String toPounds(int ounces) {
    String lbs = "lbs";
    double constant = 16;
    double output = ounces / constant;
    if (output == 1) {
      lbs = "lb";
    }
    return (String.format("%.4f " + lbs, output));
  }

  public String toPoundsAndOunces(int ounces) {
    // adding abrevviated pounds
    String Abbr;
    int lb = 0;
    // converting to pounds
    while (ounces >= 16) {
      ounces = ounces - 16;
      lb = lb + 1;
    }
    // check for one or zero pounds
    if (lb == 1) {
      Abbr = "lb";
    } else {
      Abbr = "lbs";
    }
    return (String.format("%d %s %d oz", lb, Abbr, ounces));
  }
}