public class Form {
    String userName;
    String studentName;
    String ca;
    String  practcal;
    String thory;
    public Form(String userName,String stName,String  ca,String practical,String theory){
        this.userName = userName;
        this.ca = ca;
        this.practcal = practical;
        this.studentName = stName;
        this.thory = theory;
    }

    @Override
    public String toString() {
        return "\n"+userName+"\t"+studentName+"\t"+ca+"\t"+practcal+"\t"+thory;
    }

    public String getUserName(){
        return userName;
    }
    public String getStudentName(){
        return studentName;
    }public String getCa(){
        return ca;
    }public String getPractcal(){
        return practcal;
    }public String getThory() {
        return thory;
    }

}
