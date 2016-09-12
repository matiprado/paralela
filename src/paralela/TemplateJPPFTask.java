package paralela;

import org.jppf.client.JPPFJob;
import org.jppf.node.protocol.JPPFTask;

public class TemplateJPPFTask extends JPPFTask 
{
public void run() 
 { 
   // XXXXXXX aca va el codigo de la tarea.
   System.out.println("Hello, this is the node executing a template JPPF task"); 
  
   // ... 
  
   // XXXXXXXXXX aca metemos el resultado 
   setResult("the execution was performed successfully"); 
 }  


 
 

}