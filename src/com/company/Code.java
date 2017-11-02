package com.company;

/**
 * Created by ms078 on 11/2/17.
 */
import java.util.*;
public class Code
{
    private String myCode;
    private String originalCode;
    private String xcode;
    public Code(String code)
    {
        myCode = code;
        originalCode = code;
        xcode = "";
        for(int i =0; i < code.length(); i++)
        {
            xcode = xcode + "X";
        }
    }
    public String getCode()
    {
        return myCode;
    }
    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()
// Replaces the characters in the code starting at
// position p1 until position p2 - 1 inclusive with an X
    public void hide(int p1, int p2)
    {
        Scanner input = new Scanner(System.in);


    }
    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()
// Restores to their original values the characters in
// the code starting at position p1 until position
// p2-1 inclusive
    public void recover(int p1, int p2)
    {
// to be implemented
    }
}
