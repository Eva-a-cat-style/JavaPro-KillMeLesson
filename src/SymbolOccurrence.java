public class SymbolOccurrence {
    public static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        for(char currentChar : str.toCharArray()){
            if(currentChar == symbol){
                count++;

            }
        }
        return count;
    }
}