/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jpretorius.assignment2;

/**
 *
 * @author user
 */
public class Assignment2Demo 
{   
    public float FloatAssertion(float a, float b)
    {
        return a+b;
    }
    
    public int IntAssertion(int a, int b)
    {
        return a+b;
    }
    
    public String AssertNonNullness(String check)
    {
        return check;
    }
    
    public String AssertNullness(String check)
    {
        return check;
    }
        
    public boolean TruthCheck(boolean check) 
    {
        if(check==true)
            return true;
        else
            return false;
    }
    
    public boolean FalseCheck(boolean check) 
    {
        if(check==true)
            return true;
        else
            return false;
    }
    
    public int addFailing(int a, int b) 
    {
        return a+b;
    }
    
    public boolean ObjectIdentity(String a)
    {
        if(a == "Match")
            return true;
        else
            return false;
    }
    
    public boolean ObjectEquality(String a, String b)
    {
        if(a == b)
            return true;
        else
            return false;
    }
    
}
