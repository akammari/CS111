/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {

        patients = null;
        survivabilityByAge = null;
        survivabilityByCause = null;
        // WRITE YOUR CODE HERE
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        return patients;
        // WRITE YOUR CODE HERE
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {

        return survivabilityByAge;
        // WRITE YOUR CODE HERE
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {

        return survivabilityByCause;
        // WRITE YOUR CODE HERE
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {

        patients = new Patient[numberOfLines];

        for (int i = 0; i < patients.length; i++) {

            int ID = StdIn.readInt();
            int Ethnicity = StdIn.readInt();
            int Gender = StdIn.readInt();
            int Age = StdIn.readInt();
            int Cause = StdIn.readInt();
            int Urgency = StdIn.readInt();
            int StateOfHealth = StdIn.readInt();


            patients[i] = new Patient(ID, Ethnicity, Gender, Age, Cause, Urgency, StateOfHealth);
        }
        // WRITE YOUR CODE HERE
    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {

        survivabilityByAge = new SurvivabilityByAge();

        for(int i = 0;i < numberOfLines;i++){

            int Age = StdIn.readInt();
            int Year = StdIn.readInt();
            double Rate = StdIn.readDouble();

            survivabilityByAge.addData(Age, Year, Rate);
        }
        // WRITE YOUR CODE HERE
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {

        survivabilityByCause = new SurvivabilityByCause();

        for(int i = 0;i < numberOfLines;i++){

            int Cause = StdIn.readInt();
            int Year = StdIn.readInt();
            double Rate = StdIn.readDouble();

            survivabilityByCause.addData(Cause, Year, Rate);
        }
        // WRITE YOUR CODE HERE
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {

        Patient[] patientsAboveAge;

        int l = 0;
        for (Patient patient : patients) {
            if(patient != null && patient.getAge() > age){
                l++;
            }
        }

        patientsAboveAge = new Patient[l];

        int i = 0;

        for (Patient patient : patients){
            if(patient != null && patient.getAge() > age){
                patientsAboveAge[i] = patient;
                i++;
            }
        }
        // WRITE YOUR CODE HERE
  
        return patientsAboveAge;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {

        Patient[] patientsByHeartConditionCause;

        int length = 0;

        for (Patient patient : patients){ 
            if(patient != null && patient.getCause() == cause){
                length++;
            }
        }

        patientsByHeartConditionCause = new Patient[length];

        int i = 0;

        for (Patient patient : patients){
            if(patient != null && patient.getCause() == cause){
                patientsByHeartConditionCause[i] = patient;
                i++;
            }
        }
        // WRITE YOUR CODE HERE
        return patientsByHeartConditionCause;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {

        Patient[] patientsByUrgency;

        int length = 0;

        for (Patient patient : patients){ 
            if(patient != null && patient.getUrgency() >= urgency){
                length++;
            }
        }

        patientsByUrgency = new Patient[length];

        int i = 0;

        for (Patient patient : patients){
            if(patient != null && patient.getUrgency() >= urgency){
                patientsByUrgency[i] = patient;
                i++;
            }
        }
        // WRITE YOUR CODE HERE
	return patientsByUrgency;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {
        Patient [] x = getPatientsByUrgency(8);
	// WRITE YOUR CODE HERE
    return x[StdRandom.uniform(0, x.length)];
    }
}
