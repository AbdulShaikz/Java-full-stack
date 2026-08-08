import java.util.Scanner;

public class WordsFrequencyCounter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence or paragraph: ");
        String text = input.nextLine();
        String cleaned = text.toLowerCase().trim().replaceAll("[^a-zA-z0-9'\\s]","");
        String[] words = cleaned.split("\\s+");

        String[] uniqueWords = new String[words.length];
        int[] frequencies = new int[words.length];
        int uniqueCount = 0;

        for(int i=0;i<words.length;i++){
            String currentWord = words[i];
            if(currentWord.isEmpty()){
                continue;
            }
            boolean found = false;
            for(int j=0;j<uniqueCount;j++){
                if(uniqueWords[j].equals(currentWord)){
                    frequencies[j]++;
                    found = true;
                    break;
                }
            }

            if(!found){
                uniqueWords[uniqueCount] = currentWord;
                frequencies[uniqueCount] = 1;
                uniqueCount++;
            }
        }
        
        for(int i=0;i<uniqueCount-1;i++){
            for(int j=0;j<uniqueCount-1-i;j++){
                if(frequencies[j]<frequencies[j+1]){
                    int tempCount = frequencies[j];
                    frequencies[j] = frequencies[j+1];
                    frequencies[j+1] = tempCount;

                    String tempWord = uniqueWords[j];
                    uniqueWords[j] = uniqueWords[j+1];
                    uniqueWords[j+1] = tempWord;
                }
            }
        }
        System.out.println("Results ranked by highest frequency: ");
        for(int i=0;i<uniqueCount;i++){
            System.out.println(uniqueWords[i]+" : "+frequencies[i]);
        }
        input.close();
    }
}