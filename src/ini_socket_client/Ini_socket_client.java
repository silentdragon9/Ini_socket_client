/*
This program will communicate using socket 8080 and sent trap to server (Ini_socket_server.java).

Name: Mohammad Ariff Bin Idris
ID: 2017430762
Subject: Test 3 ITT786
Dateline: 18 November 2018
*/
package ini_socket_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Ini_socket_client {

    
    public static void main(String[] args) {
        
       try
        {
            Socket sock = new Socket("localhost",8080);
            
            PrintStream pr = new PrintStream(sock.getOutputStream());
            
            System.out.print("This program will provide the currently used RAM, type anything to continue [YES]: ");
            
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader ed = new BufferedReader(rd);
            
            String temp = ed.readLine();
            
            pr.println(temp);
            
            BufferedReader gt = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            
            String tm = gt.readLine();
            System.out.print(tm);
            
        }catch(IOException ex){ ex.printStackTrace();} 
        
        
    }
    
}
