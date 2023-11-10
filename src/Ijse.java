import java.util.Scanner;

class Ijse{

    static String[] StudentIdArray = new String[0];       // declaration ths static array for input id
    static String[] StudentNameArray = new String[0];     // declaration ths static array for input name
    static int[][] studentMarksArray = new int[0][2];      // declaration ths static 2d array for input marks
    static int[] TotalMarksArray = new int[0];         // declaration ths static array for keep tha total marks
    static int [] studentRankArray = new int[0];        // declaration ths static array for sorting the total marks







    public static void print(){                     // declaration the method for print main menu
        for (int i = 0; i < 85; i++) {
            System.out.print("-");
        }

        System.out.println();
        System.out.printf("|%-24s%-41s%18s|%n",(""),("WELCOME TO GDSE MARKS MANAGEMENT SYSTEM"),(""));
        for (int i = 0; i < 85; i++) {
            System.out.print("-");
        }

        System.out.println();

        System.out.println("[1] Add New Student"+"                     [2] Add New Student With Marks");
        System.out.println("[3] Add Marks"+"                           [4] Update Student Details");
        System.out.println("[5] Update Marks"+"                        [6] Delete Student ");
        System.out.println("[7] Print Student Details"+"               [8] Print Student Rank");
        System.out.println("[9] Best in Programming Fundamentals"+"    [10] Best in Database Management System");
        System.out.println();
        System.out.print("Enter an Option to Continue >");
    }

    public static void printHead(int numb){              // declaration the method for print topic
        if (numb == 1) {

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();

            System.out.println("|"+"                                ADD NEW STUDENT                                    "+"|");

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }

            System.out.println();

        }else if (numb == 2) {

            for (int i = 0;i < 85; i++) {

                System.out.print("-");
            }

            System.out.println();
            System.out.println("|"+"                               ADD NEW STUDENT WITH MARKS                          "+"|");

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }

            System.out.println();

        }else if (numb == 3) {

            for (int i = 0; i < 85; i++){

                System.out.print("-");
            }
            System.out.println();
            System.out.println("|"+"                                      ADD MARKS                                    "+"|");

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }

            System.out.println();

        }else if (numb == 4) {

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();
            System.out.println("|"+"                              UPDATE STUDENT DETAILS                               "+"|");
            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();

        }else if (numb == 5) {
            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }

            System.out.println();
            System.out.println("|"+"                                      UPDATE MARKS                                 "+"|");

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }

            System.out.println();

        }else if (numb == 6){
            for (int i = 0;i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();
            System.out.println("|"+"                                     DELETE STUDENT                                "+"|");

            for (int i = 0; i< 85; i++) {

                System.out.print("-");
            }

            System.out.println();

        }else if (numb == 7){
            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }

            System.out.println();
            System.out.println("|"+"                                  PRINT STUDENT DETAILS                            "+"|");

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();

        }else if (numb == 8) {

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();
            System.out.println("|"+"                                  PRINT STUDENT'S RANKS                            "+"|");

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();

        }else if (numb == 9) {

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();
            System.out.println("|"+"                          BEST IN PROGRAMMING FUNDAMENTALS                         "+"|");

            for (int i = 0; i < 85; i++){

                System.out.print("-");
            }

            System.out.println();

        }else if (numb == 10) {

            for (int i = 0; i < 85; i++) {

                System.out.print("-");
            }
            System.out.println();
            System.out.println("|"+"                           BEST IN DATABASE MANAGEMENT SYSTEM                      "+"|");

            for (int i = 0; i < 85; i++){

                System.out.print("-");
            }

            System.out.println();
        }
    }
    public final static void clearConsole() {               //declaration method for clear the codes
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();

        }
    }



    public static boolean isDuplicateId(String id){  // declaration this method for check the duplicate id

        for (int i = 0; i < StudentIdArray.length; i++) {

            if (StudentIdArray[i].equals(id)) {

                return true;
            }
        }

        return false;
    }




    public static void addNewStudentId() {              //declaration this method for input the id number and put in to the id array

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID : ");

        String id = input.next();

        boolean isDuplicate = isDuplicateId( id);              // check the id is it a duplicate?

        if (isDuplicate) {

            System.out.println("The student ID already exists");
            addNewStudentId();


        } else {

            String temp[] = new String[StudentIdArray.length + 1];
            for (int i = 0; i < StudentIdArray.length; i++) {
                temp[i] = StudentIdArray[i];
            }                                                      // input id , put in to the id array
            temp[temp.length - 1] = id;
            StudentIdArray = temp;
        }

    }
    public static void addNewStudentName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name :");
        String name = input.next();


        String []temp = new String[StudentNameArray.length+1];
        for (int i = 0; i < StudentNameArray.length; i++) {
            temp[i] = StudentNameArray[i];
        }
        temp[temp.length-1] = name;

        StudentNameArray = temp;



    }


    public static int inputPfMarks(){           // declaration this return type method for input the programming fundamental marks and check it
        Scanner scanner = new Scanner(System.in);
        int prfMarks;


        System.out.print("Programming Fundamental System Marks :");

        prfMarks = scanner.nextInt();

        if (prfMarks < 0 || prfMarks > 100) {// check the marks

            System.out.println("Invalid marks. Please enter correct marks");
            // Recursively call the method again to re-enter the marks
            prfMarks = inputPfMarks();

        }

        return prfMarks;

    }
    public static int inputDbMarks(){       // declaration this return type method for input the  database management system marks and check it
        Scanner scanner = new Scanner(System.in);

        int dbmsMarks;

        System.out.print("Database Management System Marks:");

        dbmsMarks = scanner.nextInt();

        if (dbmsMarks < 0 || dbmsMarks > 100) {      // check the marks

            System.out.println("Invalid marks. Please enter correct marks");
            // Recursively call the method again to re-enter the marks
            dbmsMarks = inputDbMarks();

        }

        return dbmsMarks;

    }

    public static void   addStudentWithMarks(int pfMarks, int dbsMarks) {  // declaration this method for marks put in to the 2d ar mark array
        if (studentMarksArray.length == 0) {

            studentMarksArray = new int[1][2];
            studentMarksArray[0][0] = pfMarks;
            studentMarksArray[0][1] = dbsMarks;

        } else {

            int[][] temp = new int[studentMarksArray.length + 1][2];
            for (int i = 0; i < studentMarksArray.length; i++) {
                temp[i][0] = studentMarksArray[i][0];
                temp[i][1] = studentMarksArray[i][1];
            }

            temp[temp.length - 1][0] = pfMarks;
            temp[temp.length - 1][1] = dbsMarks;
            studentMarksArray = temp;
        }

    }


    public static int searchId(){ //declaration for this method search student id from ar id array
        int index = -1;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID :");

        String id = scanner.next();

        for (int i = 0; i < StudentIdArray.length; i++) {

            if (StudentIdArray[i].equals(id)) {

                index = i;
                break;

            }
        }
        if (index == -1){
            System.out.print("Invalid Student ID . Do you want to search again(y/n)");
            String input = scanner.next();

            if (input.equals("y")){

                index = searchId();

            } else {
                clearConsole();
                print();
            }

        }
        return index;
    }





    public static void addMarksPrintName(int index){ // declaration this method for print student name


        System.out.println("Student name : "+ StudentNameArray[index]);
    }

    public static void addMarksSearch(int numb) {  //print if student who has been assigned marks previously

        Scanner scanner = new Scanner(System.in);

        System.out.println("This student's marks have been already added.");

        System.out.println("If you want to update the marks, please use [4] Update Marks option.");

        System.out.println();

        System.out.println("Do you want to add marks for another student? (y/n)");

        String input = scanner.next();

        if (input.equals("y")) {

            operation(numb);

        } else {

            clearConsole();
            print();
        }


    }

    public static void addMarks(int index,int pfMark,int dbsMarks) { //add the marks

        studentMarksArray[index][0] = pfMark;

        studentMarksArray[index][1] = dbsMarks;

    }

    public static void updateName(int index) { // declaration this method for update existing student details (Student Name)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the new student name :");

        String updateName = scanner.next();

        StudentNameArray[index] = updateName;

        System.out.println();

        System.out.println("Student details has been updated successfully");



    }

    public static void printNotAddMarks(int numb) { // print if  marks still haven’t been added

        Scanner scanner = new Scanner(System.in);


        System.out.println("This student marks yet to be added.");

        System.out.println("Do you want to update the mark of another student (y/n)");

        String input = scanner.next();

        if (input.equals("y")) {

            operation(numb);

        } else {

            clearConsole();
            print();
        }

    }

    public static void updatePrintMarks(int index) { // print current details.


        System.out.println("Programming Fundamental Marks :"+ studentMarksArray[index][0]);

        System.out.println("Database Management System Marks :"+ studentMarksArray[index][1]);

        System.out.println();


    }
    public static int updatePfMarks() { // update prf marks and check

        Scanner scanner = new Scanner(System.in);

        int pfMarks;


        System.out.print("Enter new Programming Fundamental System Marks :");

        pfMarks = scanner.nextInt();

        if (pfMarks < 0 || pfMarks > 100) {

            System.out.println("Invalid marks. Please enter correct marks");
            // Recursively call the method again to re-enter the marks
            pfMarks = inputPfMarks();

        }

        return pfMarks;
    }
    public static int updateDbMarks() {  // update dbms marks and check

        Scanner scanner = new Scanner(System.in);

        int dbmsMarks;

        System.out.print("Enter new Database Management System Marks:");

        dbmsMarks = scanner.nextInt();

        if (dbmsMarks < 0 || dbmsMarks >100) {

            System.out.println("Invalid marks. Please enter correct marks");
            // Recursively call the method again to re-enter the marks
            dbmsMarks = inputDbMarks();
        }


        return dbmsMarks;

    }

    public static void updateMarks(int index,int pfMarks,int dbsMarks) {  //add to update mark

        studentMarksArray[index][0] = pfMarks;

        studentMarksArray[index][1] = dbsMarks;

        System.out.println("Marks have been update successfully");

    }

    public static void deleteStudent(int index) { //declaration this method for delete student

        String[]tempId = new String[StudentIdArray.length-1];//declaration temp id array

        String[]tempName = new String[StudentNameArray.length-1];    //declaration temp name array

        int[][]tempMark = new int[StudentIdArray.length-1][2];        //declaration temp marks array

        for (int i = 0; i < StudentIdArray.length; i++) {

            if (i < index) {

                tempId[i] = StudentIdArray[i];

            } else if(i == index) {

                continue;

            } else {

                tempId[i-1] = StudentIdArray[i];

            }

        }

        for (int i = 0; i < StudentNameArray.length; i++) {

            if (i < index) {

                tempName[i] = StudentNameArray[i];

            } else if(i == index) {

                continue;

            } else {

                tempName[i-1] = StudentNameArray[i];

            }
        }

        for (int i = 0; i < StudentIdArray.length; i++) {

            if (i < index) {

                tempMark[i][0] = studentMarksArray[i][0];

                tempMark[i][1] = studentMarksArray[i][1];

            } else if (i == index) {

                continue;

            } else {

                tempMark[i-1][0] = studentMarksArray[i][0];

                tempMark[i-1][1] = studentMarksArray[i][1];

            }

        }

        StudentIdArray = tempId;

        StudentNameArray = tempName;

        studentMarksArray = tempMark;

        System.out.println("Student has deleted successfully.");

    }


    public static void printNullMarks(int numb) { // print If the student marks haven’t been added yet
        Scanner scanner = new Scanner(System.in);

        System.out.println("Marks yet to be added");

        System.out.print("Do you want to search another student details.(y/n)");

        String input = scanner.next();

        if (input.equals("y")) {

            operation(numb);

        } else {

            clearConsole();

            print();
        }



    }



    public static void createTotalArray(){ // declaration this method for get the total marks and declaration total marks array

        int[]temp = new int[StudentIdArray.length];



        for (int i = 0; i < StudentIdArray.length; i++){


            temp[i] = studentMarksArray[i][0]+ studentMarksArray[i][1];

        }

        TotalMarksArray = temp;

    }

    public static void createRankArray() { // sorting the total array
        int []temp = new int[StudentIdArray.length];

        int x;

        for (int i = 0; i< TotalMarksArray.length; i++){

            temp[i] = TotalMarksArray[i];
        }
        if (temp.length != 1) {

            for (int i = 0; i < temp.length - 1; i++) {

                for (int j = 0; j < temp.length - i - 1; j++) {
                    // sort from bubble sorting

                    if (temp[j] < temp[j + 1]) {

                        x = temp[j];

                        temp[j] = temp[j + 1];

                        temp[j + 1] = x;


                    }
                }

            }
        }

        studentRankArray = temp;

    }

    public static void printStudentDetails(int index) {

        double average = (double) TotalMarksArray[index]/2;

        int indexRank = -1;//find the rank index number

        int indLastRank = -1;//last rank index number

        System.out.print("+");

        for (int i = 0; i < 45; i++) {

            System.out.print("-");

        }

        System.out.print("+");

        for (int i = 0; i < 25; i++) {

            System.out.print("-");

        }

        System.out.println("+");

        System.out.printf("|%-45s|%25s|%n","programming fundamental Marks", studentMarksArray[index][0]);

        System.out.printf("|%-45s|%25s|%n","Database Management System Marks", studentMarksArray[index][1]);

        System.out.printf("|%-45s|%25s|%n","Total Marks", TotalMarksArray[index]);

        System.out.printf("|%-45s|%25s|%n","Avg. Marks",average);

        for (int i = 0; i < studentRankArray.length; i++) {

            if (TotalMarksArray[index] ==  studentRankArray[i]){   // check the student rank

                indexRank = i;

                break;

            }
        }


        if (indexRank == 0) {

            System.out.printf("|%-45s|%25s|%n","Rank",((indexRank+1)+"(First)"));

        } else if (indexRank == 1) {

            System.out.printf("|%-45s|%25s|%n","Rank",((indexRank+1)+"(Second)"));

        } else if (indexRank == 2) {

            System.out.printf("|%-45s|%25s|%n","Rank",((indexRank+1)+"(Third)"));

        } else if (indexRank >= 0) {

            for (int j = 0; j < studentRankArray.length; j++){
                if (studentRankArray[j] >= 0) {
                    // check last rank index
                    indLastRank = j;
                }


            } if(studentRankArray[indLastRank] == TotalMarksArray[index]) {

                System.out.printf("|%-45s|%25s|%n","Rank",((indLastRank+1)+"(Last)"));}

            else {
                System.out.printf("|%-45s|%25s|%n","Rank",(indexRank+1));
            }

        }


        System.out.print("+");

        for (int i = 0; i < 45; i++) {

            System.out.print("-");

        }

        System.out.print("+");

        for (int i = 0; i < 25; i++) {

            System.out.print("-");

        }

        System.out.println("+");

    }
    public static void printTableRank(int numb){ // declaration this method for print table structure
        if (numb == 8) {
            for (int i = 0; i < 2; i++) {

                System.out.print("+");

                for (int j = 0; j < 8; j++) {

                    System.out.print("-");

                }
            }

            System.out.print("+");

            for (int i = 0; i < 26; i++){

                System.out.print("-");
            }

            for (int i = 0; i < 2; i++) {

                System.out.print("+");

                for (int j = 0; j < 15; j++) {

                    System.out.print("-");

                }
            }

            System.out.println("+");

        } else if (numb == 9 | numb == 10) {

            System.out.print("+");

            for (int i = 0; i < 9; i++) {

                System.out.print("-");

            }

            System.out.print("+");

            for (int i = 0; i < 29; i++) {

                System.out.print("-");
            }

            System.out.print("+");

            for (int i = 0; i < 11; i++) {

                System.out.print("-");
            }

            System.out.print("+");

            for (int i = 0; i < 14; i++) {

                System.out.print("-");
            }

            System.out.println("+");

        }
    }
    public static void printStudentRank(int numb){
        printTableRank(numb);

        System.out.printf("|%-8s|%-8s|%-26s|%-15s|%-15s|%n"," Rank","  ID","   Name","Total Marks","Avg.Marks");

        printTableRank(numb);

        String[]tempId = new String[studentRankArray.length];//declaration temporary id array

        int[]tempTotals1 = new int[studentRankArray.length];

        for (int i = 0; i < TotalMarksArray.length; i++) {

            tempTotals1[i] = TotalMarksArray[i];       //declaration temporary total marks array
        }

        int index = -1;



        for (int i = 0; i < studentRankArray.length; i++) {

            for (int j = 0; j < studentRankArray.length; j++) {

                if (studentRankArray[i]==tempTotals1[j]){       //fin out what the id number for match the rank

                    tempId[i] = StudentIdArray[j];

                    index = j;

                    break;

                }

            }

            tempTotals1[index] = -1;


        }
        String[]tempName = new String[TotalMarksArray.length]; // //declaration temporary total marks array

        int[]tempTotals2 = new int[studentRankArray.length];//declaration temporary total marks array

        for (int i = 0; i < TotalMarksArray.length; i++) {

            tempTotals2[i] = TotalMarksArray[i];
            //copy the totals marks for temp totals array
        }



        for (int i = 0; i < studentRankArray.length; i++) {

            for (int j = 0; j < studentRankArray.length; j++) {

                if (studentRankArray[i] == tempTotals2[j]) {       //fin out what the name for match the rank

                    tempName[i] = StudentNameArray[j];

                    index = j;

                    break;


                }

            }

            tempTotals2[index] = -1;


        }


        double[]tempAvg = new double[studentRankArray.length];

        for (int i = 0; i < studentRankArray.length; i++) {

            tempAvg[i] = (double) studentRankArray[i]/2;        // //declaration temp avg array
        }

        int rank = -1;


        for (int i = 0; i < studentRankArray.length; i++){

            for (int j = 0; j < studentRankArray.length; j++){
                if (studentRankArray[i] == studentRankArray[j]){
                    rank = j;

                    break;

                } else {

                    rank = i;
                }
            }

            if (studentRankArray[i] >= 0) {

                System.out.printf("|%-8s|%-8s|%-26s|%15d|%15s|%n",(rank+1),tempId[i],tempName[i], studentRankArray[i],tempAvg[i]);
            }
        }

        printTableRank(numb);

    }

    public static int[] createRankPrfM() {
        //declare the PFM rank array

        int[]rankPfmArray = new int[StudentIdArray.length];

        int x;

        for (int i = 0; i < StudentIdArray.length; i++) {

            rankPfmArray[i] = studentMarksArray[i][0];
        }

        if (rankPfmArray.length != 1) {

            for (int i = 0; i < rankPfmArray.length - 1; i++) {

                for (int j = 0; j < rankPfmArray.length - 1 - i; j++) {          //sort rankPfmArray from using bubble sorting

                    if (rankPfmArray[j] < rankPfmArray[j + 1]) {

                        x = rankPfmArray[j];

                        rankPfmArray[j] = rankPfmArray[j + 1];

                        rankPfmArray[j + 1] = x;

                    }

                }

            }}

        return rankPfmArray;

    }

    public static void printBestPrfM(int[]rankPfmArray, int numb) {

        printTableRank(numb);

        System.out.printf("|%-9s|%-29s|%-11s|%-14s|%n","  ID","   Name","PF Marks","DBMS Marks");

        printTableRank(numb);

        String[]tempId = new String[rankPfmArray.length];////declaration  temporary id array

        int[]tempPrfM = new int[rankPfmArray.length]; //create temporary total marks array

        for (int i = 0; i < StudentIdArray.length; i++) {

            tempPrfM[i] = studentMarksArray[i][0];      //copy prf marks for temp prf marks array


        }

        int index = -1;



        for (int i = 0; i < rankPfmArray.length; i++){

            for (int j= 0; j < rankPfmArray.length; j++) {

                if (rankPfmArray[i] == tempPrfM[j]) {       //fin out what the id number for match the rank

                    tempId[i] = StudentIdArray[j];

                    index = j;

                    break;

                }

            }

            tempPrfM[index] = -1;

        }

        String[]tempName = new String[rankPfmArray.length];//create temporary name array

        int[]tempPrfM1 = new int[rankPfmArray.length];

        for (int i = 0; i < rankPfmArray.length; i++) {

            tempPrfM1[i] = studentMarksArray[i][0];       //create temporary prf marks array
        }




        for (int i = 0; i < rankPfmArray.length; i++) {

            for (int j = 0; j < rankPfmArray.length; j++) {

                if (rankPfmArray[i] == tempPrfM1[j]) {       //fin out what the name  for match the rank

                    tempName[i] = StudentNameArray[j];

                    index = j;

                    break;

                }

            }

            tempPrfM1[index] = -1;

        }

        int[]tempDbms = new int[rankPfmArray.length];//create temporary dbms array

        int[]tempPrfM2 = new int[rankPfmArray.length];

        for (int i = 0; i < rankPfmArray.length; i++) {

            tempPrfM2[i] = studentMarksArray[i][0];       //create temporary prf marks array
        }


        for (int i = 0; i < rankPfmArray.length; i++) {

            for (int j= 0; j < rankPfmArray.length; j++) {

                if (rankPfmArray[i] == tempPrfM2[j]){       //fin out what the dbms mark  for match the rank

                    tempDbms[i] = studentMarksArray[j][1];

                    index = j;

                    break;

                }

            }

            tempPrfM2[index] = -1;


        }

        for (int i = 0; i < rankPfmArray.length; i++) {

            if (rankPfmArray[i] >= 0) {

                System.out.printf("|%-9s|%-29s|%-11s|%-14s|%n",(" "+tempId[i]),(" "+tempName[i]),(" "+rankPfmArray[i]),(" "+tempDbms[i]));
            }
        }

        printTableRank(numb);



    }

    public static int[] createRankDbms() {

        int[]rankDbmsArray = new int[StudentIdArray.length];

        int x;

        for (int i = 0; i < StudentIdArray.length; i++){

            rankDbmsArray[i] = studentMarksArray[i][1];
        }
        if (rankDbmsArray.length != 1){

            for (int i = 0;i < rankDbmsArray.length-1; i++) {

                for (int j = 0;j < rankDbmsArray.length-1-i; j++){
                    //sort DbmsArray from using bubble sorting
                    if (rankDbmsArray[j] < rankDbmsArray[j+1]){

                        x = rankDbmsArray[j];

                        rankDbmsArray[j] = rankDbmsArray[j+1];

                        rankDbmsArray[j+1] = x;

                    }

                }



            }}
        return rankDbmsArray;

    }

    public static void printBestDbms(int[]rankDbmsArray,int numb) {

        printTableRank(numb);

        System.out.printf("|%-9s|%-29s|%-11s|%-14s|%n","  ID","   Name","DBMS Marks","PF Marks");

        printTableRank(numb);

        String[]tempId = new String[rankDbmsArray.length];//create temporary id array

        int[]temDbmsM = new int[rankDbmsArray.length];

        for (int i = 0; i < rankDbmsArray.length; i++) {

            temDbmsM[i] = studentMarksArray[i][1];       //copy dbms marks for array
        }
        int index = -1;


        for (int i = 0; i < rankDbmsArray.length; i++) {

            for (int j= 0;j<rankDbmsArray.length;j++) {

                if (rankDbmsArray[i] == temDbmsM[j]){       //fin out what the id number for match the rank

                    tempId[i] = StudentIdArray[j];

                    index = j;

                    break;



                }

            }
            temDbmsM[index] = -1;


        }
        String[]tempName = new String[rankDbmsArray.length];//create temporary name array

        int[]tempDbmsM1 = new int[rankDbmsArray.length];

        for (int i = 0; i < rankDbmsArray.length; i++) {

            tempDbmsM1[i] = studentMarksArray[i][1];        //copy dbms marks for array
        }




        for (int i = 0; i < rankDbmsArray.length; i++){

            for (int j= 0;j < rankDbmsArray.length; j++){

                if (rankDbmsArray[i] == tempDbmsM1[j]){       //fin out what the name  for match the rank

                    tempName[i] = StudentNameArray[j];

                    index = j;

                    break;



                }

            }
            tempDbmsM1[index] = -1;


        }

        int[]tempPrf = new int[rankDbmsArray.length];//create temporary prf array

        int[]tempDbmsM2 = new int[rankDbmsArray.length];

        for (int i = 0; i < rankDbmsArray.length; i++){

            tempDbmsM2[i] = studentMarksArray[i][1];       // //copy dbms marks for array
        }




        for (int i = 0; i < rankDbmsArray.length; i++){
            for (int j= 0; j < rankDbmsArray.length; j++){

                if (rankDbmsArray[i] == tempDbmsM2[j]){       //fin out what the prf mark  for match the rank

                    tempPrf[i] = studentMarksArray[j][0];

                    index = j;

                    break;



                }

            }
            tempDbmsM2[index] = -1;


        }
        for (int i = 0;i < rankDbmsArray.length; i++) {

            if (rankDbmsArray[i] >= 0){

                System.out.printf("|%-9s|%-29s|%-11s|%-14s|%n",(" "+tempId[i]),(" "+tempName[i]),(" "+rankDbmsArray[i]),(" "+tempPrf[i]));
            }
        }

        printTableRank(numb);



    }



    public static void cancelPrint(int numb){
        // declaration method for continue operation or again back to the main menu
        Scanner scanner = new Scanner(System.in);

        String input ;

        if(numb==1 | numb==2){
            System.out.println(" Do you want added a new student(y/n)");

            input = scanner.next();

            if (input.equals("y")) {

                operation(numb);

            }else if (input.equals("n")){

                clearConsole();

                print();
            }else {

                System.out.println("wrong input try again");

                cancelPrint(numb);
            }


        }else if(numb == 3){

            System.out.println(" Do you want to search again(y/n)");

            input = scanner.next();

            if (input.equals("y")){

                operation(numb);

            }else if (input.equals("n")){

                clearConsole();

                print();
            }else {

                System.out.println("wrong input try again");

                cancelPrint(numb);
            }

        }else if (numb == 4){

            System.out.println(" Do you want update another student details ?(y/n)");

            input = scanner.next();

            if (input.equals("y")){

                operation(numb);

            }else if (input.equals("n")){

                clearConsole();

                print();
            }else {

                System.out.println("wrong input try again");

                cancelPrint(numb);
            }
        }else if (numb == 5){

            System.out.println(" Do you want update mark for another student?(y/n)");

            input = scanner.next();

            if (input.equals("y")){

                operation(numb);

            }else if (input.equals("n")){

                clearConsole();

                print();
            }else {

                System.out.println("wrong input try again");

                cancelPrint(numb);
            }

        }else if (numb == 6){

            System.out.println(" Do you want to delete another student?(y/n)");

            input = scanner.next();

            if (input.equals("y")){

                operation(numb);

            }else if (input.equals("n")){

                clearConsole();

                print();
            }else {

                System.out.println("wrong input try again");

                cancelPrint(numb);
            }

        }else if (numb == 7){

            System.out.println(" Do you want to search another student details?(y/n)");

            input = scanner.next();
            if (input.equals("y")){

                operation(numb);

            }else if (input.equals("n")){

                clearConsole();

                print();
            }else {

                System.out.println("wrong input try again");

                cancelPrint(numb);
            }

        }else if (numb == 8 | numb == 9| numb == 10){

            System.out.println(" Do you want to go back to main menu?(y/n)");

            input = scanner.next();

            if (input.equals("n")){

                operation(numb);

            }else if (input.equals("y")){

                clearConsole();

                print();
            }else {

                System.out.println("wrong input try again");

                cancelPrint(numb);
            }

        }

    }


    public static void operation(int numb){             // this method is doing whole operation

        clearConsole();

        int prfMarks = -1;     //declaration the variables for programming fundamental marks and initialize -1

        int dbmsMarks = -1;    //declaration the variables for database management system  marks and initialize -1

        int index ;

        int [] prfMarksRankArray;

        int [] dbmsMarksRankArray;





        if (numb == 1) {      // add new student without marks

            printHead(numb);
            addNewStudentId();
            addNewStudentName();
            addStudentWithMarks(prfMarks,dbmsMarks);      //  who is entered the id without marks ,their marks initialize as -1.
            System.out.print("Student has been added successfully . ");
            cancelPrint(numb);



        }else if (numb == 2){    //add new student with marks
            printHead(numb);
            addNewStudentId();
            addNewStudentName();
            prfMarks = inputPfMarks(); // assign pf marks
            dbmsMarks =  inputDbMarks(); // assign dbs marks
            addStudentWithMarks(prfMarks,dbmsMarks);
            System.out.print("Student has been added successfully . ");
            cancelPrint(numb);

        }else  if(numb == 3){ // add marks

            printHead(numb);
            index =  searchId();
            if (index>=0){
                addMarksPrintName(index);
                if (studentMarksArray[index][0]!=-1){  // check the  student who has been assigned marks previously
                    addMarksSearch(numb);
                }else {
                    prfMarks = inputPfMarks();
                    dbmsMarks = inputDbMarks();
                    addMarks(index, prfMarks, dbmsMarks);
                    cancelPrint(numb);
                }


            }




        }else if (numb == 4){ // update student details

            printHead(numb);
            index =  searchId();
            if (index>=0){
                addMarksPrintName(index);
                updateName(index);
                cancelPrint(numb);
            }

        }

        else if (numb == 5){ // update marks
            printHead(numb);
            index = searchId();
            if (index>=0){
                addMarksPrintName(index);
                if (studentMarksArray[index][0]==-1){ // check whose marks still haven’t been added
                    printNotAddMarks(numb);
                }else {
                    updatePrintMarks(index);  // print current details
                    prfMarks = updatePfMarks();
                    dbmsMarks = updateDbMarks();
                    updateMarks(index,prfMarks,dbmsMarks);// add to array update marks
                    cancelPrint(numb);
                }
            }

        }else if (numb == 6){ // delete student
            printHead(numb);
            index = searchId(); // check the id
            if (index >= 0){
                deleteStudent(index);
                cancelPrint(numb);
            }
        }else if (numb == 7){  // print student details
            printHead(numb);
            index=searchId();
            if (index >= 0){

                addMarksPrintName(index);
                if (studentMarksArray[index][0] == -1){  //If the student marks haven’t been added yet
                    printNullMarks(numb);

                }else {
                    createTotalArray();
                    createRankArray();
                    printStudentDetails(index);
                    cancelPrint(numb);
                }

            }
        }else if (numb == 8){
            printHead(numb);
            createTotalArray();
            createRankArray();
            printStudentRank(numb);
            cancelPrint(numb);
        }else if (numb == 9){
            printHead(numb);
            prfMarksRankArray = createRankPrfM();
            printBestPrfM(prfMarksRankArray,numb);
            cancelPrint(numb);
        }else if (numb == 10){
            printHead(numb);
            dbmsMarksRankArray =  createRankDbms();
            printBestDbms(dbmsMarksRankArray,numb);
            cancelPrint(numb);
        }

    }





    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);


        print();
        int number;

        number = sc.nextInt();
        operation(number);


        while (true) {

            if (number<=0||number>10){

                clearConsole();
                print();
            }
            number = sc.nextInt();
            operation(number);


        }


    }}
