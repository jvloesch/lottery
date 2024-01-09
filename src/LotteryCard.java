import java.util.Arrays;

public class LotteryCard{

    //ATTRIBUTES AND CONSTRUCTORS
    private int[] numbersFirstLine, numbersSecondLine;

    public LotteryCard(){
        this.numbersFirstLine = generateLineOfNumbers();
        this.numbersSecondLine = generateLineOfNumbers();
    }

    //GETTERS
    public int[] getNumbersFirstLine() {
        return numbersFirstLine;
    }

    public int[] getNumbersSecondLine() {
        return numbersSecondLine;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Lottery Card Numbers: {First Line: " + Arrays.toString(numbersFirstLine) + "}, {Second Line: "
                + Arrays.toString(numbersSecondLine) + "}";
    }

    //METHOD TO GENERATE THE LINES OF NUMBERS
    public int[] generateLineOfNumbers(){
        
        int [] generatedLine = new int[25];

        for(int i = 0; i < 25; i++){
            if(generatedLine[i] == 0){
                while(true){
                    int generatedNumber = (int) (1+ Math.random() *60);
                    boolean aux = false;

                    for(int j = 0; j < i; j++){
                        if(generatedLine[i] == generatedLine[j])
                            aux = true;
                    }

                    if(aux)
                        ;
                    else {
                        generatedLine[i] = generatedNumber;
                        break;
                    }
                } 
            }
        }

        return generatedLine;
    }
}
