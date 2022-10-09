public class ExerciseFactory {
    public Exercise getExercise(String exerciseType)
    {
        if(exerciseType == null)
        {
            return null;
        }

        else if(exerciseType.equalsIgnoreCase("running"))
        {
            return new Running();
        }

        else if(exerciseType.equalsIgnoreCase("gymexercise"))
        {
            return new GymExercise();
        }

        else if(exerciseType.equalsIgnoreCase("swimming"))
        {
            return new Swimming();
        }
        return null;
    }
}

