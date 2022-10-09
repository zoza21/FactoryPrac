public class GymExercise implements Exercise {

    @Override
    public String exName()
    {
        return "Weights Training";
    }

    @Override
    public int trainingDays()
    {
        return 2;
    }

    @Override
    public void printExercise()
    {
        System.out.println("Exercise: Weights Training. Training Days: 2"); 
    }
}