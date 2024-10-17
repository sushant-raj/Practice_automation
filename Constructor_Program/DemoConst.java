package Constructor_Program;

import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class DemoConst 
{
   DemoConst ( ) {
    this (5) ;
    System.out.println ("This is Default Construtor") ;
	}

   DemoConst (int i) {
   this ("Azhar Techno Coder");
   System.out.println("This is int type Construtor");
	}
   
   DemoConst(String s) 
   {
	   
   }
    
	  public static void main(String[] args)
	   {
		  DemoConst rv   = new DemoConst( );
	   }
	  
}
