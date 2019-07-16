package homework;

//HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). 
//Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:
//
//200, OK (fulfilled)
//401, unauthorized
//403, forbidden
//404, not found
//500, server error
//otherwise, not supported status code
//


import java.util.*;

public class NNN3_2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int statusCode = scan.nextInt();
    switch(statusCode){
    case 200:
    	System.out.println("OK (fulfilled)");
    	break;
    case 401:
    	System.out.println("unauthorized");
    	break;
    case 403:
    	System.out.println("forbidden");
    	break;
    case 404:
    	System.out.println("not found");
    	break;
    case 500:
    	System.out.println("server error");
    	break;
    	default:
    		System.out.println("not supported status code");
    		break;
    	
    }
      
    }
  }




