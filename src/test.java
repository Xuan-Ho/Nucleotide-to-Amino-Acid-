
import java.util.Scanner;

public class test 
{
	/**Note: For using with project SOD1 FULL Sequence
	 * CDS: 149-220; 4169-4265; 6828-6897; 7637-7754; 8850-8957
	 * System.out.println("Nucletide(DNA/RNA) to RNA conversion : "+rna_string.substring(beginIndex(-1), endIndex(+1)));
	 * By Xuan Ho, CS123A FAll 2016
	*/
    public static void main(String[] args) 
    {
      
    	Scanner ns = new Scanner(System.in);
        
    	//Ask for user's input and store it
        System.out.println("Enter a Nucleotide Sequence: ");
        String nsInput = ns.nextLine();
        System.out.println();

      
        conversion convert = new conversion();
        
        //convert the user's input DNA sequence to RNA sequence
        String rna_string  = convert.dnaToRNA(nsInput);
        //store result of DNA to RNA conversion
    	String aa_string = convert.rnaToAA(rna_string.toString());
 
    	//Print DNA to RNA results
    	System.out.println("Nucletide(DNA/RNA) to RNA conversion : "+rna_string);
    	System.out.println();
    	//print RNA to Amino Acid results
    	System.out.println("RNA to Amino Acid conversion : "+aa_string);

    }
}