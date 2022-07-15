public class trailbranch{
    int answervalue = 0; // the answers can be 1 - 3
    int correctvalue = 0; // the correct answer can be 1 - 3
    int points = 0;
    int playerId; 
    int questionId;    //sam i think this corresponds with your numquestions varrible in the game class
    int answerchoice;
  
    
    public void answertracker(int playerId, int questionId, int answerchoice){
        this.playerId = playerId;
        this.questionId = questionId;
        this.answerchoice= answerchoice;
    }
    
    /* finds out how much the question is worth by using an answerkey array 
    * which contains the all the questions point values in an array and uses the questionID to locate the question
    */
    public void getPointvalue(int answerkey[]){
        int points = answerkey[questionId];
    }
    
    public boolean isCorrect(){
        if(answervalue ==correctvalue){
            return true;
        } 
        else 
            return false;
    }
    //can awards positive points (correct), negative points (incorrect)
    public int awardpoints(){
        if(isCorrect() == true){
            return points;
        }
        else{
            return (points * -1);
        }

    }
    public static void main(String args[]){
        //message
    }
    }