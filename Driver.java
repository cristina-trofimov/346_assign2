

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.PrintStream;

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

      try {
          PrintStream printStream = new PrintStream("output.txt");  /* Redirecting the output to a file */
          System.setOut(printStream);
      } catch (Exception e) {
          System.out.println("FILE NOT FOUND");
          System.exit(0);
      }


    	Network objNetwork = new Network( );            /* Activate the network */
      objNetwork.start();

      Server objServer1 = new Server("serverThread1");       /* Start the sending server thread */
      objServer1.start();
      Server objServer2 = new Server("serverThread2");       /* Start the receiving server thread */
      objServer2.start();
      Server objServer3 = new Server("serverThread3");       /* Start the receiving server thread */
      objServer3.start();

      Client objClient1 = new Client("sending");          /* Start the sending client thread */
      objClient1.start();
      Client objClient2 = new Client("receiving");        /* Start the receiving client thread */
      objClient2.start();
        
      /*..............................................................................................................................................................*/
       
    }
    
 }
