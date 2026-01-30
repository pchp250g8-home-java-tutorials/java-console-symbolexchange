/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.symbolexchange;
import java.io.*;

/**
 *
 * @author PC
 */
public class SymbolExchange 
{

    public static void main(String[] args) throws Exception
    {
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in,"cp866"));
        var bufStdOut = new PrintWriter(new OutputStreamWriter(System.out,"cp866"),true);
        System.out.println("Input a string");
        var strLine1 = bufStdIn.readLine();
        var nLen = strLine1.length();
        var strLine2 = strLine1.charAt(nLen - 1) + 
                       strLine1.substring(1, nLen - 1) + strLine1.charAt(0);
        bufStdOut.println("Source string: " + strLine1);
        bufStdOut.println("Destination String: " + strLine2);
    }
}
