 	import java.util.Scanner;

	public class ProcesoORANGE {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String clientePotencial = "";
	        String condicionesPactadas = "";

	        // Área de identificación de clientes
	        System.out.println("Área de identificación de clientes");
	        System.out.print("Ingrese el nombre del cliente potencial: ");
	        clientePotencial = scanner.nextLine();

	        
	        boolean esNuevo = true; 
	        System.out.print("¿Es un cliente nuevo? (si/no): ");
	        String respuesta = scanner.nextLine();
	        if (respuesta.equalsIgnoreCase("no")) {
	            esNuevo = false;
	        }

	    
	        if (esNuevo) {
	            System.out.println("Preparando y realizando visitas de captación para " + clientePotencial);
	            // Registrar datos de visita de captación
	          

	            System.out.print("¿El cliente potencial está interesado en los servicios? (si/no): ");
	            respuesta = scanner.nextLine();
	            if (respuesta.equalsIgnoreCase("no")) {
	                System.out.println("Registro de captación fallida para " + clientePotencial);
	         
	                System.out.println("Proceso finalizado.");
	            } else {
	                System.out.println("Preparando y realizando visitas de mantenimiento para " + clientePotencial);
	                
	                System.out.println("Registrado en la base datos");
	                     }
	        }
	        else {
	           System.out.println("Preprando vista de manteniemiento para "+ clientePotencial);
	        
	        }
	        System.out.println("Área de explotación");
            System.out.print("¿Han cambiado las condiciones pactadas con el cliente " + clientePotencial + "? (S/N): ");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Verificando si el cliente " + clientePotencial + " es nuevo");
               
                boolean esClienteNuevo = true; 
                System.out.print("¿Es un cliente nuevo? (S/N): ");
                respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    esClienteNuevo = false;
                }

                // Si el cliente es nuevo
                if (esClienteNuevo) {
                    System.out.println("Preparando y realizando visitas de captación para " + clientePotencial);
                    

                    System.out.print("¿El cliente potencial está interesado en los servicios? (S/N): ");
                    respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("no")) {
                        System.out.println("Registro de captación fallida para " + clientePotencial);
                        // Registrar en la base de datos como captación fallida
                     
                        System.out.println("Proceso finalizado.");
                    } else {
                        System.out.println("Preparando y realizando visitas de mantenimiento para " + clientePotencial);
                       
                       System.out.println(" fin de proceso");
	         
	}
	  } 
	    
     else {  
    	 System.out.println( " realizar visitas de mantenimiento");
     }
		
		System.out.println("Se estudiara la viabilidad del servicio");
		boolean esNuevo1 = true; 
        System.out.print("¿El servicio es viable ? (si/no): ");
         respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("no")) {
            esNuevo1 = false;
        }
        
        if (esNuevo1) {
        	System.out.println("se estudia la rentabilidad del servicio");
        	
        	System.out.println( "El servicio es rentable ?  (si/no):");
        	 respuesta = scanner.nextLine();
        	 if (respuesta.equalsIgnoreCase("no")) {
        		System.out.println(" Resgistra como perdida del servicio"); 
        		 System.out.println(" Se documenta e informar  "  + clientePotencial + " sobre no viablidad del servicio "); 
        	 System.out.println("fin de peroceso");
        	 } else {
       		   System.out.println(" entregar oferta personalizada ");
        	 } 
        	 
        	 System.out.println( clientePotencial +  " ¿ El cliente acepta la oferta  ?");
        	 respuesta = scanner.nextLine();
        	 if (respuesta.equalsIgnoreCase("no")) {
        		 System.out.println(" NEGOCIAR OFERTA");
        		 
        		 System.out.println("¿ Se llego a un acuerdo ?");
        		 respuesta = scanner.nextLine();
            	 if (respuesta.equalsIgnoreCase("no")) {
            		 System.out.println(" fin de proceso");
            	 } else {
            		 System.out.println("Se enviara acuerdo a ventas ");
            	    System.out.println(" fin de proceso");
            	 }
        	 }else {
        		 System.out.println(" Se enviara soporte de oferta");
        		 System.out.println(" fin de proceso");
        	 }
        	 
        } else {
        	
        	System.out.println("¿ Verificar si el servicio es nuevo ?");
        	respuesta = scanner.nextLine();
       	 if (respuesta.equalsIgnoreCase("no")) {
       		 System.out.println("  seguir con el proceso ");
        }  else {
        	
        	System.out.println("Se registrara como una captacion fallida");
        	System.out.println(" se genera un informe y se enviara al Dpto");
        	System.out.println(" Fin de proceso");
        }
	
	  
        }
	    
	}
            }
	    }
	
	
	
	
