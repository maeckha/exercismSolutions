import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProteinTranslator {


    public static void main(String[] args) {

        ProteinTranslator pt = new ProteinTranslator();

        System.out.println(pt.translate("AUGUUUUGG"));
    }


    public static List<String> translate(String rnaSequence) {

        List<String> proteinList = new ArrayList<>();
        String tempString;
        //if (rnaSequence.startsWith("AUG")) {

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            tempString = "" + rnaSequence.charAt(i) + rnaSequence.charAt(i + 1) + rnaSequence.charAt(i + 2);

            switch (tempString) {
                case "AUG":
                    proteinList.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    proteinList.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    proteinList.add("Leucine");
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    proteinList.add("Serine");
                    break;
                case "UAU":
                case "UAC":
                    proteinList.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    proteinList.add("Cysteine");
                    break;
                case "UGG":
                    proteinList.add("Tryptophan");
                    break;
                case "UAA":
                case "UAG":
                case "UGA":
                    i = rnaSequence.length(); // Falls Stop - Codon vorkommt, wird aus der for - Schleife ausgebrochen
                    break;

            }

        }
                return proteinList;
    }
}
/*
            if (rnaSequence.substring(i).contains("AUG")) {
                proteinList.add("Methionine");
            } else if (rnaSequence.contains("UUU") || rnaSequence.contains("UUC")) {
                proteinList.add("Phenylalanine");
            } else if (rnaSequence.contains("UUA") || rnaSequence.contains("UUG")) {
                proteinList.add("Leucine");
            } else if (rnaSequence.contains("UCU") || rnaSequence.contains("UCC") || rnaSequence.contains("UCA") || rnaSequence.contains("UCG")) {
                proteinList.add("Serine");
            } else if (rnaSequence.contains("UAU") || rnaSequence.contains("UAC")) {
                proteinList.add("Tyrosine");
            } else if (rnaSequence.contains("UGU") || rnaSequence.contains("UGC")) {
                proteinList.add("Cysteine");
            } else if (rnaSequence.contains("UGG")) {
                proteinList.add("Tryptophan");
            } else if (rnaSequence.contains("UAA") || rnaSequence.contains("UAG") || rnaSequence.contains("UGA")) {
                break;
            }

        }
        return proteinList;
        */
