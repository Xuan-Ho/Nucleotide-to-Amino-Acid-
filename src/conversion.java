
public class conversion 
{
	private String dna;
	private String rna;
	
	
	
	public conversion() 
	{
			
	}
	
	//DNA 5'3' to mRNA Conversion
	String dnaToRNA (String dna) 
    {
		dna = dna.toUpperCase();
		
        StringBuilder sRNA = new StringBuilder(dna);

        for (int i = 0; i < dna.length(); i++) 
        {
            String single = dna.substring(i, i+1);

            switch (single) 
            {
            
            case "T":
            	sRNA.setCharAt(i, 'U');
            	break;
            default:
            		// do nothing;
            }
        }
        return sRNA.toString();
    }
         

            

    ///mRNA to Amino Acid Conversion
	String rnaToAA (String rna) 
    {
		rna = rna.toUpperCase();
		
        StringBuilder sAA = new StringBuilder();

        int j=0,k=3;
        int length = rna.length()/3;
        for (int i = 0; i < length; i++) 
        {
        	
            String triplet = rna.substring(j,k);

            switch (triplet) 
            {
            case "UUU":
            case "UUC":
                sAA.append("F");
                break;
            case "UUA":
            case "UUG":
            case "CUU":
            case "CUC":
            case "CUA":
            case "CUG":
                sAA.append("L");
                break;
            case "AUU":
            case "AUC":
            case "AUA":
                sAA.append("I");
                break;
            case "AUG":
                sAA.append("M");
                break;
            case "GUU":
            case "GUC":
            case "GUA":
            case "GUG":
                sAA.append("V");
                break;
            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG":
            	sAA.append("S");
                break;
            case "CCU":
            case "CCC":
            case "CCA":
            case "CCG":
            	sAA.append("P");
                break;
            case "ACU":
            case "ACC":
            case "ACA":
            case "ACG":
            	sAA.append("T");
                break;
            case "GCU":
            case "GCC":
            case "GCA":
            case "GCG":
            	sAA.append("A");
                break;
            case "UAU":
            case "UAC":
            	sAA.append("Y");
                break;
            case "UAA":
            case "UAG":
            	sAA.append("-");  //stop codon represent by "-"
                break;
            case "CAU":
            case "CAC":
            	sAA.append("H");
                break;
            case "CAA":
            case "CAG":
            	sAA.append("Q");
                break;
            case "AAU":
            case "AAC":
            	sAA.append("N");
                break;
            case "AAA":
            case "AAG":
            	sAA.append("K");
                break;
            case "GAU":
            case "GAC":
            	sAA.append("D");
                break;
            case "GAA":
            case "GAG":
            	sAA.append("E");
                break;
            case "UGU":
            case "UGC":
            	sAA.append("C");
                break;
            case "UGA":
            	sAA.append("-"); //stop codon represent by "-"
                break;
            case "UGG":
            	sAA.append("W");
                break;
            case "CGU":
            case "CGC":
            case "CGA":
            case "CGG":
            	sAA.append("R");
                break;
            case "AGU":
            case "AGC":
            	sAA.append("S");
                break;
            case "AGA":
            case "AGG":
            	sAA.append("R");
                break;
            case "GGU":
            case "GGC":
            case "GGA":
            case "GGG":
            	sAA.append("G");
                break;
                
            default:
                // do nothing;
            }   
            
            j= k;
            k+=3;
        }       

        return sAA.toString();
    }


}