public class Running implements Exercise {

    @Override
    public String exName()
    {
        return "Running";
    }

    @Override
    public int trainingDays()
    {
        return 2;
    }

    @Override
    public void printExercise()
    {
        System.out.println("Exercise: Running. Training Days: 2"); 
    }
}
