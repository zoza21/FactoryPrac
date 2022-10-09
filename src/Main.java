class Main {
    public static void main(String[] args) {
    
        ExerciseFactory exerciseFactory = new ExerciseFactory();

        Exercise ex1 = exerciseFactory.getExercise("running");
        ex1.printExercise();

        Exercise ex2 = exerciseFactory.getExercise("swimming");
        ex2.printExercise();

        Exercise ex3 = exerciseFactory.getExercise("gymexercise");
        ex3.printExercise();
        
    }
}
