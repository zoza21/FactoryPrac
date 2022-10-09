public class Swimming implements Exercise {

    @Override
    public String exName()
    {
        return "Swimming";
    }

    @Override
    public int trainingDays()
    {
        return 1;
    }

    @Override
    public void printExercise()
    {
        System.out.println("Exercise: Swimming. Training Days: 1"); 
    }

}

